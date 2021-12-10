package Com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_hotel {
	public WebDriver driver;
	@FindBy(xpath="//input[@type='radio']")
	private WebElement radio_btn;
	@FindBy(id="continue")
	private WebElement login_selecthotel;
	public Select_hotel(WebDriver driver3) {
		
this .driver= driver3;
PageFactory.initElements(driver3, this);
	}
	public WebElement getRadio_btn() {
		return radio_btn;
	}
	public WebElement getLogin_selecthotel() {
		return login_selecthotel;
	}
	

}
