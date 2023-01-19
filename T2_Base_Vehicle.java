package Session3;

public class T2_Base_Vehicle {
	
	protected String brand = "Ford";        // Vehicle attribute
	  
	public void honk() {                    // Vehicle method
	    System.out.println("Pomm, Bommm!");
	  }
	
	public void applyBrake()
	{
		System.out.println("Sqqqzzzzjjj");
	}
	
	 static String staticMethod(){
	        System.out.println("I am from Static method - You can call me by class name directly - No need of object");
	        return "Hurray I am here directly without any object created";
	    }

}
