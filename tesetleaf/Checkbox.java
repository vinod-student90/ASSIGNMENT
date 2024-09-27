package tesetleaf;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		driver.findElement(By.xpath("//span[contains(text(),'Basic')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Aja')]")).click();
		driver.findElement(By.xpath("//label[text()='Python']")).click();
		driver.findElement(By.xpath("//*[@id=\"j_idt87:ajaxTriState\"]/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt100\"]/div[2]")).click();
		 
		String text = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt102\"]")).getText();
		 
		 if(text.contains("verify if checkbox is disabled"));
		 {
			 System.out.println("disable");
		 }
		 driver.switchTo().frame("//*[@id=\"j_idt87:multiple\"]/ul");
		 WebElement dd = driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple_panel\"]/div[2]/ul/li[1]/label"));
		 //driver.findElement(By.xpath("/html/body/div[7]/div[2]/ul/li[1]/label")).click()
		  Select dropdown =new Select(dd);
		 
		  dropdown.selectByVisibleText("Miami") ;
		  //dropdown.selectByIndex(0);
		  
		  
		 
	}
		}

