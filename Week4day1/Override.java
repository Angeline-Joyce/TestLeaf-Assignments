package week4.Week4day1;

public class Override extends Overloadandride {
	public void reportStep(String msg1, String status1) {
		System.out.println(msg1 + status1);
	}
	public static void main(String[] args) {
		Override or= new Override();
		or.reportStep("overriding", "done");
		or.reportStep("overloading", "done", true);
	}

}
