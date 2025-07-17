package week4.Week4day1;

public class LoginPage extends BasePage {
	public void performCommonTasks() {
		System.out.println("Perform Common Tasks assigned");
	}
	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
		lp.performCommonTasks();
	}

}
