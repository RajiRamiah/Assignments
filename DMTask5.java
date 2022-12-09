package decisionMaking;

import java.util.Scanner;

public class DMTask5 {

	public static void main(String[] args) {
		// Task 5: Write a program that prompts the user to
		//input a positive integer. It should then print the multiplication table of that number. 
		//(Hint : Surf Net)33333
		
		Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int num = in.nextInt();
        int  mul[] = new int[11];
        
        for (int i=1 ; i<=10 ; i++)
        {
        	
        		mul[i]=num*i;
        		System.out.println(mul[i]);
        		
        			
        }
	}

}
