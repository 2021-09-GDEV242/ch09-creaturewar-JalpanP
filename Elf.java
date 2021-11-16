
/**
 * Write a description of class Elf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own
    private static final int maxelf_Hp = 25;
    private static final int maxelf_Str = 18;
    private static final int minelf_Hp = 8;
    private static final int minelf_Str = 5;
    
    /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
        // initialise instance variables
        super(Randomizer.nextInt(maxelf_Hp - minelf_Hp) + minelf_Hp, 
              Randomizer.nextInt(maxelf_Str - minelf_Str) + minelf_Str);
                    
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int attack()
    {
        int damage = super.attack();
        int j = Randomizer.nextInt(10);
        if( j == 10){
            damage = damage * 2;
        }
        
        return damage;
    }
    
    public boolean checkHpRange(){
        return(getHealth() > minelf_Hp && getHealth() <= maxelf_Hp);
    }
    
    public boolean checkStrRange(){
        return(getStrenght()> minelf_Str && getStrenght() <= maxelf_Str);
    }
}
