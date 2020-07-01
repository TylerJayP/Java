package assignmentPolyInheritance;

/**
 * Phone class
 * 
 * @author tyler
 *
 */
public abstract class Phone {

	private String model;
	private Dimension dimention;
	
	
	/**
	 * parameters model and dimention
	 * 
	 * @param model
	 * @param dimention
	 */
	protected Phone(String model, Dimension dimention) {
		
		super();
		
		this.model = model;
		this.dimention = dimention;
		
	}

	/**
	 * returning number long
	 * 
	 * @param number
	 * @return
	 */
	public String call(long number) {
		
		return String.valueOf(number); 
	
	}
	
	
	@Override
	public String toString() {
		return model + " " + dimention;
	}
	
	
}
