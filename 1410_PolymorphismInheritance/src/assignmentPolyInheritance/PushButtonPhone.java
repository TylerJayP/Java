package assignmentPolyInheritance;

/**
 * PushButtonPhone returning pushing buttons to call given phone number
 * 
 * @author tyler
 *
 */
public class PushButtonPhone extends DeskPhone {

	/**
	 * Setting parameters model, dimension, Voltage
	 * 
	 * @param model
	 * @param dimension
	 * @param Voltage
	 */
	public PushButtonPhone(String model, Dimension dimension, voltage Voltage) {
		
		super(model, dimension, Voltage);
		
	}

	@Override
	public String call(long number) {
		
		return "Pushing buttons to call " + super.call(number);
				
	}

}
