package lab;
import java.util.Scanner;

public class Main {
	
	public static void main (String args[]) {
//		Scanner myObj = new Scanner(System.in);
//		
//		//Week 1
//		//Example 1
//		
//		int x, y, temp;
//		
//		System.out.println("Enter the value of x: ");
//		x = myObj.nextInt();
//		
//		System.out.println("Enter the value of y: ");
//		y = myObj.nextInt();
//		
//		System.out.println("Before swapping numbers: " + x + " " + y);
//	
//		temp = x;
//		x = y;
//		y = temp;
//		
//		System.out.println("After swapping numbers: " + x + " " + y); 
//		
//	    //Example 2
//		
//		System.out.println("    J     A      V     V     A	   ");
//		System.out.println("    J    A A      V   V     A A	   ");
//		System.out.println("J   J   AAAAA      V V     AAAAA   ");
//		System.out.println(" J J   A     A      V     A     A  ");
//		
//		//Example 3
//		
//		double X, Y, a, b, c, d, e, f;
//		a = 3.4;
//		b = 50.2;
//		c = 2.1;
//		d = 0.55;
//		e = 44.5;
//		f = 5.9;
//		
//		X = ((e*d) - (b*f)) / ((a*d) - (b*c));
//		Y = ((a*f) - (e*c)) / ((a*d) - (b*c));
//		
//		System.out.println("Value of x: " + X + "\n" + "Value of y: " + Y); 
//		
//		//Week 2
//		//Example 1
//		
//	    int month = (int) (Math.random()*12 + 1);
//	    
//		switch(month) {
//		case 1:
//			System.out.println("January");
//			break;
//		case 2:
//			System.out.println("February");
//			break;
//		case 3:
//			System.out.println("March");
//			break;	
//		case 4:
//			System.out.println("April");
//			break;
//		case 5:
//			System.out.println("May");
//			break;
//		case 6:
//			System.out.println("June");
//			break;
//		case 7:
//			System.out.println("July");
//			break;
//		case 8:
//			System.out.println("August");
//			break;
//		case 9:
//			System.out.println("September");
//			break;
//		case 10:
//			System.out.println("October");
//			break;
//		case 11:
//			System.out.println("November");
//			break;	
//		case 12:
//	        System.out.println("December");
//	        break;
//		}
//		
//		//Example 2
//		
//		int rand = (int) (Math.random() * 3);
//		String comp = null, user = null;
//		
//		switch(rand) {
//		case 0:
//			comp = "Scissor";
//			break;
//		case 1:
//			comp = "Rock";
//			break;
//		case 2:
//			comp = "Paper";
//			break;
//		}
//		System.out.println("Scissor(0), Rock(1), Paper(2): ");
//		int player = myObj.nextInt();
//		
//		switch(player) {
//		case 0:
//			user = "Scissor";
//			break;
//		case 1:
//			user = "Rock";
//			break;
//		case 2:
//			user = "Paper";
//			break;
//		}
//		
//		if (player == rand){
//	    System.out.println("The computer is " + comp + " You are " + user + " It is a draw");
//		}
//		else if (user == "Rock" && comp == "Scissor" || user == "Paper" && comp == "Rock" || user == "Scissor" && comp == "Paper") {
//		    System.out.println("The computer is " + comp + " You are " + user + " You won");
//		}
//		else {System.out.println("The computer is " + comp + " You are " + user + " You lose");
//		}
//		
//		//Example 3
//		double inx = 0;
//		double iny = 0;
//		double result;
//		
//		System.out.println("Enter a point with two coordinates: ");
//		double x = myObj.nextDouble();
//		double y = myObj.nextDouble();
//		
//		result = Math.sqrt(Math.pow(x - inx, 2)  + Math.pow(y - iny, 2));
//		
//		if (result < 10) {
//		 System.out.println("Point " + "(" + x + ")" + " (" + y + ")" + " is in the circle");
//		}
//		else {
//			System.out.println("Point " + "(" + x + ")" + " (" + y + ")" + " is not in the circle");
//		}
//		
//		//Example 4
//
//		int lottery = (int)(Math.random() * 100);
//		
//	    System.out.println("Enter number (2 digits): " + lottery);
//	    int guess = myObj.nextInt();
//	    
//	    int digit1 = lottery / 10;
//	    int digit2 = lottery % 10;
//	    
//	    int guessdigit1 = guess / 10;
//	    int guessdigit2 = guess % 10;
//		
//	    if(guess == lottery) {
//	    	System.out.println("You won $10,000.");
//	    }
//	    else if(guessdigit1 == digit2 && digit1 == guessdigit2)
//	    {
//	       System.out.println("You won $3,000.");
//	    }
//	    else if (guessdigit1 == digit1 || digit1 == guessdigit2 || guessdigit1 == digit2 || digit2 == guessdigit2) {
//	    	System.out.println("You won $1,000.");
//	    }
//	    else { System.out.println("You lost.");
//	    }
//		
//		//Week 3
//		//Example 1
//		
//		Scanner str = new Scanner(System.in);
//		
//		System.out.println("Enter a string: ");
//		String user = str.nextLine();
//		
//		int low = 0;
//		int high = user.length() -1;
//		
//		boolean isPalindrome = true;
//		
//		while(low < high) {
//			if(user.charAt(low) != user.charAt(high)) {
//				isPalindrome = false;
//				break;
//			}
//			else if(user.charAt(low) == user.charAt(high)){
//				isPalindrome = true;
//			}
//			low++;
//			high--;
//		}
//	    
//		if (isPalindrome) {
//			System.out.println(user + " is palindrome.");
//		}
//		else {
//			System.out.println(user + " is not palindrome.");
//		}
//		
//		//Example 2
//		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter an integer (0 to exit): ");
//		
//		int positives = 0;
//		int negatives = 0;
//		double total = 0;
//		int count = 0;
//		
//		int number = input.nextInt();
//		
//		while (number != 0) {
//			if (number > 0) 
//				positives++;
//			else negatives++;
//			
//			total = total + number;	
//			count++;		
//			number = input.nextInt();
//		}
//		System.out.println("Number of positives: " + positives);
//		System.out.println("Number of negatives: " + negatives);
//		System.out.println("Total is: " + total);
//		System.out.println("Average is: " + total / count);
//		
//	//Example 3
//		
//		for (int j = 1; j <= 10000; j++){
//			int sum = 0;
//			for (int i = 1; i < j; i++)
//				if(j % i == 0)
//					sum  += i;
//			
//			if(j == sum)
//				System.out.println(j + " is perfect number");
//		}
//		
//		
//	//Example 4
//		
//		Scanner input = new Scanner(System.in);
//		
//		double sum = 0.0;
//		double deviation = 0.0;
//		double mean;
//		
//		System.out.println("Enter 10 numbers: ");
//		
//		for(int i = 0; i < 10; i ++) {
//			double usrInput = input.nextDouble();
//			sum += usrInput;
//			deviation += Math.pow(usrInput, 2); 
//		}
//		
//		mean = sum / 10;
//		deviation =  Math.sqrt((deviation - (Math.pow(sum, 2) / 10)) / (10 - 1));
//		
//		System.out.println("Mean is: " + mean);
//		System.out.println("Standart deviation: " + deviation);
	}
}