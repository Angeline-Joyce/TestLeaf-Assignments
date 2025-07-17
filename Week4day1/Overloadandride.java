package week4.Week4day1;

public class Overloadandride {
	public void reportStep(String msg, String status) {
		System.out.println(msg + status);
	}
	public void reportStep(String msg, String status, Boolean snap) {
		System.out.println(msg + status + snap);
	}
	public static void main(String[] args) {
		Overloadandride olr = new Overloadandride();
		olr.reportStep("Hi", "Available");
		olr.reportStep("Hello", "Absent", true);
		
	}
}
