package docComments;

/**
 * Provides Car {make} {model} and {mpg}
 * 
 * @author tyler
 *
 */
public class Car {
	
	String make, model;
	double mpg;
	
	/**
	 * @param make
	 * @param model
	 * @param mpg
	 */
	public Car(String make, String model, double mpg) {
		this.make = make;
		this.model = model;
		this.mpg = mpg;
	}
	
	/**
	 * Returns the make of the vehicle
	 * 
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * Returns the model of the vehicle
	 * 
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * Returns the miles per gallon of the vehicle
	 * 
	 * @return the mpg
	 */
	public double getMpg() {
		return mpg;
	}
}
