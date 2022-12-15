package lab;
import java.util.Scanner;

class Complex {
	double real, imag;
	
	Complex(double real1, double imag1){
		this.real = real1;
		this.imag = imag1;
	}
	
	  public static void main(String[] args) {
        Complex n1 = new Complex(1.2, 3.4),
        		n2 = new Complex(2.4, 2.0),
        		temp;

        temp = Add(n1, n2);

        System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.imag);
	  }
	  
	  public static Complex Add(Complex n1, Complex n2) {

	        Complex temp = new Complex(0.0, 0.0);

	        temp.real = n1.real + n2.real;
	        temp.imag = n1.imag + n2.imag;

	        return temp;
	  }
}
