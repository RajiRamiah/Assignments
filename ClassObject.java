package Week2Assessments;

//Task 1: Write a Java Program
//a) A class should consist of five global variables with value
//b) All variables should be printed in the main method through object creation.

public class ClassObject {
	
	public static int a= 8;
    public static String b = "String";
    public static boolean Flag = true;
    public static double Height = 155.55;
    public static char Grade = 'A';

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassObject Obj = new ClassObject();
		System.out.println("The 5 variables in the program are - " +Obj.a +' '+Obj.b+' '+Obj.Flag
				+' '+Obj.Height+' '+Obj.Grade);
		
	}

}
