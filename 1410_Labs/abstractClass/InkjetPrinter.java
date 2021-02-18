package abstractClass;

/**
 * InkjetPrinter class. getting cartridge and refilling cartridge. Creating print when cartridge is out or reducing amount
 * of the cartridge by 10 each print.
 * 
 * @author tyler
 *
 */
public class InkjetPrinter extends Printer {

	private int remainingCartridge;
	
	public InkjetPrinter(String model) {
		super(model);
		
		remainingCartridge = 100;
	}

	/**
	 * Returns the remainingCartridge
	 * 
	 * @return the remainingCartridge
	 */
	public int getRemainingCartridge() {
		
		return remainingCartridge;
		
	}
	
	/**
	 * Initializing remainingCartridge
	 * 
	 */
	public void refillCartridge() {
		
		this.remainingCartridge = 100;
		
	}

	/**
	 * Overriding print from Printer class to if cartridge is empty, display empty
	 * or reduce amount inside of cartridge by 10 every print until 0
	 * 
	 */
	@Override
	public void print() {
		
		if(remainingCartridge == 0) {
			System.out.println("The cartridge is empty.");
		}else {
			remainingCartridge = remainingCartridge - 10;
			System.out.println(getModel() + " is printing. Remaining cartridge: " + remainingCartridge);
		}
		
		
		
		
	}


	
}

