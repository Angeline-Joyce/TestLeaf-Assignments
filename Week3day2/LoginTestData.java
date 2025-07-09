package week3.Week3day2;

public class LoginTestData extends TestData {
	public void enterUsername() {
		System.out.println("joycange@amazon.com");
	}
	public void enterPassword() {
		System.out.println("2025@Ajoy");
	}
	public static void main(String[] args) {
		LoginTestData Ltd = new LoginTestData();
		Ltd.enterPassword();
		Ltd.enterUsername();
		Ltd.enterCredentials();
		Ltd.navigateToHomePage();
		
	}

}
