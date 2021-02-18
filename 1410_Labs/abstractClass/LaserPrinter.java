package abstractClass;

/**
 * LaserPrinter class. getting toner and refilling toner. Creating print when out of toner or reducing toner by 10 each print.
 * 
 * @author tyler
 *
 */
public class LaserPrinter extends Printer {
	
	private int remainingToner;

	public LaserPrinter(String model) {
		super(model);

		remainingToner = 100;
	}
	
	/**
	 * Returns the reaminingToner
	 * 
	 * @return the remainingToner
	 */
	public int getRemainingToner() {
		
		return remainingToner;
		
	}

	/**
	 *initializing remainingToner
	 * 
	 */
	public void refillToner() {
		
		this.remainingToner = 100;
		
	}
	
	/**
	 * Overriding print method in Printer class.
	 * 
	 */
	@Override
	public void print() {
		
		if(remainingToner == 0) {
			System.out.println("The toner is empty.");
		}else {
			remainingToner = remainingToner - 10;
			System.out.println(getModel() + " is printing. Remaining toner: " + remainingToner);
		}
		
		
		
		
	}

	
		
}

	