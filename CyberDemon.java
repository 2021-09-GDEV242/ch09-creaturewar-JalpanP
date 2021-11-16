/**
 * Write a description of class CyberDemon here.
 *
 * @author (Jalpan Patel)
 * @version (11/15/21)
 */
public class CyberDemon extends Demon
{
    // instance variables - replace the example below with your own
    private static final int maxcyberdemon_Hp = 100;
    private static final int maxcyberdemon_Str = 40;
    private static final int mincyberdemon_Hp = 25; 
    private static final int mincyberdemon_Str = 20;
    
    /**
     * Constructor for objects of class CyberDemon
     */
    public CyberDemon()
    {
        super(Randomizer.nextInt(maxcyberdemon_Hp - mincyberdemon_Hp) + mincyberdemon_Hp, 
            Randomizer.nextInt(maxcyberdemon_Str - mincyberdemon_Str) + mincyberdemon_Str);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean checkHpRange(){
        return(getHealth() > mincyberdemon_Hp && getHealth() <= maxcyberdemon_Hp);
    }
    
    public boolean checkStrRange(){
        return(getStrenght() > mincyberdemon_Str && getStrenght() <= maxcyberdemon_Str);
    }
    
}
