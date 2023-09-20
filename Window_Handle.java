package day1;

import java.awt.List;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");
		System.out.println("Current URL1 : " + driver.getCurrentUrl());
		System.out.println("Current Title1 : " + driver.getTitle());
		
		driver.switchTo().frame("iframeResult");
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Try it']"));
		button.click();
		
		Set<String> windowids = driver.getWindowHandles();
		ArrayList windowidsList = new ArrayList(windowids);
		Object parentWindowId = windowidsList.get(0);
		Object childWindowId = windowidsList.get(0);
		
		driver.switchTo().newWindow((WindowType) childWindowId);
		
		System.out.println("Current URL2 : " + driver.getCurrentUrl());
		System.out.println("Current Title2 : " + driver.getTitle());

	}

}
