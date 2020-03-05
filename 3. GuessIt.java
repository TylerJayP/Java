import java.util.Scanner;
import java.util.Random;

public class GuessIt{

   public static void main(String[] args){

      int unknownAnswer, yourGuess;
      final int ANSWERMAX = 100;
      
      Scanner userGuess = new Scanner(System.in);
      Random rand = new Random();
      
      unknownAnswer = rand.nextInt(ANSWERMAX) + 1; //Obtaining random number between 0 and 100. The +1 makes it go all the way to 100. If not, it'd be 0 and 99.
    
      System.out.printf("Guess a number between 0 - 100: ");
      yourGuess = userGuess.nextInt(); 
      
         while(yourGuess < unknownAnswer || yourGuess > unknownAnswer){ //This loop is set to if your guess does not equal the unknown it will keep having you guess until you guess it right.
         
            if((yourGuess > 100 || yourGuess < 0)){ //Validating that the user actually inputs a valid number. If they go higher than 100 or lower than 0, they have to re-enter a valid number.
               System.out.print("Invalid guess. Please guess a number between 0 and 100: ");
               yourGuess = userGuess.nextInt();
            }
            else{   
               if(yourGuess > unknownAnswer){
                  System.out.print("You need to guess lower! Guess Again: ");
                  yourGuess = userGuess.nextInt(); 
                  }
               else if(yourGuess < unknownAnswer){
                  System.out.print("You need to guess higher! Guess Again: ");
                  yourGuess = userGuess.nextInt();    
                  }
               if(yourGuess == unknownAnswer){
                  System.out.print("You have guessed the right number! The unknown number was " + unknownAnswer + "."); 
               break;
                  }
          }
        
       }
        
    }
      
}
   
