
/**
 * Write a description of class DinoDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DinoDriver
{
    public static void main(String[] args)
    {
        TRex raagh = new TRex();
        TRex attack = new TRex();
        
        System.out.println(raagh.dinosaurString());
        System.out.println(attack.dinosaurString());
        System.out.println(raagh.attack(attack));
    }
}