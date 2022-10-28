import java.io.*;

public class MenUrinals {

    public boolean openFile(String p) {
        //System.out.println("Implementation is not yet completed");
        try
        {
            FileReader file = new FileReader(new File(p));
            BufferedReader br = new BufferedReader(file);
            String line = br.readLine();
            System.out.println(line);
            System.out.println("Urinals count : " + countUrinals(line));

            while (line != null) {
                line = br.readLine();
                if(line.equals("-1")){
                    break;
                }
                System.out.println(line);
                System.out.println("Urinals count : " + countUrinals(line));
            }
            return true;
        }
        catch (IOException ex) {
            return false;
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


}
