package recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecusrionTest {

	@Test
	void testSumOfDigits_Test_One() {
		int expected = 7;
		int actual = Recusrion.sumOfDigits(-34);
		
		assertEquals(expected, actual);
		
	}

	@Test
	void testSumOfDigits_Test_Two() {
		int expected = 12;
		int actual = Recusrion.sumOfDigits(1038);
		
		assertEquals(expected, actual);
		
	}

	@Test
	void testSumOfDigits_Test_Three() {
		int expected = 3;
		int actual = Recusrion.sumOfDigits(12);
		
		assertEquals(expected, actual);
		
	}

	@Test
	void testSumOfDigits_Test_Four() {
		int expected = 11;
		int actual = Recusrion.sumOfDigits(56);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	void testSumOfDigits_Test_Five() {
		int expected = 26;
		int actual = Recusrion.sumOfDigits(2897);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	void testSumOfDigits_Test_Six() {
		int expected = 18;
		int actual = Recusrion.sumOfDigits(369);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	void testSumOfDigits_Test_Seven() {
		int expected = 6;
		int actual = Recusrion.sumOfDigits(42);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	void testSumOfDigits_Test_Eight() {
		int expected = 21;
		int actual = Recusrion.sumOfDigits(6852);
		
		assertEquals(expected, actual);
		
	}

	@Test
	void countSmiles_Test_One() {
		int expected = 2;
		int actual = Recusrion.countSmiles("[:,), ,L,i,f,e, ,i,s, ,g,o,o,d, ,:,)]".toCharArray(), 0);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	void countSmiles_Test_Two() {
		int expected = 3;
		int actual = Recusrion.countSmiles("[H,a,p,p,y, ,D,a,y, ,:,),:,),:,),!]".toCharArray(), 0);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	void countSmiles_Test_Three() {
		int expected = 0;
		int actual = Recusrion.countSmiles("[a,:,b,(,c,),:, ,),e]".toCharArray(), 0);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	void countSmiles_Test_Four() {
		int expected = 4;
		int actual = Recusrion.countSmiles("[a,c,d,:,),.,D,x,y,:,),e,f,:,),o,r,d,:,)]".toCharArray(), 0);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	void countSmiles_Test_Five() {
		int expected = 6;
		int actual = Recusrion.countSmiles("[:,),:,),:,),:,),:,),:,e,),:,)]".toCharArray(), 0);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	void countSmiles_Test_Six() {
		int expected = 1;
		int actual = Recusrion.countSmiles("[a,b,c,d,e,f,g,:,h,),i,j,k,:,l,),m,n,o,p,:,)]".toCharArray(), 0);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	void countSmiles_Test_Seven() {
		int expected = 0;
		int actual = Recusrion.countSmiles("[a,v,g,h,s,g,g,w,:,o]".toCharArray(), 0);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	void countSmiles_Test_Eight() {
		int expected = 4;
		int actual = Recusrion.countSmiles(":,),:,(,d,e,f,c,o,n,:,),:,),d,o,n,e,:,)]".toCharArray(), 0);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	void toUpper_Test_One() {
		String expected = "H O W   A R E   Y O U";
		String actual = Recusrion.toUpper("how are you");
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	void toUpper_Test_Two() {
		String expected = "D O I N G   E I G H T   T E S T S";
		String actual = Recusrion.toUpper("Doing eight tests");
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	void toUpper_Test_Three() {
		String expected = "W O W";
		String actual = Recusrion.toUpper("wow");
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	void toUpper_Test_Four() {
		String expected = "D I D   I   D O   I T   R I G H T";
		String actual = Recusrion.toUpper("dId I dO iT riGhT");
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	void toUpper_Test_Five() {
		String expected = "P R O G R A M M I N G   I S   C O O L";
		String actual = Recusrion.toUpper("Programming IS CoOl");
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	void toUpper_Test_Six() {
		String expected = "L O V E   Y O U R S E L F";
		String actual = Recusrion.toUpper("LOVE YOURSELF");
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	void toUpper_Test_Seven() {
		String expected = "O N E M O R E T E S T T O G O";
		String actual = Recusrion.toUpper("OneMoretesttoGO");
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	void toUpper_Test_Eight() {
		String expected = "D O N E";
		String actual = Recusrion.toUpper("DoNe");
		
		assertEquals(expected, actual);
		
	}
}
