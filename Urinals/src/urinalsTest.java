import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class urinalsTest {
    
    @Test
    void testOne() {
        MenUrinals mu = new MenUrinals();
        boolean ex = mu.goodString("Gnanadeep Settykara");
        System.out.println("====== GNANADEEP SETTYKARA == TEST ONE EXECUTED =======");
        Assertions.assertFalse(ex);
        }

    @Test
    void testTwo() {
        MenUrinals mu = new MenUrinals();
        Integer i = mu.countUrinals("1000");
        System.out.println("====== GNANADEEP SETTYKARA == TEST TWO EXECUTED =======");
        Assertions.assertEquals(1,i);
    }

    @Test
    void testThree(){
        MenUrinals mu= new MenUrinals();
        Assertions.assertEquals(1,mu.openFile("src/urinal.dat"));
        System.out.println("====== GNANADEEP SETTYKARA == TEST THREE EXECUTED =======");
    }

    @Test
    public void testWriteToFile(){
        String append="src/rule.txt";
        MenUrinals mu= new MenUrinals();
        Assertions.assertEquals(1,mu.writeToFile(append,3));
        System.out.println("====== GNANADEEP SETTYKARA == TEST FOUR EXECUTED =======");
    }
    }
