package docComments;
/**
 * Gets where car departs and arrives from. Also gets distance traveled and how much fuel was consumed
 * 
 * @author tyler
 *
 */
public class TripPlanner {
	
	String departure, arrival;
	double distance;
	String car;
	
	/**
	 * Creating constructors for {departure}{arrival}{distance}{car}
	 * 
	 * @param departure
	 * @param arrival
	 * @param distance
	 * @param car
	 */
	public TripPlanner(String departure, String arrival, double distance, String car) {
		this.departure = departure;
		this.arrival = arrival;
		this.distance = distance;
		this.car = car;
	}
	
	@Override
	public String toString() {
		return "TripPlanner [departure=" + departure + ", arrival=" + arrival + ", distance=" + distance + ", car="
				+ car + "]";
	}
	
	/**
	 * Returns total fuel consumption for car one from {departure} to {arrival}
	 * 
	 * @return
	 */
	public static double fuelConsumption1() {
		
		Car car1 = new Car("Mazda", "Mazdaspeed3", 22);
		TripPlanner trip1 = new TripPlanner("Eugene", "Portland", 109, "Mazdaspeed3");
		
		double car1Consumption = ((trip1.distance/car1.getMpg()));
		
		System.out.printf("Fuel consumption: %.2f gallons\n", car1Consumption);
		
		return car1Consumption;
	}
	
	/**
	 * Returns fuel consumption for car two from {departure} to {arrival}
	 * 
	 * @return
	 */
	public static double fuelConsumption2() {
		
		Car car2 = new Car("Nissan", "Skyline GT-R34", 19);
		TripPlanner trip2 = new TripPlanner("Spokane", "Seattle", 279, "Skyline GT-R34");
		
		double car2Consumption = ((trip2.distance/car2.getMpg()));
		
		System.out.printf("Fuel consumption: %.1f gallons\n", car2Consumption);
		
		return car2Consumption;
		
	}
}
