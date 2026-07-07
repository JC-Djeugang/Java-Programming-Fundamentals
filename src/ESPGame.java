/*
 * Class: CMSC203 
 * Instructor: Farnaz Eivazi
 * Description: (I Create my list of the seven names of colors. The program should randomly select the name of a color from your list of words, for example:

Red, Green, Blue, Orange, and Yellow)
 * Due: 02/04/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or any source. I have not given my code to any student.
 * Print your Name here: Jean Claude Djeugang.
*/
import java.util.Random;
import java.util.Scanner;
public class ESPGame{
	// Initiate a String array called colors by intializing it
  // with all four colors.
   public static String [] colors = { "RED", "BLUE","GREEN", "ORANGE", "YELLOW"};
  // Create a Random object to generate random numbers.
   static Random rand = new Random();
   public static void main(String[] args) {
          int c = 0, correctGuesses=0, randIndex;
          String selectedWord, predictedWord, name, total;
          Scanner in = new Scanner(System.in);
             
          
        System.out.println("Enter your name:");
  		name = in.nextLine();
  		int mcm;
  		System.out.println("Enter your MC M#:");
  		name = in.nextLine();
  		String describeYourself;
  		System.out.println("Discribe yourself:");
  		describeYourself = in.nextLine();
  		String dueDate;
  		System.out.println("Due Date:");
  		dueDate = in.nextLine();
  		System.out.println("CMSC203 Assignment1: Test your ESP skills!\n"
  				+ "Round 1");

          
          System.out.print("Guess the color[either RED, BLUE, GREEN, ORANGE, YELLOW] picked by computer:");   while(c < 10){
	      randIndex = rand.nextInt(4);
          selectedWord = colors[randIndex];
          Scanner scan = new Scanner(System.in);
          predictedWord = scan.next();
          System.out.println("Randomly Selected Color: " + selectedWord);         
          if(predictedWord.equalsIgnoreCase(selectedWord))
          correctGuesses++;
          c++;
	      System.out.print("Guess again:");
	    }
	      System.out.println();
          System.out.println("After 11 tries, you got the color correct " + correctGuesses + " times.");
	
	in.close();


  }
}


