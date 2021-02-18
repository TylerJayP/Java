package labInterface;

/**
 * Hangglider class. What type of hangglider it is, how the hangglider launches and how the hangglider lands
 * 
 * @author tyler
 *
 */
public class Hangglider implements Flyable
{
	private final boolean isRigidWing;

	/**
	 * parameter set for rigid wing
	 * 
	 * @param rigidWing
	 */
	public Hangglider(boolean rigidWing)
	{
		isRigidWing = rigidWing;
	}

	/*
	 * Creating toString for Rigid wing or is it a Flex wing
	 * 
	 */
	@Override
	public String toString()
	{
		return String.format(isRigidWing ? "Rigid-wing" : "Flex-wing");
	}
	
	/**
	 * Overriding method launch() to what the hangglider does to take off
	 * 
	 */
	@Override
	public void launch() {
	
		System.out.println("Running until take-off");
		
	}
	
	/**
	 * Overriding method land() to what the hangglider does to land
	 * 
	 */
	@Override
	public void land() {
		
		System.out.println("Gliding to a land");
		
	}
}
