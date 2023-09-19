package day1;

//import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.bookmyshow.com/explore/home/chennai");
		System.out.println("Current URL : " + driver.getCurrentUrl());
		System.out.println("Current Title : " + driver.getTitle());

		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Number of hyperlinks present are : " + links.size());
		
        java.util.List<WebElement> imgLinks = driver.findElements(By.xpath("//div[@class='style__WidgetContainerBody-sc-lnhrs7-4 YeNog']/div/a"));
		
		System.out.println("Number of image links present are : " + imgLinks.size());
		
		
		}
	}


