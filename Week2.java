import java.util.Scanner;

public class Main {

  public static void main(String args[]) {
	  Scanner input = new Scanner(System.in);

    //Week 2
    //Example 1

    int month = (int)(Math.random() * 12 + 1);

    switch (month) {
    case 1:
      System.out.println("January");
      break;
    case 2:
      System.out.println("February");
      break;
    case 3:
      System.out.println("March");
      break;
    case 4:
      System.out.println("April");
      break;
    case 5:
      System.out.println("May");
      break;
    case 6:
      System.out.println("June");
      break;
    case 7:
      System.out.println("July");
      break;
    case 8:
      System.out.println("August");
      break;
    case 9:
      System.out.println("September");
      break;
    case 10:
      System.out.println("October");
      break;
    case 11:
      System.out.println("November");
      break;
    case 12:
      System.out.println("December");
      break;
    }

    //Example 2

    int rand = (int)(Math.random() * 3);
    String comp = null, user = null;

    switch (rand) {
    case 0:
      comp = "Scissor";
      break;
    case 1:
      comp = "Rock";
      break;
    case 2:
      comp = "Paper";
      break;
    }
    System.out.println("Scissor(0), Rock(1), Paper(2): ");
    int player = input.nextInt();

    switch (player) {
    case 0:
      user = "Scissor";
      break;
    case 1:
      user = "Rock";
      break;
    case 2:
      user = "Paper";
      break;
    }

    if (player == rand) {
      System.out.println("The computer is " + comp + " You are " + user + " It is a draw");
    } else if (user == "Rock" && comp == "Scissor" || user == "Paper" && comp == "Rock" || user == "Scissor" && comp == "Paper") {
      System.out.println("The computer is " + comp + " You are " + user + " You won");
    } else {
      System.out.println("The computer is " + comp + " You are " + user + " You lose");
    }

    //Example 3
    double inx = 0;
    double iny = 0;
    double result;

    System.out.println("Enter a point with two coordinates: ");
    double x = input.nextDouble();
    double y = input.nextDouble();

    result = Math.sqrt(Math.pow(x - inx, 2) + Math.pow(y - iny, 2));

    if (result < 10) {
      System.out.println("Point " + "(" + x + ")" + " (" + y + ")" + " is in the circle");
    } else {
      System.out.println("Point " + "(" + x + ")" + " (" + y + ")" + " is not in the circle");
    }

    //Example 4

    int lottery = (int)(Math.random() * 100);

    System.out.println("Enter number (2 digits): ");
    int guess = input.nextInt();

    int digit1 = lottery / 10;
    int digit2 = lottery % 10;

    int guessdigit1 = guess / 10;
    int guessdigit2 = guess % 10;

    if (guess == lottery) {
      System.out.println("You won $10,000.");
    } else if (guessdigit1 == digit2 && digit1 == guessdigit2) {
      System.out.println("You won $3,000.");
    } else if (guessdigit1 == digit1 || digit1 == guessdigit2 || guessdigit1 == digit2 || digit2 == guessdigit2) {
      System.out.println("You won $1,000.");
    } else {
      System.out.println("You lost.");
    }
  }
}
