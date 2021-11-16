import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * Write a description of class ElfTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElfTest
{
    /**
     * Constructor for objects of class ElfTest
     */
    public ElfTest()
    {
        
        
    }
    
    public void setUp(){
    }
    
    public void tearDown(){
    }

    public void tHpRange(){
        Elf elf1 = new Elf();
        assertEquals(true, elf1.checkHpRange());
    }
    
    public void tStrRange(){
        Elf elf1 = new Elf();
        assertEquals(true, elf1.checkStrRange());
    }
}
