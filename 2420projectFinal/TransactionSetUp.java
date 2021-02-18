package projectFinal;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class TransactionSetUp {
	
	String customerNumber;
	String fName;
	String lName;
	String itemPuchased;
	String amount;

	
	
	public TransactionSetUp(String customerNumber, String fName, String lName, String itemPuchased, String amount) throws IOException  {
		
		this.customerNumber = customerNumber;
		this.fName = fName;
		this.lName = lName;
		this.itemPuchased = itemPuchased;
		this.amount = amount;
		
		
		addCustomer(customerNumber, fName, lName, itemPuchased, amount);
		
	}
	
	private static void addCustomer(String customerNumber, String fName, String lName, String itemPuchased, String amount) throws IOException {
			
		File fileName = new File("C:\\\\Users\\\\tyler\\\\Desktop\\\\TransactionUsers.csv");
		FileWriter csvWriter = new FileWriter(fileName, true);
		csvWriter.write(customerNumber + "," + fName + "," + lName + "," + itemPuchased + "," + amount + "\r\n");
		csvWriter.close();
		
	}
	



}
