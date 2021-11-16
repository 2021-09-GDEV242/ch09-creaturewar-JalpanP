import java.util.ArrayList;
/**
 * Write a description of class BattleSim here.
 *
 * @author (Jalpan Patel)
 * @version (11/15/21)
 */
public class BattleSim
{
    private ArrayList<Creature> armyOne;
    private ArrayList<Creature> armyTwo;
    
    private int armyOneSze;
    private int armyTwoSze;
    
    private int armyOneMxSze = 120;
    private int armyOneMnSze = 90;
    private int armyTwoMxSze = 60;
    private int armyTwoMnSze = 45;
    
    public boolean battle;

    public BattleSim(){
        armyOne = new ArrayList<Creature>();
        armyTwo = new ArrayList<Creature>();
        
        armyOneSze = Randomizer.nextInt((armyOneMxSze - armyOneMnSze) + armyOneMnSze);
        armyTwoSze = Randomizer.nextInt((armyTwoMxSze - armyTwoMnSze) + armyOneMnSze);
        
        for(int j = 0; j < armyOneSze; j++){
            armyOne.add(addArmyone());
        }
        
        for(int j = 0; j < armyTwoSze; j++){
            armyTwo.add(addArmytwo());
        }
        
        battle = true;
        Battle();
    }
    
    private void Battle(){
        while(battle && armyOne.get(0).isAlive() && armyTwo.get(0).isAlive()){
            armyOne.get(0).takeDamage(armyTwo.get(0).attack());
            armyTwo.get(0).takeDamage(armyOne.get(0).attack());
            
            if(armyOne.get(0).isKnockedOut()){
                armyOne.remove(0);
            }
            
            if(armyTwo.get(0).isKnockedOut()){
                armyTwo.remove(0);
            }
            
            if(armyOne.size() <= 0){
                battle = false;
                System.out.println("The army of Evil won, and demolished the Elves and Allies.");
            }
            
            if(armyTwo.size() <= 0){
                battle = false;
                System.out.println("The good Army won, and demolished the Demons.");
            }
            
            if(Randomizer.nextInt(10) == 10){
                System.out.println("No one was harmed in this battle.");
            }
        }
    }
    
    private Creature addArmyone(){
        Creature warrior;
        int rand =Randomizer.nextInt(12);
        
        if(rand <= 6){
            warrior = new Human();
        }
        else{
            warrior = new Elf();
        }
        
        return warrior;
    }
    
    private Creature addArmytwo(){
        Creature warrior;
        int rand = Randomizer.nextInt(25);
        
        if(rand <= 19){
            warrior = new Human();
        }
        else{
            warrior = new CyberDemon();
        }
        
        return warrior;
    }
}

