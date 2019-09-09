package CollectionConcept;

import java.util.HashMap;
import java.util.Map;

public class MapConcept {
	
	public static void main(String[] args) {
	     // hashmap is a class implements Map interface.
		// extends AbstractMap.
		// it contains only unique elements.
		// stores the value  - key -- value pair.
		// it may have one null key and multiple null values.
		// it maintains no order.
		

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "JAVA");
	    hm.put(4, "PKL");
	    
	    System.out.println(hm.get(1));
	    
	    System.out.println(hm.get(4));
	    
	    System.out.println("****");
	    
	    for(Map.Entry m :hm.entrySet())
	    {
	    	System.out.println(m.getKey() +" "+m.getValue());
	    }
		
	    hm.remove(3);
		System.out.println(hm);
	
		

		
		
		
		
		
		
		
		
		
	}

}
