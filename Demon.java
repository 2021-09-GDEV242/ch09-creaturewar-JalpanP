
/**
 * Write a description of class Demon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Demon extends Creature
{
    /**
     * Constructor for objects of class Demon
     */
    public Demon()
    {
        super();
    }

    
    public Demon(int hp, int strenght){
        super(hp,strenght);
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int attack(){
        int damage = super.attack();
        int j = Randomizer.nextInt(20);
        if(j == 20){
            damage = damage + 50;
        }
        
        return damage;
    }
}
