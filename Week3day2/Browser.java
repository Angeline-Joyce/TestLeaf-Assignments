package week3.Week3day2;

public class Browser {
	String browsername = "Chrome";
	String browserversion = "5.8";
	public void browserName() {
		System.out.println("Browsername:"+ browsername);
	}
	public void browserVersion() {
		System.out.println("BrowserVersion:"+ browserversion);
	}
	public static void main(String[] args) {
		Browser bro= new Browser();
		bro.browserName();
		bro.browserVersion();
		
	}
	
}
