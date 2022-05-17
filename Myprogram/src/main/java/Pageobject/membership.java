package Pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class membership {
	public WebDriver driver;
	
	By view=By.xpath("/html/body/div[1]/div[2]/main/div[3]/div/div/div[3]/div/div[2]/div/div[2]/div/div[1]/div/div[3]/div[2]/button");

	public membership(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getView() {
		// TODO Auto-generated method stub
		return driver.findElement(view);
	}

}
