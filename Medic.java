/**
 * A superclass of Doctor and Nurse
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Medic extends Person
{
    /**
     * Constructor of Medic. Setting the name and title of the medic
     * @param name the name of the person 
     */
    public Medic(String name, String title)
    {
        super(name, title);
    }
    
    /**
     * Return the title and name of this medic from Person.
     * @return The title and name of this medic from Person.
     */
    public String toString()
    {
        return super.toString();
    }
}
