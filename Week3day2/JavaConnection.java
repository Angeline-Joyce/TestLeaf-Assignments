package week3.Week3day2;

public class JavaConnection implements DatabaseConnection {

	@Override
	public void connect() {
		System.out.println("Connect to Java Database");
	}
	@Override
	public void disconnect() {
		System.out.println("Disconnect from Java Database");
	}
	@Override
	public void executeUpdate() {
		System.out.println("Execution done");
	}
	public void Javadata() {
		System.out.println("Captured the Xpath for elements");
	}
	public static void main(String[] args) {
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		jc.Javadata();
		jc.loginStatus();
		
	}

}
