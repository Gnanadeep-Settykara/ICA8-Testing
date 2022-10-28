/**
 * Title: ICA8 Testing
 * @author Gnanadeep Settykara
 **/
public class Urinals {
    public static void main(String args[]){
        //System.out.println("ICA8-Testing execution");
        MenUrinals mu = new MenUrinals();
        Integer i = mu.countUrinals("00001");
        System.out.println("Output is "+i);
    }
}
