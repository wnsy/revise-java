import java.util.Scanner;

public class Intro {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    String firstName;
    System.out.print("What is your name?  ");
    firstName = userInput.nextLine();
    System.out.printf("Hellou, my name is %s\n", firstName); //'f' stands for formatted
    System.out.printf("%s is revising Java\n", firstName);
  }
}
