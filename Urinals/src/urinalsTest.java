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
    }
