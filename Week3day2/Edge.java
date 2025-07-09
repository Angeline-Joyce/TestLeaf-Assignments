package week3.Week3day2;

public class Edge extends Browser {
	public void takeSnap() {
		System.out.println("Takesnap action performed");
	}
	public void clearCookies() {
		System.out.println("Cleared cookies");
	}
	public static void main(String[] args) {
		Edge e = new Edge();
		e.browserName();
		e.browserVersion();
		e.clearCookies();
		e.takeSnap();
		
	}
}

