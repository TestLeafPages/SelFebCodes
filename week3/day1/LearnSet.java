package week3.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		
		Set<String> values = new LinkedHashSet<String>();		
		values.add("SBI");
		values.add("IOB");
		values.add("PNB");
		values.add("Axis");
		values.add("HDFC"); 
		values.add("IOB");
		
		List<String> listValues = new ArrayList<String>(values);
		System.out.println(listValues.get(3));
		
		/*
		 * for (String eachValue : listValues) { System.out.println(eachValue); }
		 */

		
		
		
		
		
		
	}
	
}
