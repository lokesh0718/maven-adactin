package sdp.Pom;

import org.openqa.selenium.WebDriver;

import Com.Pom.Book_hotel;
import Com.Pom.Book_iteranary;
import Com.Pom.Home_page;
import Com.Pom.Search_Hotel;
import Com.Pom.Select_hotel;

public class Project_object_manager {
 private WebDriver driver;
	
	private Home_page hp;
	
    private Search_Hotel sh;
    private Select_hotel  sc ;
    
	private Book_hotel bh;
	private  Book_iteranary bc;

	
	
	 public Project_object_manager(WebDriver driver2) {
		this .driver=driver2;  
	}
	public Home_page getinstancehp() {
		 
		 if ( hp==null) {
			  hp = new  Home_page(driver);
			}
return hp;
	}
 public Search_Hotel getinstancesh() {
		 
		 if ( sh==null) {
			 
			  sh  = new Search_Hotel(driver);
			}
return sh;}

 public Select_hotel getinstancesc() {
	 
	 if ( sc==null) {
		  sc =new Select_hotel(driver);
		}
return sc;}
 

 public Book_hotel getinstancebh() {
	 
	 if ( bh==null) {
		 bh =new Book_hotel(driver);
		}
return bh;}

 public Book_iteranary getinstancebc() {
	 
	 if ( bc==null) {
		  bc = new Book_iteranary(driver);
		}
return bc;}









	 
	 
	 
	
}
