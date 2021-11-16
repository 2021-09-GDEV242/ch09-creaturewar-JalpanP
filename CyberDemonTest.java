import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * Write a description of class CyberDemonTest here.
 *
 * @author (Jalpan Patel)
 * @version (11/15/21)
 */
public class CyberDemonTest
{
    /**
     * Constructor for objects of class CyberDemonTest
     */
    public CyberDemonTest()
    {
    }
    
    public void setUp(){
    }
    
    public void tearDown(){
    }
    
    public void tHpRange(){
        CyberDemon cyberDemon1 = new CyberDemon();
        assertEquals(true, cyberDemon1.checkHpRange());
        
    }
    
    public void tStrRange(){
        CyberDemon cyberDemon1 = new CyberDemon();
        assertEquals(true, cyberDemon1.checkStrRange());
    }
}
