package labSerialization;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * LabSerialization demonstrates how to serialize and deserialize a custom
 * object that references other objects on the heap. Author(s): Starter Code +
 * ........... // fill in your name
 */
public class LabSerialization {
	public static void main(String[] args) throws ClassNotFoundException {
		ListVsSetDemo demo = new ListVsSetDemo(new ColoredSquare(4, Color.RED), new ColoredSquare(6, Color.BLUE),
				new ColoredSquare(4, Color.RED), new ColoredSquare(8, Color.YELLOW));

		// displayListAndSet(demo);

		serialize(demo, "C:\\Users\\tyler\\eclipse-workspace\\1410_LABS\\src\\labSerialization\\Demo.ser");

		ListVsSetDemo newDemo = deserialize(
				"C:\\\\Users\\\\tyler\\\\eclipse-workspace\\\\1410_LABS\\\\src\\\\labSerialization\\\\Demo.ser");
		displayListAndSet(newDemo);

	}

	/**
	 * Displays the elements of the list and the set.
	 */
	private static void displayListAndSet(ListVsSetDemo demo) {
		System.out.println("List:");
		System.out.println(demo.getListElements());
		System.out.println("Set:");
		System.out.println(demo.getSetElements());
	}

	private static void serialize(ListVsSetDemo demo, String filename) {

		try (ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream(filename))) {

			ob.writeObject(demo);
			
			System.out.println("File has been created\n");

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	private static ListVsSetDemo deserialize(String filename) {
		
		ListVsSetDemo demo = null;

		try (ObjectInputStream ob = new ObjectInputStream(new FileInputStream(filename))) {

			demo = (ListVsSetDemo) ob.readObject();

		} catch (IOException | ClassNotFoundException e) {

			e.printStackTrace();
		}
		
		return demo;

	}

}
