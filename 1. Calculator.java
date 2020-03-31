// Code reviewed by @professorgordon
import java.util.*;
import java.util.Scanner;

public class Calculator {

   public static void main(String[] args){
   
   //Using while loop for user to later on input if they want to do another calculation or to end the execution.
   while (true) {
   
   System.out.print("Input numbers (Max of 2. Decimals are allowed) to calculate: \n");
   
   //Predefined standard input from what we imported.
   Scanner input = new Scanner(System.in);


   //declaring numbers for user. Using double because calculations aren't always exact intergers.
   double num1, num2;
   num1 = input.nextDouble();
   num2 = input.nextDouble();
   double answer;
   
   //Creating inputs for users to determine what they are trying to do (Add, Subtract, Multiply, Divide).
   System.out.println("Select what you are wanting to do: Input 1 for addition. Input 2 for subtraction. Input 3 for multiplication. Input 4 for division");
   
   
   //Creating a variable 1 - 4 for users to pick
   int pick;
   pick = input.nextInt();
   
   //Checking each case dependant on user input
   switch (pick){
   case 1:
   System.out.println(add(num1, num2));
   break;
   case 2:
   System.out.println(sub(num1, num2));
   break;
   case 3:
   System.out.println(mult(num1, num2));
   break;
   case 4:
   System.out.println(div(num1, num2));
   break;
   
   //If user inputs 0 or anything above 4 will return Illegal.
   default:
   System.out.println("Illegal Operation");

      } //switch bracket
      
     //Requesting user if they want to do another calculation or not.
     System.out.print("Would you like to do another calculation? Input 1 for yes, input 0 for no. "); 
     String processAnother = input.next();
     if (processAnother.equals("0")) break;
      
   } //while loop
} //public static void main bracket

      //Setting what each variable does when they call each input.
      public static double add (double x, double y ){
      double result = x + y;
      return result;
      }
      public static double sub (double x, double y ){
      double result = x - y;
      return result;
      }
      public static double mult (double x, double y ){
      double result = x * y;
      return result;
      }
      public static double div (double x, double y ){
      double result = x / y;
      return result;
}



} //Public class calculator
