package tesetleaf;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String url=driver.getCurrentUrl();
		System.out.println(" URL:  "  +url);
		String actualTitle = driver.getTitle();
		System.out.println("TITLE :  "  +actualTitle);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("//input[contains(@class,'inputtext _55r1')]")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.xpath("(//input[contains(@class,'inputtext _55r1')])[2]")).sendKeys("Tuna321");
		driver.findElement(By.name("login")).click();
	    //driver.quit();
	}


}
