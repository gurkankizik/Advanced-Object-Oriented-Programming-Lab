package lab;
import java.util.Scanner;

//UML Class Diagram                     
/*
*               Rectangle                         *  
* ------------------------------------------------*  
* width: double                                   *
* height: double                                  * 
* Rectangle()                                     *  
* Rectangle(newWidth: double, newHeight: double)  *
* getArea(): double                               *
* getPerimeter(): double                          *
*/

public class Main {
  public static void main(String[] args) {
   Rectangle r1 = new Rectangle(2, 3);
   
   System.out.println("Width:" + r1.width);
   System.out.println("Height:" + r1.height);
   System.out.println("Area:" + r1.getArea());
   System.out.println("Perimeter:" + r1.getPerimeter());
  }
}

class Rectangle {
	double width, height;
	
	Rectangle(){
		width = 1;
		height = 1;
	}
	Rectangle(double width1, double height1){
		this.width = width1;
		this.height = height1;
	}
	double getArea() {
		return width * height;
	}
	double getPerimeter() {
		return 2 * (width + height);
	}
}
