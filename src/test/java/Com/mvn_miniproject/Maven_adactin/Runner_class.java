package Com.mvn_miniproject.Maven_adactin;

import java.io.File;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

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

	public static WebDriver driver = systemproperty("chrome");

	public static Project_object_manager pom = new Project_object_manager(driver);

	public static Logger log = Logger.getLogger(Runner_class.class);

	public static void main(String[] args) throws InterruptedException, IOException {
 
		PropertyConfigurator.configure("Log4j.Properties");
		log.info("get url");
		
		url("https://adactinhotelapp.com/");

		sleepmethod(4000);
		//System.out.println("HOME PAGE");
        log.info("home page");
		input(pom.getinstancehp().getUser_name(), read_data("C:\\Users\\Lokesh M\\eclipse-workspace\\Maven_adactin\\Adactin Test case.xlsx", 1, 5));

		input(pom.getinstancehp().getPwd(),read_data("C:\\Users\\Lokesh M\\eclipse-workspace\\Maven_adactin\\Adactin Test case.xlsx", 2, 5) );

		click(pom.getinstancehp().getLogin_homepagebtn());
		sleepmethod(3000);
		log.info("Search hotel");
		//System.out.println("SEARCH HOTEL");

		selectvisibletext(pom.getinstancesh().getLocation(), "Paris");

		selectvisibletext(pom.getinstancesh().getHotel(), "Hotel Sunshine");

		selectvisibletext(pom.getinstancesh().getRoom_type(), "Double");

		selectvisibletext(pom.getinstancesh().getNo_of_rooms(), "2 - Two");

		selectvisibletext(pom.getinstancesh().getAdult_per_rooms(), "2 - Two");

		selectvisibletext(pom.getinstancesh().getChild_per_rooms(), "2 - Two");

		click(pom.getinstancesh().getSearch());
		sleepmethod(2000);
		log.info("Select Hotel");
		//System.out.println("SELECT HOTEL");
		click(pom.getinstancesc().getRadio_btn());

		click(pom.getinstancesc().getLogin_selecthotel());
		sleepmethod(2000);
		log.info("Book A Hotel");
		//System.out.println("BOOK A HOTEL");
		input(pom.getinstancebh().getFirst_name(), read_data("C:\\Users\\Lokesh M\\eclipse-workspace\\Maven_adactin\\Adactin Test case.xlsx", 15, 5));
		input(pom.getinstancebh().getlast_name(),read_data("C:\\Users\\Lokesh M\\eclipse-workspace\\Maven_adactin\\Adactin Test case.xlsx", 16, 5) );

		input(pom.getinstancebh().getAddress(),read_data("C:\\Users\\Lokesh M\\eclipse-workspace\\Maven_adactin\\Adactin Test case.xlsx", 17, 5));

		input(pom.getinstancebh().getCredit_cardno(),read_data("C:\\Users\\Lokesh M\\eclipse-workspace\\Maven_adactin\\Adactin Test case.xlsx", 18, 5));

		selectvisibletext(pom.getinstancebh().getCredit_cardtype(),read_data("C:\\Users\\Lokesh M\\eclipse-workspace\\Maven_adactin\\Adactin Test case.xlsx", 19, 5));

		selectvisibletext(pom.getinstancebh().getExp_date(), read_data("C:\\Users\\Lokesh M\\eclipse-workspace\\Maven_adactin\\Adactin Test case.xlsx", 20, 5));

		selectvisibletext(pom.getinstancebh().getExp_year(), read_data("C:\\Users\\Lokesh M\\eclipse-workspace\\Maven_adactin\\Adactin Test case.xlsx", 21, 5));

		input(pom.getinstancebh().getCcv_number(), read_data("C:\\Users\\Lokesh M\\eclipse-workspace\\Maven_adactin\\Adactin Test case.xlsx", 22, 5));

		click(pom.getinstancebh().getBook_now());
		sleepmethod(3000);
		javascript_method(pom.getinstancebh().getBook_now());

		sleepmethod(3000);
		log.info("Booking Confirmation");
		//System.out.println("BOOKING  CONFIRMATION");
		click(pom.getinstancebc().getBook_confirm());
		sleepmethod(3000);
		screenshotmethod();
		close();

	}

}
