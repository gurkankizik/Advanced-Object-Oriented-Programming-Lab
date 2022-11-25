package Project;
import java.util.Scanner;

public class Main {

  public static void main(String args[]) {

    //Week 3
    //Example 1

    Scanner str = new Scanner(System.in);

    System.out.println("Enter a string: ");
    String user = str.nextLine();

    int low = 0;
    int high = user.length() - 1;

    boolean isPalindrome = true;

    while (low < high) {
      if (user.charAt(low) != user.charAt(high)) {
        isPalindrome = false;
        break;
      } else if (user.charAt(low) == user.charAt(high)) {
        isPalindrome = true;
      }
      low++;
      high--;
    }

    if (isPalindrome) {
      System.out.println(user + " is palindrome.");
    } else {
      System.out.println(user + " is not palindrome.");
    }

    //Example 2

    Scanner input = new Scanner(System.in);
    System.out.println("Enter an integer (0 to exit): ");

    int positives = 0;
    int negatives = 0;
    double total = 0;
    int count = 0;

    int number = input.nextInt();

    while (number != 0) {
      if (number > 0)
        positives++;
      else negatives++;

      total = total + number;
      count++;
      number = input.nextInt();
    }
    System.out.println("Number of positives: " + positives);
    System.out.println("Number of negatives: " + negatives);
    System.out.println("Total is: " + total);
    System.out.println("Average is: " + total / count);

    //Example 3

    for (int j = 1; j <= 10000; j++) {
      int sum = 0;
      for (int i = 1; i < j; i++)
        if (j % i == 0)
          sum += i;

      if (j == sum)
        System.out.println(j + " is perfect number");
    }

    //Example 4

    Scanner input = new Scanner(System.in);

    double sum = 0.0;
    double deviation = 0.0;
    double mean;

    System.out.println("Enter 10 numbers: ");

    for (int i = 0; i < 10; i++) {
      double usrInput = input.nextDouble();
      sum += usrInput;
      deviation += Math.pow(usrInput, 2);
    }

    mean = sum / 10;
    deviation = Math.sqrt((deviation - (Math.pow(sum, 2) / 10)) / (10 - 1));

    System.out.println("Mean is: " + mean);
    System.out.println("Standart deviation: " + deviation);
  }
}
