package week3assignments;

public class LoginTestData extends Testdata {
	public void enterUsername()
	{
		System.out.println("usename");
	}
	public void enterPassword()
	{
		System.out.println("PASSWORD" );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginTestData input = new LoginTestData();
		
       input.entercredentials();
       input.navigateToHomePage();
       input.enterUsername();
       input.enterPassword();
    
		  
  
  
		  
	}

}
