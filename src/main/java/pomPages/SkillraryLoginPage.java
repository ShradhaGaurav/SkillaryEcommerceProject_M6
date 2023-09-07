package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {
	
		//Declaration
		//address of gears
		@FindBy(xpath="//a[text()=' GEARS ']")
		private WebElement gearbtn;
		
		//address of skillrary demo
		@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
		private WebElement skillrarydemoapp;
		//address of search textfield
		@FindBy(xpath="//input[@name='q']")
		private WebElement searchtb;
			
		//Initialization
		public SkillraryLoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		//Utilizations
		public void gearsbutton() {
			gearbtn.click();
		}
		public void Skillrarydemoapplication() {
			skillrarydemoapp.click();
		}
		public void searchTextbox(String name) {
			searchtb.sendKeys(name);
		}
		public void gobutton() {
			searchtb.click();
		}
		


}
