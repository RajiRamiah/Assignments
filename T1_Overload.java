package Session3;

public class T1_Overload {

	
		/*
		 * Task 1: Write a Java Program
		 * 
		 * a) A class should consist of five same method but different parameters. b)
		 * Parameters may be of any data types. c) All methods should return values
		 * which has to be printed in main method.
		 * 
		 * (Hint : Overload)
		 */
		
		public int sum(int x, int y)
		{
			return (x + y);
		}
		  
	    // This sum takes three int parameters
	    public int sum(int x, int y, int z)
	    {
	        return (x + y + z);
	    }
	  
	    // This sum takes four int parameters
	    public int sum(int w,int x, int y, int z)
	    {
	        return (w+ x + y + z);
	    }
	    // This sum takes two double parameters
	    
	    public double sum(double x, double y)
	    {
	        return (x + y);
	    }
	    
	    public float sum(float x, float y)
	    {
	    	return(x+y);
	    }
	    
		
	    public static void main(String[] args) {
	    	
	    	T1_Overload s = new T1_Overload();
	        System.out.println(s.sum(10, 20));
	        System.out.println(s.sum(10, 20, 30));
	        System.out.println(s.sum(1,2,3,4));
	        System.out.println(s.sum(0.1,0.77));
	        System.out.println(s.sum(10.5, 20.5));
		
	}

}
