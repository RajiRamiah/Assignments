package decisionMaking;

public class DMTask4 {

	public static void main(String[] args) {
		// Write a program to calculate the sum of first 10 natural number. 
		//[Try the program in for,while and do while]
		
		int i =0;
		int j = 0;
		
//for loop
		for ( i =1; i<=10 ; i++)
		{
			j=i+j;
		
	    }
		System.out.println("The sum of first 10 natural numbers using for loop is = " + j);
		
		int a=0;
		int b = 0;
// while loop 
	while (a<=10) {
		b=b+a;
		a++;
	}
	System.out.println("The sum of first 10 natural numbers using while loop is = " + b);
// do while loop 
	
	int m=0;
	int n = 0;
	
	do {
		n= m+n;
		m++;
	}
while(m<=10);
	System.out.println("The sum of first 10 natural numbers using do while loop is = " + n);
	
	
	}}
