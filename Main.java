
/**
 * This is my main class
 *
 * @author Cristina
 * @version 2/5/2019
 */

import java.util.Scanner; 

public class Main{
    
    public static void main(String[] args) {
        
        int correctAnswer = (int) (Math.random() *10);
        System.out.println("******* The MyStErY NuMbEr is ********");
        System.out.println(correctAnswer);
        System.out.println("**************************************");
       
        int totalGuesses = 0;
        Scanner myScanner = new Scanner(System.in);
        int userInput;
        int previousAnswer = 0;
        System.out.println("Please choose a number between 1 and 10");
        userInput = myScanner.nextInt();
        boolean myBoolean = false;
        
        
        while (myBoolean == false) {
        
        if(userInput > correctAnswer) {
            System.out.println("Too Large");
            
            totalGuesses = (userInput==previousAnswer) ? totalGuesses : (totalGuesses += 1);
            System.out.println("Your total incorrect guesses : " + totalGuesses);
            
            previousAnswer = userInput;
            
            userInput = myScanner.nextInt();
        } else if(userInput < correctAnswer) {
            System.out.println("Too Small");
           
            totalGuesses = (userInput==previousAnswer) ? totalGuesses : (totalGuesses += 1);
            System.out.println("Your total incorrect guesses are:" + totalGuesses);
            
            previousAnswer = userInput;
            
            userInput = myScanner.nextInt();
        } else if(userInput == correctAnswer){
            System.out.println("Correct Guess!");
            myBoolean = true;
            
            System.out.println("Your total incorrect guesses are: " + totalGuesses);
            
        }
    
    }
}
        
        
    

}
