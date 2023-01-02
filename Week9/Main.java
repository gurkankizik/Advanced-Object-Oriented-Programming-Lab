import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Person person = new Person("Gürkan", "İstanbul", "123456", "g@gmail.com");
		Student student = new Student("Ali", "Ankara", "1122", "ali@hotmail.com", Student.freshman);
		Employee employee = new Employee("Ege", "İzmir", "123", "ege@yahoo.com", 910 , 12.000);
		
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		
		
		//Example 2
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.print("Enter a sequence of numbers ending wih 0: ");
		Integer number = s.nextInt();
		while (number.intValue() != 0) {
			list.add(number);
			number = s.nextInt();
		}
 
		System.out.println("The largest number in the input is " + max(list));
		
		shuffle(list);
		System.out.println("The shuffled numbers in the list "  + list);
	}
	public static Integer max(ArrayList<Integer> list) {
		if(list.size() == 0)
		return null;
		
		Integer max = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > max)
				max = list.get(i);
		}
		return max;
	}
	public static void shuffle(ArrayList<Integer> list) {
		java.util.Collections.shuffle(list); 
	}
}