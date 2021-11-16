import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * Write a description of class BalrogTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BalrogTest
{
    /**
     * Constructor for objects of class BalrogTest
     */
    public BalrogTest(){
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setUp(){
    }
    
    public void tearDown(){
    }
    
    public void tHpRange(){
        Balrog balrog1 = new Balrog();
        assertEquals(true, balrog1.checkHpRange());
    }
    
    public void tStrRange(){
        Balrog balrog1 = new Balrog();
        assertEquals(true, balrog1.checkStrRange());
    }
}
