/**
 * Write a description of class Balrog here.
 *
 * @author (Jalpan Patel)
 * @version (11/15/21)
 */
public class Balrog extends Demon
{
    // instance variables - replace the example below with your own
    private static final int maxbalrog_Hp = 200;
    private static final int maxbalrog_Str = 100;
    private static final int minbalrog_Hp = 80;
    private static final int minbalrog_Str = 50;
    
    /**
     * Constructor for objects of class Balrog
     */
    public Balrog()
    {
        super(Randomizer.nextInt(maxbalrog_Hp - minbalrog_Hp) + minbalrog_Hp,
            Randomizer.nextInt(maxbalrog_Str - minbalrog_Str) + minbalrog_Str);
    }    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int attack(){
        int damage = super.attack();
        damage = damage + super.attack();
        
        return damage;
    }
    
    public boolean checkHpRange(){
        return(getHealth() > minbalrog_Hp && getHealth() <= maxbalrog_Hp);
    }
    
    public boolean checkStrRange(){
        return(getStrenght() > minbalrog_Str && getStrenght() <= maxbalrog_Str);
    }
}
