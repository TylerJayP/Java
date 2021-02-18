package labInterface;

/**
 * Plane class. What plane it is, how the plane launches and how the plane lands
 * 
 * @author tyler
 *
 */
public class Plane implements Flyable
{
	private final int numberOfEngines;
	private final String model;

	/**
	 * Giving parameters for engine and model
	 * 
	 * @param engines
	 * @param m
	 */
	public Plane(int engines, String m) {
		
		numberOfEngines = engines;
		model = m;
		
	}

	/*
	 * Creating a toString for model and number of engines
	 * 
	 */
	@Override
	public String toString(){
		
		return String.format("%s with %d engines", model, numberOfEngines);
		
	}
	
	/**
	 * Overriding method launch() to what the plane does to take off
	 * 
	 */
	@Override
	public void launch() {
		
		String a = "Rolling until take-off";
		System.out.println(a);
		
	}
	
	/**
	 * Overriding method land() to what the plane does to land
	 * 
	 */
	@Override
	public void land() {
		
		System.out.println("Rolling to a stop");
		
	}

	public static String launch(String string) {
		
		string = "Rolling until take-off";
		System.out.println(string);
		
		return string;
		
	}
	
	public static String land(String string) {
		
		string = "Rolling to a stop";
		System.out.println(string);
		
		return string;
		
	}
}
