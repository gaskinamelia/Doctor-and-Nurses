
/**
 * A superclass of Medic and Person
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{  
    private String title;
    private String name;
    /**
     * Constructor of Person. Setting the name and title of the person
     * @param name the name of the person
     * the title is set to nothing. 
     */
    public Person(String name, String title)
    {
        this.title = title;
        this.name = name;
    }

    /**
     * Return the person's title.
     * @return The title of this person.
     */
    protected String getTitle()
    {
        return title;
    }
        
    /**
     * Return the person's name.
     * @return The name of this person.
     */
    protected String getName()
    {
        return name;
    }
    
    /**
     * Change the title of the person
     * @param newTitle the title the person is changing to.
     */
    protected void changeTitle(String newTitle)
    {
        title = newTitle;       
    }
    
        
    /**
     * Return the title and name of this person.
     * @return The title and name of this person.
     */
    public String toString()
    {
        return title + " " + name;
    }


}
