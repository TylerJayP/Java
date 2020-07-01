package assignmentPolyInheritance;

/**
 * RotaryPhone extending Phone and creating toString
 * 
 * @author tyler
 *
 */
public class RotaryPhone extends DeskPhone {

	/**
	 * Setting parameters model, dimension, Voltage
	 * 
	 * @param model
	 * @param dimension
	 * @param Voltage
	 */
	public RotaryPhone(String model, Dimension dimension, voltage Voltage) {
		super(model, dimension, Voltage);
		
	}

	@Override
	public String call(long number) {
	
		return "Rotating the dial to call " + super.call(number);
		
	}

}
