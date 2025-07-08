package week3.Week3day1;

public class RemoveDupsInString {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java Week1"; 
		String[] words =text.split(" ");
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			for (int j = i+1 ; j < words.length; j++) {
				if(words[i].equalsIgnoreCase(words[j])) {
					words[j]="";
					count++;
				}
			}
		}
		if(count>0) {
			System.out.println("After remvoing dups");
			for (int i = 0; i < words.length; i++) {
				System.out.println(words[i]);
			}
			}
		else {
			System.out.println("No duplicates found");
		}
	
	}}