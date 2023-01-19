package Session3;

/*
 * a) Two different classes should be defined and one class should be an
 * interface . b) Define five methods in interface c) Implement interface in
 * other class with those five methods definition
 */


interface printable
  {  
	void print();  
	void add(int a,int b);
	void sub(float a , float b);
	void div(double a, double b);
	void mul(int a, int b);
	
  }  

public class T5_Interface implements printable 

{
	
	public void print()
	{
		System.out.println("HI");
	}

	public void add(int a, int b) {
	
		System.out.println(a*b);
	}

	public void sub(float a, float b) {
		
		System.out.println(a-b);
	}

	public void div(double a, double b) {
	
		System.out.println(a/b);
	}

	public void mul(int a, int b) {
		
		System.out.println(a*b);
	}
	
	public static void main(String[] args) 
	{
		
		T5_Interface obj = new T5_Interface();  
		obj.print(); 
		obj.add(10, 10);
		obj.sub(106, 6);
		obj.div(100, 5);
		obj.mul(100, 5);
		
		}

	
	}	
