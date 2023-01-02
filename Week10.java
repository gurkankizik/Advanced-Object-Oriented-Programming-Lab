package lab;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Main {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner input = new Scanner(System.in);
    //		Example 1

    boolean continueInput = true;
    System.out.println("Please enter 2 integers: ");

    while (continueInput) {
      try {
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.println("The sum is " + (x + y));
        continueInput = false;
      } catch (InputMismatchException e) {
        System.out.println("Try again. Incorrect input");
        input.nextLine();
      }
    }

    //		Example 2

    int[] myList = new int[100];
    for (int i = 0; i < 100; i++) {
      myList[i] = (int)(1 + Math.random() * 100);
    }
    try {
      System.out.println("Please enter index: ");
      System.out.println("The corresponding element value is " + myList[input.nextInt()]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Out of Bounds");
    }

    //		Example 3

    File file = new File("Example3.txt");
    if (file.exists()) {
      System.out.println("File already exists");
      System.exit(0);
    }

    ArrayList < Integer > list = new ArrayList < > ();

    try (
      PrintWriter output = new PrintWriter(file);
    ) {
      for (int i = 0; i < 100; i++) {
        output.print(((int)(Math.random() * 500) + 1));
        output.print(" ");
      }
    }
    try (
      Scanner s = new Scanner(file);
    ) {
      while (s.hasNext()) {
        list.add(s.nextInt());
      }
    }
    Collections.sort(list);
    System.out.print(list.toString());
    System.out.println();

  }
}
