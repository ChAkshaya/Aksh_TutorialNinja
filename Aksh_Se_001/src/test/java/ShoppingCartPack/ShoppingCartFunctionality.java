package ShoppingCartPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingCartFunctionality {
	
	@Test
	public void navigateToShoppingCartFromSuccessMessage() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		
		WebElement searchBox = driver.findElement(By.name("search"));
		searchBox.sendKeys("HP");
		
		WebElement searchIcon = driver.findElement(By.xpath("//span[@class = 'input-group-btn']/child::button"));
		searchIcon.click();
		
		WebElement productDisplay = driver.findElement(By.linkText("HP LP3065"));
		productDisplay.click();
		
		WebElement addToCartButton = driver.findElement(By.id("button-cart"));
		addToCartButton.click();
		
		Thread.sleep(3000);
		
		WebElement shoppingCartLinkOnSuccessMSg = driver.findElement(By.xpath("//div[contains(@class, 'alert-success')]//a[contains(text(), 'shopping cart')]"));
		shoppingCartLinkOnSuccessMSg.click();
		
		String actualShoppingCartLink = driver.getCurrentUrl();
		System.out.println(actualShoppingCartLink);
		String expectedShoppingCartLink = "https://tutorialsninja.com/demo/index.php?route=checkout/cart";
		
		Assert.assertEquals(actualShoppingCartLink, expectedShoppingCartLink);
		
		driver.quit();
		
	}
	
	@Test
	public void viewCartOptionInCardBlock() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		
		WebElement searchBox = driver.findElement(By.name("search"));
		searchBox.sendKeys("iMac");
		
		WebElement searchIcon = driver.findElement(By.xpath("//span[@class = 'input-group-btn']/child::button"));
		searchIcon.click();
		
		WebElement addToCartButton = driver.findElement(By.xpath("//span[text()='Add to Cart']"));
		addToCartButton.click();
		
		WebElement topBlackColorCartButton = driver.findElement(By.xpath("//div[@id ='cart']/button"));
		topBlackColorCartButton.click();
		
		WebElement viewCartButton = driver.findElement(By.className("fa-shopping-cart"));
		viewCartButton.click();
		
		String actualShoppingCartPage = driver.getCurrentUrl();
		String expectedShoppingCartPage = "https://tutorialsninja.com/demo/index.php?route=checkout/cart";
		
		Assert.assertEquals(actualShoppingCartPage, expectedShoppingCartPage);
		
		driver.quit();
		
	}

}
