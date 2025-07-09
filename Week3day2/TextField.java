package week3.Week3day2;

public class TextField extends WebElement {
	public String getText() {
		return "Return Text value as output";
	}
	public static void main(String[] args) {
		TextField Tf = new TextField();
		System.out.println(Tf.getText());
		Tf.click();
		Tf.setText("Welcome");
	}
}
