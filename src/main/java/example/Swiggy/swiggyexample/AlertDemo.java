package example.Swiggy.swiggyexample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoAlertPresentException;	
import org.openqa.selenium.Alert;

public class AlertDemo {
	
	public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {									
		System.setProperty("webdriver.edge.driver",
				"D:\\AIT(YCP) Cdac\\SDM\\edge\\edgedriver_arm64\\");
		WebDriver driver = new ChromeDriver();
	
        
        // Alert Message handling
                    		
        driver.get("https://demo.guru99.com/test/delete_customer.php");			
                            		
        Thread.sleep(3000);
        driver.findElement(By.name("cusid")).sendKeys("53920");					
        driver.findElement(By.name("submit")).submit();			
        		
        // Switching to Alert 
        Alert alert = driver.switchTo().alert();		
        		
        // Capturing alert message.
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message
        System.out.println(alertMessage);	
        Thread.sleep(3000);
        		
        // Accepting alert		
        alert.accept();		
    }	

}