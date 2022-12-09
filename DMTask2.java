package decisionMaking;

import java.util.Scanner;

public class DMTask2 {

	public static void main(String[] args) {
		// Task 2: Write Java program that accepts three
		//numbers from the user and print the greatest number.
		
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter first number- ");  
		int a= sc.nextInt();  
		System.out.print("Enter second number- ");  
		int b= sc.nextInt();  
		System.out.print("Enter third number- ");  
		int c= sc.nextInt();  
		
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("The greatest number among the inputs is " + a);
			}
		}
		else if (b>c) 
		{
			System.out.println("The greatest number among the inputs is " + b);
		}
		
		else 
		{
			System.out.println("The greatest number among the inputs is " + c);
			
		}

	}

}
