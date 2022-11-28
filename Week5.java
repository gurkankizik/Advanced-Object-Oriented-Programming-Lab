import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //Week 5
    //Example 1
    Scanner input = new Scanner(System.in);
    int[] array = new int[6];
    int[] reverse = new int[6];
    int temp = 0;

    System.out.println("Enter six numbers: ");
    for (int i = 0; i < 6; i++) {
      array[i] = input.nextInt();
    }

    //We can use reverse(array) method instead of using this as the question says
    for (int i = 0, j = 5; i < 6; i++, j--) {
      temp = array[i];
      array[i] = reverse[j];
      reverse[j] = temp;
    }

    for (int i = 0; i < 6; i++) {
      System.out.print(reverse[i] + " " );
    }
      System.out.println();
    
    //Example 2

    int[] numbers = new int[10];
    int num;
    int count = 0;
    System.out.println("Enter ten numbers: ");
    for (int i = 0; i < 10; i++) {
      num = input.nextInt();
      if (isDistinct(numbers, num)) { //We are checking the distinction while getting input from the user
        numbers[count] = num;
        count++;
      }
    }

    System.out.println("The number of distinct numbers is " + count);
    System.out.print("The distinct numbers are: ");
    for (int i = 0; i < 10; i++) {
      if (numbers[i] > 0)
        System.out.print(" " + numbers[i]);
    }
    System.out.println();

    //Example 3

    double[] numbers1 = new double[10];

    System.out.print("Enter ten numbers: ");
    for (int i = 0; i < numbers1.length; i++)
      numbers1[i] = input.nextDouble();

    System.out.println("The mean is " + mean(numbers1));
    System.out.println("The standard deviation is " + deviation(numbers1));
  }

  public static boolean isDistinct(int[] array, int num) {
    for (int i = 0; i < array.length; i++) {
      if (num == array[i])
        return false;
    }
    return true;
  }

  public static double deviation(double[] x) {
    double deviation = 0;
    double mean = mean(x);
    for (double e: x) {
      deviation += Math.pow(e - mean, 2);
    }
    return Math.sqrt(deviation / (x.length - 1));
  }

  public static double mean(double[] x) {
    double mean = 0;
    for (double e: x) {
      mean += e;
    }
    return mean / x.length;
  }
}
