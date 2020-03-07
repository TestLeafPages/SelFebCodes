package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

//	ylIndi
public class RemoveDuplicates {

	public static void main(String[] args) {

		//	Declare a String as PayPal India
		String str = "PayPal India";
		//	Convert it into a character array
		char[] charArray = str.toCharArray();
		//	Declare a Set as charSet for Character
		Set<Character> charSet = new LinkedHashSet<Character>();
		//	Declare a Set as dupCharSet for duplicate Character
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		//	Iterate character array and add it into charSet
		for (Character eachChar : charArray) {
			//	if the character is already in the charSet then, add it to the dupCharSet
			if(!charSet.add(eachChar)) {	
				//	Check the dupCharSet elements and remove those in the charSet
				dupCharSet.add(eachChar);
			}
		}
		charSet.removeAll(dupCharSet);
		//	Iterate using charSet
		for (Character each : charSet) {
			//Check the iterator variable isn't equals to an empty space
			if(each!=' ')
//				print it
				System.out.print(each);
		}

	}

}
