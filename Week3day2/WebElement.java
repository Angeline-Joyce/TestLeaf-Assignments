package week3.Week3day2;

public class WebElement {
	public void click() {
		System.out.println("CLick on the web element");
	}
	public void setText(String text) {
		System.out.println(text);
	}
	public static void main(String[] args) {
		WebElement we = new WebElement();
		we.click();
		we.setText("Hello Element");
	}

}
