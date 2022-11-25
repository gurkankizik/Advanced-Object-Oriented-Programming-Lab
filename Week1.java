import java.util.Scanner;

public class Main {

  public static void main(String args[]) {
    Scanner myObj = new Scanner(System.in);

    //Week 1
    //Example 1

    int x, y, temp;

    System.out.println("Enter the value of x: ");
    x = myObj.nextInt();

    System.out.println("Enter the value of y: ");
    y = myObj.nextInt();

    System.out.println("Before swapping numbers: " + x + " " + y);

    temp = x;
    x = y;
    y = temp;

    System.out.println("After swapping numbers: " + x + " " + y);

    //Example 2

    System.out.println("    J     A      V     V     A	   ");
    System.out.println("    J    A A      V   V     A A	   ");
    System.out.println("J   J   AAAAA      V V     AAAAA   ");
    System.out.println(" J J   A     A      V     A     A  ");

    //Example 3

    double X, Y, a, b, c, d, e, f;
    a = 3.4;
    b = 50.2;
    c = 2.1;
    d = 0.55;
    e = 44.5;
    f = 5.9;

    X = ((e * d) - (b * f)) / ((a * d) - (b * c));
    Y = ((a * f) - (e * c)) / ((a * d) - (b * c));

    System.out.println("Value of x: " + X + "\n" + "Value of y: " + Y);
  }
}
