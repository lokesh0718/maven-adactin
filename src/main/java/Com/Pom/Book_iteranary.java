package Com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_iteranary {
	
	public WebDriver driver;
	@FindBy(id="my_itinerary")
	private WebElement book_confirm;
	public Book_iteranary(WebDriver driver5) {
		
		this.driver=driver5;
		PageFactory.initElements(driver5, this);
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getBook_confirm() {
		return book_confirm;
	}
	

}
