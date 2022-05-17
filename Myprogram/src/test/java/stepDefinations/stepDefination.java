package stepDefinations;

import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;

import Pageobject.Searchclass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import utility.Exceldata;
import utility.baseclass;

@RunWith(Cucumber.class)
public class stepDefination extends baseclass {


	

	    @Given("^initialize the browser with chrome$")
	    public void initialize_the_browser_with_chrome() throws Throwable {
	    	driver = initializeDriver();
	    }

	    @And("^Navigate to  \"([^\"]*)\" site$")
	    public void navigate_to_something_site(String strArg1) throws Throwable {
	    	driver.get(strArg1);
			driver.manage().window().maximize();
	    }
	    @When("^find the The Taj Mahal Palace Mumbai from drop down$")
	    public void find_the_the_taj_mahal_palace_mumbai_from_drop_down() throws Throwable {
	    	Searchclass s = new Searchclass(driver);
	    	Exceldata e = new Exceldata();
	    	s.getSearch().sendKeys(e.getStringData("first", 0, 0));
	        
	    }

	   

	    

	    @And("^click on the search option enter the seach key Mumbai$")
	    public void click_on_the_search_option_enter_the_seach_key_mumbai() throws Throwable {
	    	Searchclass s = new Searchclass(driver);
	    	Exceldata e = new Exceldata();
	    	s.getDestination().sendKeys("The Taj Mahal Palace Mumbai");
			s.getDestination().sendKeys(Keys.ARROW_DOWN);
			s.getDestination().sendKeys(Keys.ENTER);
	    }

	    @And("^close browser$")
		public void close_browser() throws Throwable {
			driver.quit();
		}

	

}
