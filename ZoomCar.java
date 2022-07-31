package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZoomCar {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.zoomcar.com/in/bangalore");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Select country']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Select country']")).sendKeys("India");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
}