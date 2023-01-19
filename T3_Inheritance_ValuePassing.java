package Session3;

/*Task 3: Write a Java Program

a) Three different classes should be defined and A should be inherited in B  & B should be inheited in C
b) All class should contain different method name should return values with formal parameter
ex: public int display (int a, int b)

c) call the method via object with actual parameter.
Ex: int s=obj.display(5,6)

(Hint: Inheritance and Value passing)*/

class appraisal {  
	 
		
	public void Hike(float a, double b) 
	{
		
		double hike_percent = a*b;
		System.out.println("The revised salary of employee post appraisal increased by "+ hike_percent);
		
		
	}
	
	}  

class  Employee extends appraisal {
	
	public void Level(int level, String designation) 
	{
		
		System.out.println("Employee at level - "+ level +" has designation as :" +designation);
		
		
	}
	
	
}


public class T3_Inheritance_ValuePassing extends appraisal {
	
	
	public static void main(String args[])
	{  
		
		Employee emp = new Employee();
		appraisal appr = new appraisal();
		emp.Level(3, "Test Lead");
		appr.Hike(1000000, 0.04);
		
		
		
		}  
}



