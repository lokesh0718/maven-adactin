package Com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
public WebDriver driver;
	@FindBy(id="username")
	 private WebElement  user_name;
	
	@FindBy(id="password")
	 private WebElement  pwd;
	
	@FindBy(id="login")
	 private WebElement  login_homepagebtn;

	public Home_page(WebDriver driver1) {
		this.driver= driver1;
		PageFactory.initElements(driver1, this);;
		
	}

	public WebElement getUser_name() {
		return user_name;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLogin_homepagebtn() {
		return login_homepagebtn;
	}
	
	
}
