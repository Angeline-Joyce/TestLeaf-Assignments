package week4.Week4day1;

import java.util.HashSet;
import java.util.Set;

public class FindMissingElements {

	public static void main(String[] args) {
		int num[]={1, 2, 3, 4, 10, 6, 8};
		
		Set<Integer> missingelement = new HashSet<Integer>();
		for (Integer integer : num) {
			missingelement.add(integer);
		}
		System.out.println("Before finding missing element: \n" + missingelement);
		System.out.println("After finding missing element: ");
		for (int i = 1; i <=10; i++) {
			if(!missingelement.contains(i)) {
				System.out.println(i);
			}
		}
		
		

}}
