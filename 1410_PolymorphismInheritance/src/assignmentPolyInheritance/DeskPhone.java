package assignmentPolyInheritance;


public abstract class DeskPhone extends Phone {

	public boolean connected;
	private voltage Voltage;

	/**
	 * Settin parameters for model, dimension, Voltage
	 * 
	 * @param model
	 * @param dimension
	 * @param Voltage
	 */
	protected DeskPhone(String model, Dimension dimension, voltage Voltage) {

		super(model, dimension);

		this.Voltage = Voltage;

	}

	/**
	 * plugged in connected is true
	 * 
	 */
	public void plugIn() {

		connected = true;

	}

	/**
	 * not plugged in connected is false
	 * 
	 */
	public void unplug() {

		connected = false;

	}

	/**
	 * return connected
	 * 
	 * @return
	 */
	public boolean isConnected() {

		return connected;

	}

	@Override
	public String toString() {

		if (connected == true) {

			return super.toString() + " " + Voltage + " connected";

		} else {

			return super.toString() + " " + Voltage + " not connected";

		}
	}

}

