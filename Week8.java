package chapter10;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Please enter X: ");
    double userX = s.nextDouble();
    System.out.println("Please enter Y: ");
    double userY = s.nextDouble();
    System.out.println("Please enter Radius: ");
    double userR = s.nextDouble();

    Circle2D c = new Circle2D(userX, userY, userR);
    System.out.println("Radius:" + c.getRadius());
    System.out.println("Area:" + c.getArea());
    System.out.println("Perimeter :" + c.getPerimeter());
  }
}
package chapter10;

public class Circle2D {
  static public double x, y, radius, userX, userY, userR;

  Circle2D() {
    x = 0.0;
    y = 0.0;
    radius = 1.0;
  }
  Circle2D(double userX, double userY, double userR) {
    x = userX;
    y = userY;
    radius = userR;
  }
  static double getRadius() {
    return radius;
  }
  static double getArea() {
    return 3.14 * radius * radius;
  }
  static double getPerimeter() {
    return 2 * radius * 3.14;
  }
  static Boolean contains(double x, double y) {
    return true;
  }
  static Boolean overlaps(double x, double y) {
    return true;
  }
}
package chapter10_2;
import java.util.*;
public class Main {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String string1 = s.nextLine();
    String string2 = s.nextLine();
    System.out.println(isAnagramSort(string1, string2));
  }
  static boolean isAnagramSort(String string1, String string2) {
    if (string1.length() != string2.length()) {
      return false;
    }
    char[] a1 = string1.toCharArray();
    char[] a2 = string2.toCharArray();
    Arrays.sort(a1);
    Arrays.sort(a2);
    return Arrays.equals(a1, a2);
  }

}
