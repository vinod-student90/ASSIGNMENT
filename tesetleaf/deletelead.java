package tesetleaf;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class deletelead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
	    driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.xpath("//*[@id=\"login\"]/p[3]/input")).click();
	    driver.findElement(By.xpath("//*[@id=\"label\"]/a")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.xpath("/html/body/ul/li[2]/div/div/div/div/div/a")).click();
	    driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div[1]/div[2]/ul/li[3]/a")).click();
	    driver.findElement(By.xpath("//span[contains (text(),'Phone')]")).click();
	    driver.findElement(By.xpath("//*[@id=\"ext-gen270\"]")).sendKeys("9442207340");
	    driver.findElement(By.xpath("//*[@id=\"ext-gen334\"]")).click();
	    driver.findElement(By.xpath("/html/body/ul/li[2]/div/div/div/div/div/a")).click();
	    driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div[1]/div[2]/ul/li[3]/a")).click();
	    driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[1]/form/div/div[1]/div[1]/ul/li[1]/a[2]/em/span/span")).click();
	    driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[1]/form/div/div[2]/div/div/div/div/div[1]/div[1]/input")).sendKeys("10104");
	    driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[2]/div/div/table/tbody/tr/td/table/tbody/tr/td[2]/em/button")).click();
	    driver.findElement(By.xpath("//*[@id=\"ext-gen496\"]")).click();
	    driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div/div/div/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[1]/div/a")).click();
	    driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div[1]/div[1]/div/div/div/div[2]/a[4]")).click();
	     driver.close();
	    
	    
	    
	    
	}

}
