import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListPractice {

	public static void main(String[] args) {
		// TODO Auto generated

//		int[][] myNumber = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
////		System.out.println(myNumber.length);
//
//		for (int i = 0; i < myNumber.length; i++) {
//			for (int j = 0; j < myNumber[i].length; j++) {
//				System.out.print(myNumber[i][j] + " ");
//			}
//			System.out.println();
//		}
		String input = "19 Nov 1994";
		String[] inputArray = input.split(" ");
		String[] monthName = {"Jan", "Feb", "Mar","Apr", "May", "Jun","Jul", "Aug", "Sep","Oct", "Nov", "Dec"};
		int monthNumber = 0;
		for(int j=0; j < monthName.length;j++)
			if(monthName[j].equals(inputArray[1]))
				monthNumber = j;
		
		
		
		
		
		
		
	    System.out.println("I just got executed!" + monthNumber);
}

}