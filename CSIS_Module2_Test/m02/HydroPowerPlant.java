package m02;

/**
 * HydroPowerPlant class. Has a dam, says with a dam, if not doesn't. 
 * 
 * @author tyler
 *
 */
public class HydroPowerPlant extends PowerPlant {

	private boolean dam;
	
	/**
	 * Creating parameters for capacity and dam and constructor
	 * 
	 * @param capacity
	 * @param dam
	 */
	public HydroPowerPlant(int capacity, boolean dam) {
		
		super(capacity);
		
		this.dam = dam;
		
	}

	/**
	 * Retuns dam if it has a dam
	 * 
	 * @return
	 */
	public boolean hasDam() {
		
		return dam == true;
		
	}
	
	/**
	 * 
	 * Returning how HydroPowerPlant generates water, but overriding PowerPlant
	 * 
	 */
	@Override
	public String generateElectricity() {
		
		return "generating electricity from water";
		
	}
	
	/**
	 * 
	 * Overriding PowerPlant toString method
	 * 
	 */
	@Override
	public String toString() {

		if(hasDam()) {
			
			return super.toString() + " with a dam";
			
		}else {
			
			return super.toString() + " without a dam";
			
		}
	
	
}
}
