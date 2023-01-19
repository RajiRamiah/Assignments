package Session3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class T6_List_Set {

	public static void main(String[] args) {
		/*
		 * a) Add 10 values (Include duplicate Values) in List and Set b) Print all
		 * values via enhanced for and remove 3rd value c) Iterate all values
		 */
		
		ArrayList<String> list=new ArrayList<String>();  
		   list.add("Raji");  
		   list.add("Ramiah");  
		   list.add("Guru");  
		   list.add("Meenu");
		   list.add("Palani");
		   list.add("Mithru");
		   list.add("Dhanam");
		   list.add("Gaya3");
		   list.add("Chitthapa");
		   list.add("Rithanya");
		   
		   //traversing the list of elements using for-each loop  
		   for(String s:list){  
		     System.out.println(s);  
		   }  
		   
		   System.out.println(list.get(2));
		   
		   list.remove(2);
		   
		   //Verify if the 3rd value got removed 
		   
			/*
			 * for(String s:list){ System.out.println(s); }
			 */
		   
		   Set<String> Chocy = new HashSet<String>();     
		      
		   Chocy.add("DairyMilk");     
		   Chocy.add("Toblerone");     
		   Chocy.add("Galaxy"); 
		   Chocy.add("DairyMilk");  
		   Chocy.add("Chikki");  
		   Chocy.add("Chikki");   
	      
	        System.out.println(Chocy);  

		   
		   
	}

}
