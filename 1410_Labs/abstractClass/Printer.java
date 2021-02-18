package abstractClass;

/**
 * Printer abstract class
 * 
 * @author tyler
 *
 */
public abstract class Printer {

	private String model;
	private static int count;
	private int serialNumber;
	
	
	public Printer(String model) {
		
		this.model = model;
		
		count++;
		
		serialNumber = 12345 + count;
		
	}


	/**
	 * @return the model
	 */
	public String getModel() {
		
		return model;
		
	}


	/**
	 * @return the serialNumber
	 */
	public int getSerialNumber() {
		
		return serialNumber;
		
	}
	
	/**
	 *generalizing print being used across all 3 classes. 
	 * 
	 */
	public abstract void print();


	/**
	 * Returning string of how I want the class name, model, and serial number to be formatted.
	 * 
	 */
	@Override
	public String toString() {
	
		return this.getClass().getSimpleName() +": " + model + " #" + serialNumber;
		
	}
	
	
	
	
}
