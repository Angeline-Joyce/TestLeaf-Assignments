package week3.Week3day2;

public class Chrome extends Browser {
	public void openIncognito() {
		System.out.println("openIncognito opened");
	}
	public void clearCache() {
		System.out.println("clearCache done");
	}
	public static void main(String[] args) {
		Chrome c = new Chrome();
		c.browserName();
		c.browserVersion();
		c.clearCache();
		c.openIncognito();
	}
}
