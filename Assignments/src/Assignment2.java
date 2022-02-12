import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("----------------------------------------Q1----------------------------------");
		/*---------------------------------------------------------------------
		 * Write a Java program to compute the perimeter and area of a rectangle with a height of 7 inches. and
		   Width of 5 inches.  
		---------------------------------------------------------------------*/

		int height = 7, width = 5;
		int perimeter, area;
		perimeter = 2 * (height + width);
		area = height * width;
		System.out.println("Perimeter of the rectangle = " + perimeter + " inches");
		System.out.println("Area of the rectangle = " + area + " square inches");

		System.out.println("----------------------------------------Q2----------------------------------");
		/*---------------------------------------------------------------------
		 * Write a Java program to check a number in a variable is whether even or odd.
		---------------------------------------------------------------------*/
		System.out.print("Input num: ");
		int input = sc.nextInt();
		String output = input % 2 == 0 ? "Even" : "Odd";
		System.out.println(input + " is " + output + ".");
		System.out.println("----------------------------------------Q3----------------------------------");
		/*---------------------------------------------------------------------
		 * Write a java program that has three integer variables and find the maximum of three.
		---------------------------------------------------------------------*/

		System.out.print("X= ");
		int number1 = sc.nextInt();
		System.out.print("Y= ");
		int number2 = sc.nextInt();
		System.out.print("Z= ");
		int number3 = sc.nextInt();
		int max = number1 > number2 ? (number1 > number3 ? number1 : number3) : (number2 > number3 ? number2 : number3);
		System.out.println("Maximum value of three integers: " + max);

		System.out.println("----------------------------------------Q4----------------------------------");
		/*---------------------------------------------------------------------
		 * Write a Java program which has a number variable(1-7) and print day of week name using if – else if
		---------------------------------------------------------------------*/

		System.out.print("X= ");
		int varNumber = sc.nextInt();
		if (varNumber == 1)
			System.out.println("Monday");
		else if (varNumber == 2)
			System.out.println("Tuesday");
		else if (varNumber == 3)
			System.out.println("Wednesday");
		else if (varNumber == 4)
			System.out.println("Thursday");
		else if (varNumber == 5)
			System.out.println("Friday");
		else if (varNumber == 6)
			System.out.println("Saturday");
		else
			System.out.println("Sunday");

		System.out.println("----------------------------------------Q5----------------------------------");
		/*---------------------------------------------------------------------
		 * Write a Java program to check a given integer is positive even, negative even, positive odd or negative odd.
		 *  Print even if the number is 0.  
		---------------------------------------------------------------------*/

		System.out.print("X= ");
		int inpNumber = sc.nextInt();
		if (inpNumber < 0) {
			if (inpNumber % 2 == 0)
				System.out.println("Negative Even");
			else
				System.out.println("Negative Odd");
		} else if (inpNumber > 0) {
			if (inpNumber % 2 == 0)
				System.out.println("Positive Even");
			else
				System.out.println("Positive Odd");
		} else
			System.out.println("Even");

		System.out.println("----------------------------------------Q6----------------------------------");
		/*---------------------------------------------------------------------
		 * Write a Java program that has two number variables and divide the first number by second number. 
		 * If the division not possible print "Division not possible".
		---------------------------------------------------------------------*/

		System.out.print("X= ");
		int x = sc.nextInt();
		System.out.print("Y= ");
		int y = sc.nextInt();
		if (x > y) {
			System.out.println(x / y);
		} else
			System.out.println("Division not possible");

		System.out.println("----------------------------------------Q7----------------------------------");
		/*---------------------------------------------------------------------
		 * write a java program using while loop to print all the even values between 1 to 20.
		---------------------------------------------------------------------*/

		int i = 0;
		while (i < 20) {
			if (i % 2 == 0)
				System.out.print(i + " ");
			i++;
		}
		System.out.println();
		System.out.println("----------------------------------------Q8----------------------------------");
		/*---------------------------------------------------------------------
		 * write a java program using while loop to print all the even values between 1 to 20.
		---------------------------------------------------------------------*/
		i = 1;
		int sum = 0;
		while (i < 20) {
			sum += i;
			i++;
		}
		System.out.println("Sum of numbers between 1 to 20 is : " + sum);
	}

}
