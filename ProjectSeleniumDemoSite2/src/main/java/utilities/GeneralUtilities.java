package utilities;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class GeneralUtilities {
	WebDriver driver;
	public void typeOnElement(WebElement element, String text) {
		element.sendKeys(text);
	}

	public void clickOnElement(WebElement element) {
		element.click();
	}
 
	public String getTextOfElement(WebElement element) {
		return element.getText();
	}
	
	public Boolean isElementDisplayed(WebElement element) {
		return element.isDisplayed();
	}
	
	public Boolean isElementSelected(WebElement element) {
		return element.isSelected();
	}
	public String getCurrentUrlOfPage(WebDriver driver) {
		return driver.getCurrentUrl();
		
	}
	public String getAtrributeOfElement(WebElement element,String attribute)
	{
		return element.getAttribute(attribute);
	}
	
	public void scrollToAnElement(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	public void clickUsingJavaScriptExecutor(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		js.executeScript("arguments[0].click()", element);
	}
	
	public void selectFromDropDownByIndex(WebElement element, int index)
	{
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	
	public void aleretAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
public void clickAnElementUsingSendKeys(WebDriver driver, WebElement element)
	{
		Actions actions=new Actions(driver);
		actions.sendKeys(element,Keys.ENTER).build().perform();
	}
	
	public void dragAndDrop(WebElement element1, WebElement element2, WebDriver driver) 
	{
		Actions actions=new Actions(driver);
		actions.dragAndDrop(element1, element2).build().perform();
	}
public void doubleClick(WebElement element, WebDriver driver) {
		Actions actions=new Actions(driver);
		actions.doubleClick(element);
	}
	
public void pressEnterKey(WebElement element, WebDriver driver)	{
	
	Actions actions=new Actions(driver);
	actions.sendKeys(Keys.ENTER).build().perform();
}

	public void addSleep() throws InterruptedException {
		Thread.sleep(3000);
	}
	public Integer sizeOfWebElementList(List<WebElement> listElements) {
		return listElements.size();
		
	}
	
	public void pressEnterKey(WebDriver driver) {
		Actions actions=new Actions(driver);
		actions.keyDown(Keys.ENTER).build().perform();
	}
	public void moveToAnElementAndCick(WebDriver driver,WebElement element) {
		Actions actions=new Actions(driver);
		actions.moveToElement(element).click().build().perform();
	}
	
	public void typeOnElementAndClickEnter(WebElement element,String value) {
		element.sendKeys(value+Keys.ENTER);
		
	}

	

	public void selectFromDropDownByVisibilityOfText(WebElement element, String value) {
		Select select=new Select(element);
		select.selectByVisibleText(value);
		
		
	}

}
