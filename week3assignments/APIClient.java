package week3assignments;

public class APIClient {
	
	private static final boolean False = false;
	public void sendRequest(String endpoint)
	{
		System.out.println(endpoint);
	}
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus)
	{
		if(requestBody.contains("raj"))
		{
			System.out.println("true");
		}
		else
			
		System.out.println("false");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APIClient obj = new APIClient();
		obj.sendRequest("vinod");
		obj.sendRequest("raj","saaa",False);


	
}
	}


