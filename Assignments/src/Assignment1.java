
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*---------------------------------------------------------------------
		 * Write a Java program to print 'Hello' on screen and then print your name on a separate line.
		---------------------------------------------------------------------*/
		System.out.println("Hello");
		System.out.println("Amninder Singh");
		/*---------------------------------------------------------------------
		 *Write a Java program to print the sum of two numbers.
		---------------------------------------------------------------------*/
		int number1=100 ,number2=200,sum;
		sum = number1 + number2;
		System.out.println("Sum of "+number1+" and "+number2+" is : " + sum);
		/*---------------------------------------------------------------------
		 * Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
		---------------------------------------------------------------------*/
		number1 = 24879;
		number2 = 123;
		System.out.println("Multiplication of "+number1+" and "+number2+" is : " + (number1 * number2));		
		System.out.println("Subtraction of "+number1+" and "+number2+" is : " + (number1 - number2));
		System.out.println("Sum of "+number1+" and "+number2+" is : " + (number1 + number2));
		System.out.println("Remainder of "+number1+"/"+number2+" is : " + (number1 % number2));
		/*---------------------------------------------------------------------
		 * Write a Java program to print the area and perimeter of a circle.
		---------------------------------------------------------------------*/
		final double PI = 3.14;
		double radius = 10;
		double areaOfCircle, perimeterOfCircle;
		areaOfCircle = PI*radius*radius;
		perimeterOfCircle = 2*PI*radius;
		System.out.println("Area of Circle with radius="+radius+" is : " + areaOfCircle);
		System.out.println("Perimeter of Circle with radius="+radius+" is : " + perimeterOfCircle);
		/*---------------------------------------------------------------------
		 * Write a Java program to swap two variables and print value before and after swapping.
		---------------------------------------------------------------------*/
		int var1=76,var2=80;
		System.out.println("Before Swap Variable1 = "+var1+" Variable2 = "+var2);
		var1 = var1 + var2;
		var2 = var1 - var2;
		var1 = var1 - var2;
		System.out.println("After Swap Variable1 = "+var1+" Variable2 = "+var2);		

	}

}
