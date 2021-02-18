package m02;

/**
 * PowerPlant class. Capacity and checking to make sure it's not negative.
 * 
 * @author tyler
 *
 */
public class PowerPlant {
	
	private int capacity;

	/**
	 * Creating parameter and constructor
	 * 
	 * @param capacity
	 */
	public PowerPlant(int capacity) {
	
		this.capacity = capacity;
		
		if(capacity < 0) {
			
			throw new IllegalArgumentException("The capacity needs to be a positive number");
			
		}
	}
	
	/**
	 * Returning generating electricity
	 * 
	 * @return
	 */
	public String generateElectricity(){
		
		return "generating electricity";
		
	}

	/**
	 * Returns a toString of how it's being generated and at what capacity
	 * 
	 */
	@Override
	public String toString() {
		
		return this.getClass().getSimpleName() + " " + capacity + "MW";
	}
	
	
}
