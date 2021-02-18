package m02;

/**
 * WindFarm. How the windfarm generates electricty and if it's offshore adds onto the toString
 * 
 * @author tyler
 *
 */
public class WindFarm extends PowerPlant {

	private boolean offshore;
	
	/**
	 * Creating parameter and constructor
	 * 
	 * @param capacity
	 */
	public WindFarm(int capacity, boolean offshore) {
		
		super(capacity);
		
		this.offshore = offshore;
		
	}

	/**
	 * Returns offshore... **Need to make statement**
	 * 
	 * @return
	 */
	public boolean offShore() {
		
		return offshore == true;
		
	}
	
	/**
	 * 
	 * Overriding PowerPlant generateElectricity()
	 * 
	 */
	@Override
	public String generateElectricity() {
		
		return "generating electricity from the wind";
		
	}
	
	/**
	 * Overridding PowerPlant toString
	 * 
	 */
	@Override
	public String toString() {
		
		if(offShore()) {
			
			return super.toString() + " ~~~";
			
		}else {
			
			return super.toString();
			
		}
		
		
	
	
}
}
