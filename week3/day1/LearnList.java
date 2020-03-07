package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		
		List<String> values = new ArrayList<String>();		
		values.add("SBI"); //0
		values.add("IOB");
		values.add("PNB");
		values.add("Axis");
		values.add("HDFC"); //size-1
		values.add("IOB");
//		values.add(2, "ICICI");
		List<String> newValues = new ArrayList<String>(values);
		values.remove("Axis");
		newValues.removeAll(values);
//		newValues.retainAll(values);
		for (String eachValue : newValues) {
			System.out.println(eachValue);
		}
		
		
		
		
		
		
		
		
		
		
		/*
		 * values.clear(); Collections.sort(values); Collections.reverse(values); for
		 * (String eachValue : values) { System.out.println(eachValue); }
		 */		
		
		
		
		
		
		
		
		
		
		/*
		 * for (int i = 0; i < values.size(); i++) { System.out.println(values.get(i));
		 * }
		 */
		
		
		
		
		
		
		
		
		/*
		 * System.out.println(values.size()); System.out.println(values.get(2));
		 */
		
		
		
		
		
		
		
		
		
	}
	
}
