package DataTypes;

public class Task4 {

	public static void main(String[] args) {
		// Task 4: Write a Java program to declare a int variable with initial value of “5” 
		// and convert it to “String” before printing it. (Hint : Surf Net)
		
		int a = 5 ;
		
		String str1 = Integer.toString(a);
		String str2 = String.valueOf(a);
		
		Integer obj = new Integer(a);
        String str3 = obj.toString();
        String str4 = new Integer(a).toString();
		
		System.out.println("String str1 = " + str1);
		System.out.println("String str2 = " + str2);
		System.out.println("String str3 = " + str3);
		System.out.println("String str4 = " + str4);
		
		

	}

}
