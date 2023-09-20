package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

  public class Imdb_rating {

	  public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.imdb.com/chart/top");
		System.out.println("Current URL : " + driver.getCurrentUrl());
		System.out.println("Current Title : " + driver.getTitle());
		
		WebElement drp = driver.findElement(By.xpath("//select[@id='sort-by-selector']"));
		
		Select drpt = new Select(drp);

		drpt.selectByVisibleText("IMDb rating");
		System.out.println("Highest rating movie is : " + driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[3]/section/div/div[2]/div/ul/li[1]/div[2]/div/div/div[1]/a/h3")).getText());
		
		drpt.selectByVisibleText("Release date");
		driver.findElement(By.xpath("//button[@id='swap-sort-order-button']")).click();
		System.out.println("Oldest movie is : " + driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[3]/section/div/div[2]/div/ul/li[1]/div[2]/div/div/div[1]/a/h3")).getText());
		
		//drpt.selectByVisibleText("Release date");
		driver.findElement(By.xpath("//button[@id='swap-sort-order-button']")).click();
		System.out.println("Recent movie is : " + driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[3]/section/div/div[2]/div/ul/li[1]/div[2]/div/div/div[1]/a/h3")).getText());
	}

}
