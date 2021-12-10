package Com.mvn_miniproject.Maven_adactin;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import Com.Pom.Book_hotel;
import Com.Pom.Book_iteranary;
import Com.Pom.Home_page;
import Com.Pom.Search_Hotel;
import Com.Pom.Select_hotel;
import sdp.Pom.Project_object_manager;

public class Runner_class extends Base_class {
	
	public static WebDriver driver= systemproperty("chrome");
	
	public static  Project_object_manager pom = new  Project_object_manager(driver);
	public static void main(String[] args) throws InterruptedException, IOException {

	//	driver = systemproperty("chrome");

		url("https://adactinhotelapp.com/");

		sleepmethod(4000);
		System.out.println("HOME PAGE");
		//WebElement user = driver.findElement(By.id("username"));
		// Home_page hp = new  Home_page(driver);
		 
		input(pom.getinstancehp().getUser_name(), "Lokesh07");

		//WebElement pwd = driver.findElement(By.id("password"));
		
		input(pom.getinstancehp().getPwd(), "1E0Z50");
		//WebElement login = driver.findElement(By.id("login"));
		
		click(pom.getinstancehp().getLogin_homepagebtn());
		sleepmethod(3000);
		
System.out.println("SEARCH HOTEL");

//Search_Hotel sh  = new Search_Hotel(driver);


		//WebElement location = driver.findElement(By.id("location"));
		selectvisibletext(pom.getinstancesh().getLocation(), "Paris");

		//WebElement hotels = driver.findElement(By.id("hotels"));
		selectvisibletext(pom.getinstancesh().getHotel(), "Hotel Sunshine");

		//WebElement rooms = driver.findElement(By.id("room_type"));
		selectvisibletext(pom.getinstancesh().getRoom_type(), "Double");

	//	WebElement noof_rooms = driver.findElement(By.id("room_nos"));
		selectvisibletext(pom.getinstancesh().getNo_of_rooms(), "2 - Two");

		//WebElement adult = driver.findElement(By.id("adult_room"));
		selectvisibletext(pom.getinstancesh().getAdult_per_rooms(), "2 - Two");

		//WebElement child = driver.findElement(By.id("child_room"));
		selectvisibletext(pom.getinstancesh().getChild_per_rooms(), "2 - Two");

		//WebElement login2 = driver.findElement(By.id("Submit"));
		click(pom.getinstancesh().getSearch());
		sleepmethod(2000);

		
		System.out.println("SELECT HOTEL");
		//Select_hotel  sc =new Select_hotel(driver);
		//WebElement login3 = driver.findElement(By.xpath("//input[@type='radio']"));
		click(pom.getinstancesc().getRadio_btn());

		//WebElement login4 = driver.findElement(By.id("continue"));
		click(pom.getinstancesc().getLogin_selecthotel());
		sleepmethod(2000);
		
		System.out.println("BOOK A HOTEL");
		//Book_hotel bh =new Book_hotel(driver);
	//	WebElement firstname = driver.findElement(By.id("first_name"));
		input(pom.getinstancebh().getFirst_name(), "lokesh");
		//WebElement lastname = driver.findElement(By.id("last_name"));
		input(pom.getinstancebh().getlast_name(), "Murugan");

		//WebElement address = driver.findElement(By.id("address"));
		input(pom.getinstancebh().getAddress(), "Venkateshwara nagar ramapuram , chennai-600028");

		//WebElement cc_num = driver.findElement(By.id("cc_num"));
		input(pom.getinstancebh().getCredit_cardno(), "1234 4568 9876 3321");
		//WebElement cards = driver.findElement(By.id("cc_type"));

		selectvisibletext(pom.getinstancebh().getCredit_cardtype(), "Master Card");

		//WebElement exm = driver.findElement(By.id("cc_exp_month"));
		selectvisibletext(pom.getinstancebh().getExp_date(), "May");

		//WebElement exd = driver.findElement(By.id("cc_exp_year"));
		selectvisibletext(pom.getinstancebh().getExp_year(), "2022");

		//WebElement cvv = driver.findElement(By.id("cc_cvv"));
		input(pom.getinstancebh().getCcv_number(), "986");

		//WebElement login5 = driver.findElement(By.id("book_now"));
		click(pom.getinstancebh().getBook_now());
		sleepmethod(3000);
		javascript_method(pom.getinstancebh().getBook_now());

		sleepmethod(3000);
System.out.println("BOOKING  CONFIRMATION");
//Book_iteranary bc = new Book_iteranary(driver);
	//	WebElement login6 = driver.findElement(By.id("my_itinerary"));
		click(pom.getinstancebc().getBook_confirm());
		sleepmethod(3000);
		screenshotmethod();
		close();

	}

}
