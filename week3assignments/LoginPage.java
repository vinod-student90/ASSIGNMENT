package week3assignments;

public class LoginPage extends BasePage {
	
	@Override
	
	public void performCommonTasks()
	{
		System.out.println("perform task");
	}

	public static void main(String[] args) {
		
		LoginPage page = new LoginPage();
		 page.clickElement();
		 page.performCommonTasks();

	}

}
