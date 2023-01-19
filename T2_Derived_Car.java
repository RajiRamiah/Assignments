package Session3;

public class T2_Derived_Car extends T2_Base_Vehicle {

	private String modelName = "Figo_Aspire";    // Car attribute
	  
	  
		public void honk() {                    // Vehicle method
		    System.out.println("tring, tring!");
		  }
	
	public static void main(String[] args) {

	    // Create a myCar object
		  T2_Derived_Car myCar = new T2_Derived_Car();

	    // Call the honk() method and this should return statement from method in this class 
	    myCar.honk();
	    // Call the applyBrake() method from BaseClass
	    myCar.applyBrake();
	    

	    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
	    System.out.println(myCar.brand + " " + myCar.modelName);
	    
	    staticMethod();
}
}
