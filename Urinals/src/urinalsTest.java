import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
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
    void testThree() {
        MenUrinals mu = new MenUrinals();
        System.out.println("====== GNANADEEP SETTYKARA == TEST THREE EXECUTED =======");
        Assertions.assertFalse(mu.openFile());
    }
    }
