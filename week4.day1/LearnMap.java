package week4.day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap {

	public static void main(String[] args) {
		
		Map<String, String> obj = new HashMap<String, String>();
		obj.put("OKM", "Manirathnam");
		obj.put("Nayagan", "Manirathnam");
		obj.put("I", "Shankar");
		obj.put("VTV", "GVM");
		obj.put("Asuran", "Vettrimaran");
		
		for(Entry<String, String> eachEntry : obj.entrySet()) {
			System.out.println( eachEntry.getKey()+"-->"+eachEntry.getValue() );
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * System.out.println(obj.size()); System.out.println(obj.get("VTV"));
		 * obj.put("VTV", "Gowtham"); System.out.println(obj.get("VTV"));
		 * 
		 * System.out.println(obj.containsKey("i"));
		 * 
		 * obj.clear();
		 * 
		 * System.out.println( obj.isEmpty() );
		 */
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
