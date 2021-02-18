package keyValue;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestClient {

	public static void main(String[] args) {
		
		KeyValuePair<String, Integer> p1 = new KeyValuePair<>("SLC", 189899);
		KeyValuePair<String, Integer> p2 = new KeyValuePair<>("NY", 8244910);
		KeyValuePair<String, Integer> p3 = p2;
		KeyValuePair<String, Integer> p4 = new KeyValuePair<>("LA", 3819702);
		KeyValuePair<String, Integer> p5 = new KeyValuePair<>("SF", 812826);
		
		KeyValuePair<Integer, String> c1 = new KeyValuePair<>(33, "France");
		KeyValuePair<Integer, String> c2 = new KeyValuePair<>(43, "Austria");
		KeyValuePair<Integer, String> c3 = new KeyValuePair<>(30, "Greece");

		
		List<KeyValuePair<String, Integer>> cities = Arrays.asList(p1, p2, p3, p4, p5);
		List<KeyValuePair<Integer, String>> codes = Arrays.asList(c1, c2, c3);
		
		System.out.println("Part 1:\n" + "-------");
		

		
		System.out.println("p1: " + p1 + "\n" + "p2: " + p2);
		System.out.println("p1.equals(p2): " + p1.equals(p2));
		
	
		
		System.out.println();
		System.out.println("p3: " + p3);
		System.out.println("p2.equals(p3): " + p2.equals(p3));
		
		System.out.println();
		
		System.out.println("Part 2: \n-------");
		System.out.println("Original List:");

		
		for(KeyValuePair<String, Integer> el: cities) {
			
			System.out.println(el);
			
		}

		System.out.println("\nSorted List:");
		
		Collections.sort(cities);
		
		for(KeyValuePair<String, Integer> el: cities) {
			
			System.out.println(el);
			
		}
		
		
		System.out.println();
		
		System.out.println("Part 3:\n-------");
		System.out.println("Cities with margins of 5");
		
		
		printWithMarging(cities, 5);
		
		System.out.println("\nCountry codes with margins of 3");
	
		printWithMarging(codes, 3);

	}
	
	public static <T> void printWithMarging(Collection<T> collection, int indentation) {
		
		
		
		for(T el: collection) {
			
			System.out.printf("%" + indentation + "s %s%n", "", el);
			
		}
		
	}

}
