package basiclayout;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

		WebDriver driver;
		@FindBy(xpath = "//a[@data-group='men']")
		WebElement menTab;
		
		public HomePage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver,this);
		}
		
		public void openWebURL() {
			driver.get("https://www.myntra.com/");			
			
		}
		
		public void getWebElementText() {
			System.out.println("the element text is -->" + menTab.getText());
		}
		
}
