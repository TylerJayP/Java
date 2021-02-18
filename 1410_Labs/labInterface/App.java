package labInterface;

import java.util.ArrayList;

/**
 * Displaying everything
 * 
 * @author tyler
 *
 */
public class App
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		Plane myPlane = new Plane(4, "Boing 747");
		System.out.printf("myPlane: %s%n", myPlane);
		
		Hangglider myHangglider = new Hangglider(true);
		System.out.printf("myHangglider: %s%n", myHangglider);

		Bird myBird = new Bird("Swallow");
		System.out.printf("myBird: %s%n", myBird);
		
		System.out.println();
		
		ArrayList <Flyable> flyingThings = new ArrayList<Flyable>();
		flyingThings.add(myPlane);
		flyingThings.add(myHangglider);
		flyingThings.add(myBird);
		
		for(Flyable a : flyingThings) {
			
			System.out.println(a);
			
			if(a instanceof Plane) {
				
				myPlane.launch();
				myPlane.land();
				System.out.println();
				
			}
			
			if(a instanceof Hangglider) {
				
				myHangglider.launch();
				myHangglider.land();
				System.out.println();
				
			}
			
			if(a instanceof Bird) {
				
				myBird.launch();
				myBird.land();
				System.out.println();
				
			}
		}
	}
}
