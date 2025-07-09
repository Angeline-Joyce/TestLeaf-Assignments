package week3.Week3day2;

public class Button extends WebElement {
	public void submit() {
		System.out.println("Click submit button");
	}
	public static void main(String[] args) {
		Button b = new Button();
		b.submit();
		b.setText("Hai AJ");
		b.click();
	}

}
