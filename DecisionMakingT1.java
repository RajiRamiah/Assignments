package Week2Assessments;

import java.util.Scanner;

public class DecisionMakingT1 {
	
	/*
	 * Task 6: Write a program that prompts the user to input an integer and then
	 * outputs the number with the digits reversed. For example, if the input is
	 * 12345, the output should be 54321. (Hint : Learn concept on net and do it on
	 * your own)
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter a series of number - ");  
		int inputnum = sc.nextInt();  
		char[] chararr = String.valueOf(inputnum).toCharArray();
		int len = chararr.length;
		
		for (int i=len-1;i>=0;i--)
			
		{
			System.out.print(chararr[i]);
		}
		
		
		
		
	}

}
