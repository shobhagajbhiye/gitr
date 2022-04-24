package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteLoginpg1 {
	
	//declaration

	@FindBy(xpath="//input[@id='userid']")private WebElement UN;
	
	

	
	@FindBy(xpath="//span[@class='su-message'])[1]")private WebElement error1;

	@FindBy(xpath="//span[@class='su-message'])[2]")private WebElement error2;
	
	
	public kiteLoginpg1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	





	
}
