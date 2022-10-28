import java.io.*;
import java.util.Scanner;

public class MenUrinals {

    public int openFile(String path) {
        try{

            //Read from input file
            File file=new File(path);
            if(file==null)
                throw new IOException();
            //opening file to get the counter
            File cfile=new File("src/increment.txt");
            if(cfile==null)
                throw new IOException();
            Scanner c=new Scanner(cfile);
            int counter=Integer.parseInt(c.nextLine());
            //getting the output file
            String outputfile="src/rule.txt";
            if(counter!=0)
                outputfile="src/rule"+counter+".txt";
            //reading input file
            Scanner sc=new Scanner(file);
            while(sc.hasNextLine()){
                String s=sc.nextLine();
                if(s.equals("-1"))
                    break;
                int vacancies= countUrinals(s);
                writeToFile(outputfile,vacancies);

            }
            //increment the counter for next output file
            FileWriter cwriter=new FileWriter("src/increment.txt");
            if(cwriter==null)
                throw new IOException();
            cwriter.write(Integer.toString(counter+1));
            cwriter.close();

            System.out.println("Successfully written output to "+outputfile);
            return 1;
        }
        catch(IOException e)
        {
            System.out.println("Error in opening file");
            e.printStackTrace();
            return 0;
        }
    }

    public Integer countUrinals(String st)
    {
        //System.out.println("Implementation is not yet completed");
        boolean validity= goodString(st);
        if(!validity)
            return -1;
        String[] str=st.split("");
        int c=0; int len=str.length;
        int[] check =new int[len];
        for(int i=0;i<len;i++)
        {
            check[i]=Integer.parseInt(String.valueOf(str[i]));
        }
        if(len==1)
        {
            if(check[0]==0)
            {
                c=1;
                check[0]=1;
            }
        }
        else
        {
            int i=0;
            if(check[i]==0 && check[i+1]!=1)
            {
                check[i] = 1;
                c++;
            }
            for(i=1;i<len-1;i++)
            {
                if(check[i]==0 && check[i-1]!=1 && check[i+1]!=1)
                {
                    check[i]=1;
                    c++;
                }
            }
            if(check[i]==0&&check[i-1]!=1)
            {
                c++;
                check[i] = 1;
            }
        }
        return c;
    }


    public String getString()
    {

        return null;
    }

    public Boolean goodString(String st)
    {
        //System.out.println("Implemention is not yet complete");
        for (int i = 0; i < st.length(); i++)
        {
            if (st.charAt(i) != '0' && st.charAt(i) != '1')
            {
                return false;
            }
            int j=i+1;
            if (j< st.length())
            {
                if (st.charAt(i) == '1' && st.charAt(j) == '1')
                    return false;
            }

        }
        return true;
    }

    public int writeToFile(String outputfile,int vacancies){
        try {
            FileWriter writer = new FileWriter(outputfile, true);
            if(writer==null)
                throw new IOException();
            BufferedWriter bw=new BufferedWriter(writer);
            if(bw==null)
                throw new IOException();

            bw.write(Integer.toString(vacancies));
            bw.newLine();
            bw.close();
            return 1;
        }
        catch(IOException e){
            System.out.println("Error in opening the output file!");
            e.printStackTrace();
            return 0;
        }
        }

}
