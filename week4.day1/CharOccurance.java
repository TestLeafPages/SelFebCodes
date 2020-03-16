package week4.day1;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharOccurance {

	public static void main(String[] args) {
		
		String str = "Most Important";
		char[] ch = str.toCharArray();
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for (char c : ch) {
			if (map.containsKey(c)) {
				Integer value = map.get(c);
				map.put(c, value+1);
			}else {
				map.put(c, 1);
			}
		}
		
		System.out.println(map);
		
		
		
		

	}

}
