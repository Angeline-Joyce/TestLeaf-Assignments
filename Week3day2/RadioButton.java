package week3.Week3day2;

public class RadioButton extends Button{
	public void selectRadioButton() {
		System.out.println("Select the radio button");
	}
	public static void main(String[] args) {
		RadioButton Rb = new RadioButton();
		Rb.selectRadioButton();
		Rb.submit();
	}

}
