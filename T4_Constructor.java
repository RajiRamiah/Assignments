package Session3;

/*a) Two different classes should be defined and one class has to be inherited on the other.
b) Define a constructor in parent class. With the help of constructor , initialize variables in parent class.

Ex:
       class parent{
int a;
parent(int b)
{
a=b;
}
display
{
syso(a);
}
*/

class BaseClassWithConstructor  {
	
	 int id;  
	    String name;  
	
	BaseClassWithConstructor(int i,String n)
	
	{  
	   id = i;  
	   name = n;  
		System.out.println("Employee ID is "+id);
		System.out.println("Employee Name is "+name);
		
	}  
	
}


 public class T4_Constructor extends BaseClassWithConstructor {

	
	 T4_Constructor(int i, String n) {
		super(i, n);
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[])
		{  
			
			
		T4_Constructor obj = new T4_Constructor(318, "Rajalakshmi Gurusamy Ramiah");
		
		
		
			
			}  
	
	
	

}


