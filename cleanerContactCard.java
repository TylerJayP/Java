import java.util.Scanner;


public class cleanerContactCard{

   public static void main(String[] args){

   String[] boundryAndInfo = {"Last Name: ", "Address Line 1: ", "Address Line 2: ", "City: ", "State: ", "Phone Number: ", "Email Address: ", "Height: ", "Job Title: ",
   "----------------------------------------", "Please enter the following information", "Thank You!", "CONTACT INFO"};
      
   int zipcode, age, weight;
   long income;//Doing long just incase someone has an insane salary.
   
   Scanner infoInput = new Scanner(System.in);
   Scanner integerInput = new Scanner(System.in);   
   
   /*Boundry Start*/  System.out.println(boundryAndInfo[9] + "\n" + boundryAndInfo[10] + "\n" + boundryAndInfo[9]);
   /*First Name*/     while(true){ 
                      String firstName = null;
                      
                        if(firstName == null){
                           System.out.print("First Name: ");
                           firstName = infoInput.nextLine();
                           
                           if(firstName.length() < 2){
                              System.out.print("Your first name is too short, please enter a valid First Name: ");
                              firstName = null;
                              continue;
                           }    
                       }     
                                 
   /*Last Name*/      System.out.print(boundryAndInfo[0]); boundryAndInfo[0] = infoInput.nextLine();
   /*Address 1*/      System.out.print(boundryAndInfo[1]); boundryAndInfo[1] = infoInput.nextLine();         
   /*Address 2*/      System.out.print(boundryAndInfo[2]); boundryAndInfo[2] = infoInput.nextLine();
   /*City*/           System.out.print(boundryAndInfo[3]); boundryAndInfo[3] = infoInput.nextLine();         
   /*State*/          System.out.print(boundryAndInfo[4]); boundryAndInfo[4] = infoInput.nextLine();
   /*Zip Code*/       System.out.printf("Zip Code: "); zipcode = integerInput.nextInt(); //Talk to John about, if they input a string or char, run through a loop to return and input valid numbers.
   /*Phone Number*/   System.out.print(boundryAndInfo[5]); boundryAndInfo[5] = infoInput.nextLine();                     
                      while(true){  
                        String phoneNumber = boundryAndInfo[5];
                           if(phoneNumber.length() != 10){
                              System.out.print("Please enter a valid Phone Number: "); 
                              boundryAndInfo[5] = infoInput.nextLine();
                        }
                      else{  
   /*Email Address*/  System.out.print(boundryAndInfo[6]); boundryAndInfo[6] = infoInput.nextLine();

                    
   /*Age*/            System.out.printf("Age: "); age = integerInput.nextInt();      
                         while(true){
                              if((age > 130 || age < 1)){
                                 System.out.print("Impossible Age. Please enter a real Age: ");
                                 age = integerInput.nextInt();
                      }
                      else{                        
   /*Height*/         System.out.print(boundryAndInfo[7]); boundryAndInfo[7] = infoInput.nextLine();
   /*Weight*/         System.out.printf("Weight: "); weight = integerInput.nextInt();
   /*Job Title*/      System.out.print(boundryAndInfo[8]); boundryAndInfo[8] = infoInput.nextLine();
   /*Annual Salary*/  System.out.printf("Annual Salary: "); income = integerInput.nextLong();
   /*Boundry End*/    System.out.println(boundryAndInfo[9] + "\n" + boundryAndInfo[11] + "\n" + boundryAndInfo[9]);
                      
                      break;
                    }
                     
                 }
               break;
             } 
                    
         }
        break; 
       }
       
       
  
   }//public void
   
}//public class