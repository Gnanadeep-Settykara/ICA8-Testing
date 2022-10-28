import java.util.Scanner;

/**
 * Title: ICA8 Testing
 * @author Gnanadeep Settykara
 **/
public class Urinals {
    public static void main(String args[]){
        //System.out.println("ICA8-Testing execution");
        MenUrinals mu = new MenUrinals();
        Scanner sc=new Scanner(System.in);
        System.out.println("For Keyboard input, enter 1");
        System.out.println("For file input, enter 2");
        int ch=sc.nextInt();
        String s="";
        if(ch==1)
        {
            System.out.println("Enter your input");
            s=sc.next();
            int urinalCount= mu.countUrinals(s);
            if(urinalCount==-1)
                System.out.println("String is Invalid");
            else
                System.out.println(urinalCount);
        }
        else if(ch == 2)
        {
            mu.openFile("src/Urinal.dat");
        }
        else
        {
            System.out.println("Please enter either 1 or 2 ");
        }
    }
}
