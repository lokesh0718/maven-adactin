package Com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_hotel {
	public Book_hotel(WebDriver driver4) {
		
		this.driver=driver4;
		PageFactory.initElements(driver4, this);
	}


	public WebDriver driver;
	@FindBy(id="first_name")
	private WebElement first_name;
	
	@FindBy(id="last_name")
	private WebElement last_name;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement credit_cardno;
	
	@FindBy(id="cc_type")
	private WebElement  credit_cardtype;
	
	@FindBy(id="cc_exp_month")
	private WebElement  exp_date;
	
	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getFirst_name() {
		return first_name;
	}


	public WebElement getlast_name() {
		return last_name;
	}


	public WebElement getAddress() {
		return address;
	}


	public WebElement getCredit_cardno() {
		return credit_cardno;
	}


	public WebElement getCredit_cardtype() {
		return credit_cardtype;
	}


	public WebElement getExp_date() {
		return exp_date;
	}


	public WebElement getExp_year() {
		return exp_year;
	}


	public WebElement getCcv_number() {
		return ccv_number;
	}


	public WebElement getBook_now() {
		return book_now;
	}


	@FindBy(id="cc_exp_year")
	private WebElement exp_year;
	
	
	@FindBy(id="cc_cvv")
	private WebElement ccv_number;
	
	
	@FindBy(id="book_now")
	private WebElement book_now;

}
