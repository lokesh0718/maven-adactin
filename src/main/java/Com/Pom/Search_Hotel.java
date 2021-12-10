package Com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	
	public WebDriver driver;
@FindBy(id="location")
WebElement location;

@FindBy(id="hotels")
private WebElement hotel;

@FindBy(id="room_type")
private WebElement room_type;

@FindBy(id="room_nos")
private WebElement No_of_rooms;

@FindBy(id="adult_room")
private WebElement Adult_per_rooms;

@FindBy(id="child_room")
private WebElement child_per_rooms;

@FindBy(id="Submit")
private WebElement search;

public Search_Hotel(WebDriver driver2) {
	
	this.driver= driver2;
	PageFactory.initElements(driver2, this);
}

public WebElement getLocation() {
	return location;
}

public WebElement getHotel() {
	return hotel;
}

public WebElement getRoom_type() {
	return room_type;
}

public WebElement getNo_of_rooms() {
	return No_of_rooms;
}

public WebElement getAdult_per_rooms() {
	return Adult_per_rooms;
}

public WebElement getChild_per_rooms() {
	return child_per_rooms;
}

public WebElement getSearch() {
	return search;
}



}
