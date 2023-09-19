package day1;

import java.awt.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkedin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://in.linkedin.com/");
		System.out.println("Current URL : " + driver.getCurrentUrl());
		System.out.println("Current Title : " + driver.getTitle());
		
		WebElement email = driver.findElement(By.xpath("//input[@name='session_key']"));
		email.sendKeys("adarshashesh@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("*********");
		
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Thread.sleep(5000);
		
		WebElement count = driver.findElement(By.xpath("//a[@id='ember155']/div/div[2]/span/strong"));
        System.out.println("Number of viewed profile : "  + count.getText());
	}

}
