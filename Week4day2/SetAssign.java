package week4.Week4day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetAssign {

	public static void main(String[] args) {
		 String companyName = "google";
		 char[] charArray = companyName.toCharArray();
		 Set<Character> uniquechar = new LinkedHashSet<Character>();
		 Set<Character> duplicates = new LinkedHashSet<Character>();
		 for (int i = 0; i < charArray.length; i++) {
			 
			 boolean b = uniquechar.add(charArray[i]);
			 if(!b) {
				 duplicates.add(charArray[i]);
			 }
			 
		 }
		 System.out.println("Unique Characters :" + uniquechar);	
		 System.out.println("Duplicate Characters :" + duplicates);


		}
		 

	}


