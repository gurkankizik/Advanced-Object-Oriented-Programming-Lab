//This is not runable file, you can copy questions separately and run it.

//Question 1
public class Main {
  public static void main(String[] args) {

    int dice1 = (int)(Math.random() * 6 + 1);
    int dice2 = (int)(Math.random() * 6 + 1);

    if ((dice1 + dice2) == 12) {
      System.out.println("first try " + (dice1 + dice2));
      System.out.println("the player won 1000 dolar");
    } else if ((dice1 + dice2) == 11) {
      System.out.println("first try " + (dice1 + dice2));
      System.out.println("the player won 500 dolar");
    } else if ((dice1 + dice2) == 10) {
      System.out.println("first try " + (dice1 + dice2));
      System.out.println("the player won 250 dolar");
    } else {
      System.out.println("first try " + (dice1 + dice2));
      int dice3 = (int)(Math.random() * 6 + 1);
      int dice4 = (int)(Math.random() * 6 + 1);
      if ((dice3 + dice4) == 12) {
        System.out.println("second try " + (dice3 + dice4));
        System.out.println("the player won 500 dolar");
      } else if ((dice3 + dice4) == 11) {
        System.out.println("second try " + (dice3 + dice4));
        System.out.println("the player won 250 dolar");
      } else if ((dice3 + dice4) == 10) {
        System.out.println("second try " + (dice3 + dice4));
        System.out.println("the player won 125 dolar");
      } else {
        System.out.println("second try " + (dice3 + dice4));
        System.out.println("you lost");
      }
    }
  }
}

//Question 2

import java.util.Scanner;

public class Main {
  static void passwordisvalid(String pass) {
    boolean hasOneLetter = true;
    boolean hasOneDigit = true;

    if (pass.length() >= 6) {
      System.out.println("Password is 6 characters.");
    } else {
      System.out.println("Password is not 6 characters.");
    }

    for (int i = 0; i < pass.length(); i++) {
      if (Character.isDigit(pass.charAt(i))) {
        hasOneDigit = true;
        break;
      } else {
        hasOneDigit = false;
      }
    }
    for (int i = 0; i < pass.length(); i++) {
      if (Character.isLetter(pass.charAt(i))) {
        hasOneDigit = true;
        break;
      } else {
        hasOneDigit = false;
      }
    }
    if (hasOneLetter) {
      System.out.println("Password have letter.");
    } else System.out.println("Password doesn't have letter.");

    if (hasOneDigit) {
      System.out.println("Password have digit.");
    } else System.out.println("Password doesn't have digit.");
  }
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter your password: ");
    String user = inp.nextLine();
    passwordisvalid(user);
  }
}
