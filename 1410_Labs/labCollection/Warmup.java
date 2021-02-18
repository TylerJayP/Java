package labCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Warmup {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();

		for (int i = 2; i <= 50; i += 2) {

			numbers.add(i);

		}

		whatver(numbers);

		System.out.println("\nRemoving multiples of three...");

		numbers.removeIf(x -> x % 3 == 0);
			
		whatver(numbers);
		
		
		List<?> remove = Arrays.asList(1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9);
		
		int n = 2;


		
		for(int i = 0; i < remove.size(); i += n) {
			
			System.out.println(remove.get(i));
			
		}


	}

	public static void whatver(ArrayList<Integer> numbers) {

//		System.out.print("Numbers: ");
//		
//		numbers.forEach(e -> System.out.print(e + " "));
		
	}

}
