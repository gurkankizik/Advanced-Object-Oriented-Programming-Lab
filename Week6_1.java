package lab;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	  Scanner s = new Scanner(System.in);
	  Lamp led = new Lamp();
	  
	  System.out.println("Please Enter an integer number; Even number opens to Lamp and odd numbers close of it ");
	  int input = s.nextInt();
	  
	  if(input % 2 == 0) {
		  led.turnOn();
	  }
	  else led.turnOff();
	  
  }
}

class Lamp {
	boolean isOn;
	
	void turnOn(){
		boolean isOn = true;
		System.out.println("lamp is opened");
	}
	void turnOff(){
		boolean isOn = false;
		System.out.println("lamp is closed");
	}
}
