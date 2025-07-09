package week3.Week3day2;

public class CheckBoxButton extends Button {
	public void clickCheckButton() {
		System.out.println("Click on the check button");
	}
	public static void main(String[] args) {
		CheckBoxButton ccb = new CheckBoxButton();
		ccb.clickCheckButton();
		ccb.submit();
	}
}
