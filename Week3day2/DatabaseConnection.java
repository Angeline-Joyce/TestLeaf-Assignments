package week3.Week3day2;

public interface DatabaseConnection {
	public void connect();
	public void disconnect();
	public void executeUpdate();
	default void loginStatus() {
		System.out.println("Log in Success");
	}
	

}
