package docComments;
/**
 * Shows {make} {model} and {mpg} or car given. Also
 * shows trip {depart}{arrival}{distance}{model}
 * Gives total {fuel consumption} over the entire trip
 * 
 * @author tyler
 *
 */
public class TravelApp {

	public static void main(String[] args) {
		Car car1 = new Car("Mazda", "Mazdaspeed3", 22);
		Car car2 = new Car("Nissan", "Skyline GT-R34", 19);
		
		System.out.println("Cars:");
		System.out.println(car1.getMake() + " " + car1.getModel() + " " + car1.getMpg() + " mpg");
		System.out.println(car2.getMake() + " " + car2.getModel() + " " + car2.getMpg() + " mpg" + "\n");
		
		System.out.println("Oregon Trip:");
		TripPlanner trip1 = new TripPlanner("Eugene", "Portland", 109, "Mazdaspeed3");
		System.out.println(trip1);
		TripPlanner.fuelConsumption1(); System.out.printf("%n");
		
		
		
		System.out.println("Washington Trip:");
		TripPlanner trip2 = new TripPlanner("Spokane", "Seattle", 279, "Skyline GT-R34");
		System.out.println(trip2);
		TripPlanner.fuelConsumption2();
		
	}
}
