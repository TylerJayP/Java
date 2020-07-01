package assignmentPolyInheritance;

import java.util.Random;

/**
 * smart phone class
 * 
 * @author tyler
 *
 */
public class SmartPhone extends Phone {
	
	private int storage;
	

	/**
	 * setting parameters for model, dimention, and storage
	 * 
	 * @param model
	 * @param dimention
	 * @param storage
	 */
	public SmartPhone(String model, Dimension dimention, int storage) {
		
		super(model, dimention);
			
		this.storage = storage;
		
		if(storage <= 0) {
			throw new IllegalArgumentException("Storage needs to be assigned a positive value");
		}
	}

	
	@Override
	public String call(long number) {
		
		return "Calling " + String.valueOf(number) + " by selecting the number";
					
	}
	
	/**
	 * returning browsing the web
	 * 
	 * @return
	 */
	public String browse() {
		
		return "Browsing the web";
		
	}
	
	/**
	 * returning randomly selected orientation of picture
	 * 
	 * @return
	 */
	public String takePicture() {
		
		String[] pictureOrientation = {"Taking a horizontal picture", "Taking a vertical picture"};
		
		Random rand = new Random();
		
		int select = rand.nextInt(pictureOrientation.length);
		
		return pictureOrientation[select];
	}


	@Override
	public String toString() {
		
	return super.toString() + " " + storage + "GB";
		
	}
	
	

}
