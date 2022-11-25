import java.util.Scanner;

public class Main {

  public static int countLetters(String s) {
    int numberOfLetters = 0;
    for (int i = 0; i < s.length(); i++) {
      if (Character.isLetter(s.charAt(i))) {
        numberOfLetters++;
      }
    }
    return numberOfLetters;
  }

  public static int reverse(int number) {
    int rev = 0;
    int rem;

    while (number > 0) {
      rem = number % 10;
      rev = (rev * 10) + rem;
      number = number / 10;
    }

    return rev;
  }
  public static boolean isPalindrome(int number) {
    return number == reverse(number) ? true : false;
  }

  public static double estimatePI(double n) {
    double pi = 0;
    for (double i = 1; i <= n; i++) {
      pi += Math.pow(-1, i + 1) / (2 * i - 1);
    }
    pi *= 4;
    return pi;
  }

  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a Letter: ");
    String userInput = input.nextLine();

    System.out.println(countLetters(userInput));

    Scanner input1 = new Scanner(System.in);

    System.out.println("Enter an integer: ");
    int userInput1 = input1.nextInt();

    System.out.println(isPalindrome(userInput1));

    double start = 1;
    double end = 901;
    System.out.println("\ni           m(i)     ");
    System.out.println("---------------------");
    for (double i = start; i <= end; i += 100) {
      System.out.printf("%-12.0f", i);
      System.out.printf("%-6.4f\n", estimatePI(i));
    }
  }
}
