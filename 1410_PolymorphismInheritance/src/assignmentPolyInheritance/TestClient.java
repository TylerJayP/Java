package assignmentPolyInheritance;

import java.util.ArrayList;
import java.util.Random;

public class TestClient {

	public static void main(String[] args) {

		RotaryPhone myRotary = new RotaryPhone("Model 500", new Dimension(143, 208, 119), voltage.V110);
		PushButtonPhone myPush = new PushButtonPhone("Cortelco 2500", new Dimension(178, 228, 127), voltage.DUAL);
		SmartPhone mySmart = new SmartPhone("Pixel3", new Dimension(145.6, 68.2, 7.9), 128);
		SmartPhone myiPhone = new SmartPhone("iPhone8", new Dimension(138.4, 67.3, 7.3), 64);

		ArrayList<Phone> phones = new ArrayList<Phone>();
		phones.add(myRotary);
		phones.add(myPush);
		phones.add(mySmart);
		phones.add(myiPhone);

		
		for (Phone el : phones) {

			System.out.println(el);

		}

		System.out.println();
		
		myRotary.plugIn();
		myPush.plugIn();

		ArrayList<DeskPhone> randConnected = new ArrayList<DeskPhone>();
		randConnected.add(myRotary);
		randConnected.add(myPush);

		Random rand = new Random();

		int select = rand.nextInt(randConnected.size());

		randConnected.get(select).unplug();
		
		System.out.println("Array Elements");

		for (Phone el : phones) {
			
			System.out.println(el);
			System.out.println(el.call(8019574111L));
			
			if(el instanceof SmartPhone) {
				
				System.out.println(((SmartPhone) el).browse());
				System.out.println(((SmartPhone) el).takePicture());
				
			}
			
			
			System.out.println();
		
			
		}
		
		
		
	}

}
