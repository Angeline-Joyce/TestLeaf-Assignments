package week4.Week4day1;

public class BasePage {
	public void findElement() {
		System.out.println("Element Found");
	}
	public void clickElement() {
		System.out.println("Element CLicked");
	}
	public void enterText() {
		System.out.println("Text Entered Successfully");
	}
	public void performCommonTasks() {
		System.out.println("Common Tasks performed");
	}
	public static void main(String[] args) {
		BasePage bp = new BasePage();
		bp.findElement();
		bp.clickElement();
		bp.enterText();
		bp.performCommonTasks();
	}

}
