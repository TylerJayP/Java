package projectFinal;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.LinkedList;


public class TransactionHistory {
	

	public static void main(String[] args) throws IOException {
		
		LinkedList<TransactionSetUp> ll = new LinkedList<TransactionSetUp>();
		
		Scanner sc = new Scanner(System.in);
		Scanner scs = new Scanner(System.in);
		int choice;
		
		while(true) {
		
		mainMenu();
		choice = sc.nextInt();
		
		
		if (choice == 1) {
			
			menuOptionOne(ll);
			
		}else if(choice == 2) {
			
			menuOptionTwo(ll);
			
		}else if(choice == 3) {
			
			System.exit(0);
			
		}else if (choice > 3 || choice < 1){
			
			System.out.println("Sorry you chose an option that isn't available.");
			
		}
		
			System.out.println("Go back to main menu? 'Y' for yes, 'N' for no");
			String againOrNot = scs.nextLine();
			
			if(againOrNot.toUpperCase().contentEquals("N")) break;
		
	}
		
}

	public static void mainMenu() {
		
		System.out.println(" _____________________________");
		System.out.println("|**********Main Menu**********|");
		System.out.println("|-----------------------------|");
		System.out.println("|***List is currently empty***|");
		System.out.println("|1: View Customer History     |");
		System.out.println("|2: Add A New Customer        |");
		System.out.println("|3: Exit                      |");
		System.out.println("|_____________________________|");
		System.out.print(" Please Select 1-3: ");
		
	}
	
	public static void menuOptionOne(LinkedList<TransactionSetUp> ll) {
		
		System.out.println("\n\nCustomer History");
		System.out.println("------------------");
		
		
		String line = "";
		String split = ",";
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\tyler\\Desktop\\TransactionUsers.csv"),"UTF-8"));
			
			
			br.mark(1);
			if(br.read() != 0xFEFF) {
				br.reset();
			
				
		}
						
			while((line = br.readLine()) != null) {

				String[] customer = line.split(split);
				System.out.println("Customer " + customer[0] + ": " + customer[1] + " " + customer[2] + ", " + "Item Purchased: " + customer[3] + ", " + "Amount: $" + customer[4]);
	
	
				
			}
			
			br.close();
			
		}catch(IOException e) {
		
			e.printStackTrace();
		
		}
		
	}
	
	public static void menuOptionTwo(LinkedList<TransactionSetUp> ll) throws IOException {
		
		Scanner scr = new Scanner(System.in);
		Scanner sca = new Scanner(System.in);
				
		while(true) {
			
		System.out.println("\n\nAdd A New Customer");
		System.out.println("------------------------");
		
		System.out.print("Enter Customer Number: ");
		String customerNumber = scr.nextLine();
		System.out.println();
		
		System.out.print("Enter First Name: ");
		String fName = scr.nextLine();
		System.out.println();
		
		System.out.print("Enter Last Name: ");
		String lName = scr.nextLine();
		System.out.println();
		
		System.out.print("Enter Item Purchased: ");
		String itemPurchased = scr.nextLine();
		System.out.println();
		
		System.out.print("Enter Amount: ");
		String amount = scr.nextLine();
		
		TransactionSetUp tsu = new TransactionSetUp(customerNumber, fName, lName, itemPurchased, amount);
		
		ll.add(tsu);
		
		System.out.println("Customer " + customerNumber + ": " + fName + " " + lName + ", Item Purchased: " + itemPurchased + ", Amount: $" + amount);
		
		System.out.println("Would you like to add another person? 1 for yes, 0 no: ");
		int againOrNot = sca.nextInt();
		
		if(againOrNot == 0) {
			
			System.out.println();
			break;
		}
		
		}

	}
	

	
}

