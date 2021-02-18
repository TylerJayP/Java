package labInterface;

/**
 * Bird class. What bird it is, how the bird launches and how the bird lands
 * 
 * @author tyler
 *
 */
public class Bird implements Flyable
{
	private final String type;

	/**
	 * parameter given for String t which is type of bird
	 * 
	 * @param t
	 */
	public Bird(String t)
	{
		type = t;
	}

	/**
	 * return type of bird
	 * 
	 */
	@Override
	public String toString()
	{
		return type;
	}

	/**
	 * Overriding method launch() to what the bird does to take off
	 * 
	 */
	@Override
	public void launch() {
		
		System.out.println("Flapping the wings to take-off");
		
	}

	/**
	 * Overriding method land() to what the bird does to land
	 * 
	 */
	@Override
	public void land() {
		
		System.out.println("Flapping the wings until landing");
		
	}
}
