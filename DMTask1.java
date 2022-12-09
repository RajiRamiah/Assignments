package decisionMaking;

import java.util.Scanner;

public class DMTask1 {

	public static void main(String[] args) {
		// Task1: Write Java program to allow the user to input his/her age.
		//Then the program will show if the person is eligible to vote.
		//A person who is eligible to vote must be older than or equal to 18 years old.
		
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter your age - ");  
		int age= sc.nextInt();  
		
		if(age>=18) {
			System.out.println("Congradulations !!! You are eligible to vote");
		}
		
		else 
		{
			System.out.println("Grow up Child !!!");
		}
		
		
		

	}

}
