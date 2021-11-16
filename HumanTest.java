import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * Write a description of class HumanTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HumanTest
{
    /**
     * Constructor for objects of class HumanTest
     */
    public HumanTest(){
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
        Human human1 = new Human();
        assertEquals(true, human1.checkHpRange());
        
    }
    
    public void tStrRange(){
        Human human1 = new Human();
        assertEquals(true, human1.checkStrRange());
        
    }
}
