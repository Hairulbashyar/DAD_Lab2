/*import java.util.Scanner;

	class Week2{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x, y, sum;
	    Scanner myObj = new Scanner(System.in); // Create a Scanner object
	    System.out.println("Insert your first number :");
	    x = myObj.nextInt(); // Read user input

	    System.out.println("Insert your second number :");
	    y = myObj.nextInt(); // Read user input

	    sum = x + y;  // Calculate the sum of x + y
	    System.out.println("The sum of 2 value is: " + sum); // Print the sum
	  }

	}*/

import java.util.Scanner;

class Week2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many marks do you want to insert : ");
		int numMarks = scanner.nextInt();
		
		double totalMarks = 0;
		for (int i=1; i<= numMarks; i++) {
			System.out.println("please enter your mark no" + i + ":");
			double mark = scanner.nextDouble();
			totalMarks += mark;
			System.out.println("Mark " + mark + " has been inserted ");
			
		}
		
		System.out.println("Total mark is: " + totalMarks);
		scanner.close();
	}
		//{
		
		
		/*mark1 = scan.nextInt();
		mark2 = scan.nextInt();
		mark3 = scan.nextInt();
		//calculate sum of marks
		totalMark = mark1 + mark2 +mark3;
		
		
		//output
		System.out.println("Total Marks : " + totalMark);*/
		
	//}
			
	}

