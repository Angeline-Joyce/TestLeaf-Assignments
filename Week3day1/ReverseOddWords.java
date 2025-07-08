package week3.Week3day1;

public class ReverseOddWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] words = test.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			if(i%2==0) {
				System.out.println(words[i]);
			}
			else {
				char[] letters = words[i].toCharArray();
				for (int j = letters.length -1 ; j >= 0 ; j--) {
					System.out.println(letters[j]);
				}
			}
			
		}
	}
}
