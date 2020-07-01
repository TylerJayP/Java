package recursion;


public class Recusrion {
	public static void main(String[] args) {

		String in = "[H,a,p,p,y, ,D,a,y, ,:,),:,),:,),!]";

		in = in.replace(",", "");

		System.out.println(countSmiles(in.toCharArray(), 0));

	}

	public static int sumOfDigits(int n) {

		if (n == 0) {

			return 0;

		}

		return (Math.abs(n % 10) + Math.abs(sumOfDigits(n / 10)));

	}

	public static int countSmiles(char[] letters, int index) {

		if (index >= letters.length) {

			return 0;

		}

		if (letters[index] == ':' && letters[index + 2] == ')') {

			return 1 + countSmiles(letters, index + 1);

		} else {

			return countSmiles(letters, index + 1);

		}
	}

	public static String toUpper(String str) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {

			if (i > 0) {
				sb.append(" ");

			}

			sb.append(str.charAt(i));

		}

		return sb.toString().toUpperCase();
	}
}
