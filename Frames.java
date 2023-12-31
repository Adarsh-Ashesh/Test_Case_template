package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		
		System.out.println("Current URL : " + driver.getCurrentUrl());
		System.out.println("Current Title : " + driver.getTitle());
		
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-left");
		
		WebElement leftFrame = driver.findElement(By.xpath("/html/body"));
		System.out.println("Text written in left frame is : " + leftFrame.getText());
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("frame-middle");
		
		WebElement middleFrame = driver.findElement(By.xpath("//*[@id=\"content\"]"));
		System.out.println("Text written in middle frame is : " + middleFrame.getText());
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("frame-right");
		
		WebElement rightFrame = driver.findElement(By.xpath("/html/body"));
		System.out.println("Text written in right frame is : " + rightFrame.getText());
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame-bottom");
		
		WebElement bottomFrame = driver.findElement(By.xpath("/html/body"));
		System.out.println("Text written in bottom frame is : " + bottomFrame.getText());
		driver.switchTo().parentFrame();
			

	}

}
