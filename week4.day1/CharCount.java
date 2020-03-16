package week4.day1;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharCount {

	public static void main(String[] args) {
		/* output = t - 3 */		
		String input = "Most Important";
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		char ch = 'o';
		int count = 0;
		
		char[] ch1 = input.toCharArray();
		for (char c : ch1) {
			if (c==ch) {
				count++;
			}
		}
		
		map.put(ch, count);
		System.out.println(map);
		
		
		

	}

}
