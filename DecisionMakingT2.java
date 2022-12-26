package Week2Assessments;

import java.util.Scanner;

/*Task 7:Write a program that prompts the user to input a positive integer. 
It should then output a message indicating whether the number is a prime number. 
(Hint : Learn concept on net and do it on your own)*/

public class DecisionMakingT2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in); 
		System.out.print("Input any number greater than 1- "); 
		int input = sc.nextInt();  
		boolean flag = false;
		
		if(input==0||input==1)
		{
			System.out.println("Invalid input - 0 or 1 are not Prime numbers");
		}
		
		else {
			for (int i=2;i<=input/2;i++) //if input is 2 - the control does not enter the loop
				
			{
				if(input%i==0) {
					System.out.println(input +" is not prime number");      
				     flag= true;      
				     break;    
				}
			}
			
			if(flag== false)
			{
				System.out.println(input +" is prime number");  
			}
			
		}
		
	}
	

}
