package example.Swiggyy;

import java.util.Scanner; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class swiggy_testing {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.setProperty("webdriver.edge.driver",
				"D:\\AIT(YCP) Cdac\\SDM\\edge\\edgedriver_arm64\\");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		driver.findElement(By.className("gLFyf")).sendKeys("swiggy");
		Thread.sleep(1000);
		driver.findElement(By.className("wM6W7d")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("VuuXrf")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("x4bK8")).click();
		Thread.sleep(1000);
		//System.out.print("Enter the Number : ");
		//try {
		//int num=sc.nextInt();
		By.className("_381fS");
		driver.findElement(By.id("mobile")).sendKeys("9850741492");
		//}catch(Exception e) {}
		driver.findElement(By.className("a-ayg")).click();
		System.out.print("Enter the OTP : ");
		String otp=sc.next();
		Thread.sleep(1000);
		driver.findElement(By.id("otp")).sendKeys(otp);
		Thread.sleep(1000);
		driver.findElement(By.className("a-ayg")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("_2bm8r")).click();
	}

}