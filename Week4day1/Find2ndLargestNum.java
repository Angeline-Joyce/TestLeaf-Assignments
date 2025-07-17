package week4.Week4day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find2ndLargestNum {

	public static void main(String[] args) {
		int num[] = {3, 2, 11, 4, 6, 7};
		Arrays.sort(num);

		List<Integer> largestnum = new ArrayList<Integer>();
		for (Integer integer : num) {
			largestnum.add(integer);
		}
		System.out.println("Sorted Array :" + largestnum);
		
		int size = largestnum.size();
		
		Integer second = largestnum.get(size - 2);
		System.out.println("Second Largest Num :" + second);
		}
}
