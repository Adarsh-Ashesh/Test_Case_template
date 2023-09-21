package day1;

import java.awt.List;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

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
		//List<String> windowidsList = new ArrayList(windowids);
		java.util.Iterator<String> it = windowids.iterator();
		
		String parentWindowId = it.next();
		String childWindowId =  it.next();
		
		System.out.println("Parent : " + parentWindowId);
		System.out.println("Child : " + childWindowId);
		
		
		
		driver.switchTo().window(childWindowId);
		Thread.sleep(4000);
		driver.switchTo().window(parentWindowId);
		
		Thread.sleep(4000);
		driver.close();

	}

}
