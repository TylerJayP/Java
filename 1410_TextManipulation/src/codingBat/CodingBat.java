package codingBat;

public class CodingBat {

	
	
	public static String wordEnds(String str, String word) {
	     
		String nothing = "";
	    
		if(word.equals(str)) {
			return nothing;
		}
		
		if(str.startsWith(word)) {
			nothing = nothing + str.charAt(word.length());
		}
		
		for(int i = 1; i < (str.length() - word.length()); i++) {
			if(str.substring(i).startsWith(word)) {
				nothing = nothing + str.charAt(i-1) + str.charAt(i + word.length());
				i = i + word.length();
			}
		}
		
		if(str.endsWith(word)) {
			nothing = nothing + str.charAt(str.length() - word.length()-1);
		}
		
		return nothing;
	}	     
}
