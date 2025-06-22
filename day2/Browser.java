package week1.day2;

public class Browser {
	String launchBrowser(String browserName)
	{
		return browserName;
	}
	void loadUrl()
	{
		System.out.println("Application url loaded successfully");
	}
	
	public static void main(String[] args) {
		Browser b= new Browser();
		
		System.out.println(b.launchBrowser("Browser launched successfully"));
		b.loadUrl();
		
	}

}
