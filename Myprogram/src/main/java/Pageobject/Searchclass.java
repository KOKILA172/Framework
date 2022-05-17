package Pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Searchclass {
	public WebDriver driver;
	
	
	
	By search=By.xpath("//*[@id='home-search']/div[2]/div[1]/input");
     By detination=By.xpath("//*[@id='website-hotel-result']/a[4]");
     By title=By.xpath("/html/body/div[1]/div/div[2]/main/div[3]/div/div/div[5]/section/div/div[1]/div[1]/div/div[1]/h1/span");
	public Searchclass(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getSearch() {
		// TODO Auto-generated method stub
		return driver.findElement(search);
	}
	
	
	public WebElement getDestination() {
		// TODO Auto-generated method stub
		return driver.findElement(detination);
	}


	public WebElement gettitle() {
		// TODO Auto-generated method stub
		return driver.findElement(title);
	}
}
