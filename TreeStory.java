/**
* Boilerplate or template originally from teamtreehouse.com.
* Track: Java learning path/track.
* Java Basics - Multiple strings:  to prompt for multiple variables
* and use them in a single formatted String.
*/

import java.util.Scanner;

public class TreeStory {

  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    /*  Some terms:
    noun - Person, place or thing
    verb - An action
    adjective - A description used to modify or describe a noun
    Enter your amazing code here!
    */
    System.out.print("How old are you?   ");
    String ageAsString = userInput.nextLine();
    int age = Integer.parseInt(ageAsString); //converting a string to an Integer
//on GIT: adds feature branch
    //int age = 12;
    if (age < 13) {
      //Insert exit code
      System.out.printf("Sorry, you must be at least 13 to use this program.\n");
      System.exit(0);
    }
    System.out.print("Enter you name:   ");
    String name = userInput.nextLine();
    System.out.print("Enter an adjective:   ");
    String adjective = userInput.nextLine();
    System.out.print("Enter a noun:   ");
    String noun = userInput.nextLine();
    if (noun.equalsIgnoreCase("dork")) {
      System.out.printf("That language is not allowed. Exiting. \n\n");
      System.exit(0);
    }
    System.out.print("Enter an adverb:   ");
    String adverb = userInput.nextLine();
    System.out.print("Enter a verb ending with -ing:  ");
    String verb = userInput.nextLine();

    System.out.printf("Your TreeStory:\n--------------\n");
    System.out.printf("%s is a %s %s.  ", name, adjective, noun);
    System.out.printf("They are always %s %s.\n", adverb, verb);
  }
}
