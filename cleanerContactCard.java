import java.util.Scanner;


public class cleanerContactCard{

   public static void main(String[] args){

   String[] boundryAndInfo = {"Last Name: ", "Address Line 1: ", "Address Line 2: ", "City: ", "State: ", "Phone Number: ", "Email Address: ", "Height: ", "Job Title: ",
   "------------------------------------------", "Please enter the following information", "Thank You!", "CONTACT CARD"};
      
   int zipcode, age, weight;
   double income;
   String firstName;
   
   Scanner infoInput = new Scanner(System.in);
   Scanner integerInput = new Scanner(System.in);   
   
   /*Boundry Start*/  System.out.println(boundryAndInfo[9] + "\n" + boundryAndInfo[10] + "\n" + boundryAndInfo[9]);
   /*First Name*/     System.out.print("First Name: "); firstName = infoInput.nextLine();
                      while(true){ 
                      
                           //If the user inputs a name less than 2, forces them to reinput a name with 2 character or more.
                           if(firstName.length() < 2){
                              System.out.print("Your first name is too short, please enter a valid First Name: ");
                              firstName = infoInput.nextLine();
                           }          
                      else{        
   /*Last Name*/      System.out.print(boundryAndInfo[0]); boundryAndInfo[0] = infoInput.nextLine();
   /*Address 1*/      System.out.print(boundryAndInfo[1]); boundryAndInfo[1] = infoInput.nextLine();         
   /*Address 2*/      System.out.print(boundryAndInfo[2]); boundryAndInfo[2] = infoInput.nextLine();
   /*City*/           System.out.print(boundryAndInfo[3]); boundryAndInfo[3] = infoInput.nextLine();         
   /*State*/          System.out.print(boundryAndInfo[4]); boundryAndInfo[4] = infoInput.nextLine();
   /*Zip Code*/       System.out.printf("Zip Code: "); zipcode = integerInput.nextInt(); //Talk to John about, if they input a string or char, run through a loop to return and input valid numbers.
   /*Phone Number*/   System.out.print(boundryAndInfo[5]); boundryAndInfo[5] = infoInput.nextLine();                     
                      while(true){  
                        String phoneNumber = boundryAndInfo[5];
                           //If the user's phone number doesn't equal 10, forces them to reinput a phone number equal to 10(string-wise).
                           if(phoneNumber.length() != 10){
                              System.out.print("Please enter a valid Phone Number: "); 
                              boundryAndInfo[5] = infoInput.nextLine();
                        }
                      else{  
   /*Email Address*/  System.out.print(boundryAndInfo[6]); boundryAndInfo[6] = infoInput.nextLine();

                    
   /*Age*/            System.out.printf("Age: "); age = integerInput.nextInt();      
                         while(true){
                              //If the use inputs an age that is generally unrealistic, forces the user to reinput a legit age.
                              if((age > 130 || age < 1)){
                                 System.out.print("Impossible Age. Please enter a real Age: ");
                                 age = integerInput.nextInt();
                      }
                      else{                        
   /*Height*/         System.out.print(boundryAndInfo[7]); boundryAndInfo[7] = infoInput.nextLine();
   /*Weight*/         System.out.printf("Weight: "); weight = integerInput.nextInt();
   /*Job Title*/      System.out.print(boundryAndInfo[8]); boundryAndInfo[8] = infoInput.nextLine();
   /*Annual Salary*/  System.out.printf("Annual Salary: "); income = integerInput.nextDouble();
   /*Boundry End*/    System.out.println(boundryAndInfo[9] + "\n" + boundryAndInfo[11] + "\n" + boundryAndInfo[9] + "\n");
                      
                      
                      
                      
                  System.out.println(boundryAndInfo[9] + "\n" + boundryAndInfo[12] + "\n" +  boundryAndInfo[9]);
                  System.out.printf("Name: %s %s\nAddress Line 1: %s\nAddress Line 2: %s\nCity, State Zipcode: %s, %s %d\n%s\n", firstName, boundryAndInfo[0], boundryAndInfo[1], boundryAndInfo[2], boundryAndInfo[3], 
                  boundryAndInfo[4], zipcode, boundryAndInfo[9]);
                  System.out.printf("Phone Number: %s\nEmail Address: %s\n%s\n", boundryAndInfo[5], boundryAndInfo[6], boundryAndInfo[9]);
                  System.out.printf("Age: %d\t\tHeight: %s\t\tWeight: %d\n%s\n", age, boundryAndInfo[7], weight, boundryAndInfo[9]);
                  System.out.printf("Job Title: %s\nAnnual Income: $%,.2f\nMonthly Income: $%,.2f\nWeekly Income: $%,.2f\n%s", boundryAndInfo[8], income, (income/12), (income/52), boundryAndInfo[9]);
                      break;
                    }
                     
                 }
               break;
             } 
           }

        break; 
         }
       }
                  
                  

  
   }//public void
   
}//public class