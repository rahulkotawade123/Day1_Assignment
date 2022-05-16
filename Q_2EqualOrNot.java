package Day_1_Assignment;

import java.util.Scanner;
public class Q_2EqualOrNot {

	//write program to check two string are equal or not.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a, b;
		Scanner scanner =new Scanner(System.in);

		System.out.println("Enter first String");
		a = scanner.nextLine();
		
		System.out.println("Enter second String");
		b = scanner.nextLine();
		
		if (a.equals(b))
		    System.out.println("Equal");
		else
			System.out.println("UnEqual");

	}

}
