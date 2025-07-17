package week4.Week4day1;

public class APIClient {
	public void sendRequest(String endpoint) {
		System.out.println("Endpoint1 is : "+ endpoint);
	}
	public void sendRequest(String endpoint, String requestBody, String requestStatus) {
		System.out.println("Endpoint2 is : " + endpoint +" \nRequestbody : " + requestBody +" \nRequestStatus : " + requestStatus);
	}
	public static void main(String[] args) {
		APIClient api = new APIClient();
		api.sendRequest("100");
		api.sendRequest("100", "Chennai", "True");
	}
}
