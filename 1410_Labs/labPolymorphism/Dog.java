package labPolymorphism;


/**
 * Dog class giving breed, how it moves, and communicates
 * 
 * @author CSIS 1410 Tyler
 *
 */
public class Dog
{
		
    private final String breed;

    public Dog(String b)
    {
        breed = b;
    }

    public void communicate()
    {
        System.out.println("bark bark");
    }

    public void move()
    {
        System.out.println("run");
    }

    public String getBreed()
    {
        return breed;
    }

	@Override
	public String toString() {
		
		
		return this.getClass().getSimpleName() + ": " + breed;
		
	}
	
	
    
}
