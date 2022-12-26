package Week2Assessments;

import java.lang.reflect.Array;
import java.util.Scanner;

/*Task 8: Write a program to print Fibonacci series of n terms
where n is input by user : 0 1 1 2 3 5 8 13 24 .....  
(Hint : Learn concept on net and do it on your own)*/

public class DecisionMakingT3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in); 
		System.out.print("Input any number until which the fibonocci should be generated- "); 
		int input = sc.nextInt();  
		int[] intArray = new int[input];
		
		intArray[0] = 0;
		intArray[1] = 1;
		
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
			
		
		for (int i=2; i<input; i++) {
			intArray[i] = intArray[i-1] + intArray[i-2];
			System.out.println(intArray[i]);
					
		}
		
		
		
		
		
	}

}
