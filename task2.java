package DataTypes;

public class task2 {

	public static void main(String[] args) {
		// Task 2: Write a Java program to declare a Boolean variable with initial 
		//value of “true” and later change it to “false” before printing it.
		
		boolean Bvariable= true;
		System.out.println("The initial value of Boolean variable was "+ Bvariable );
		
		
		if(Bvariable)
		{
			Bvariable= false;
			System.out.println("The changed value of Boolean variable now is "+ Bvariable );
		}
		
		

	}

}
