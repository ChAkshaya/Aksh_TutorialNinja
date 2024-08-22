package SeachFunctionalityPack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeachFunctionality {
	
	@Test
	public void searchWithExistingProductName() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		
		String givenSearchValue = "Sony";
		
		WebElement searchBox = driver.findElement(By.name("search"));
		searchBox.sendKeys(givenSearchValue);
		
		WebElement searchIcon = driver.findElement(By.xpath("//span[@class = 'input-group-btn']/child::button"));
		searchIcon.click();
		
		WebElement searchedProductResults = driver.findElement(By.tagName("img"));
		String actualSearchResults = searchedProductResults.getAttribute("title");
		
		if (actualSearchResults.contains(givenSearchValue)) {
		    System.out.println("Searched product is displayed in search results ");
		}else {
		    System.out.println("Searched product is not displayed in search results ");

		}
		
		driver.quit();
		
	}
	
	@Test
	public void searchWithNonExistingProductName() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		
		String givenSearchValue = "Akshaya";
		
		WebElement searchBox = driver.findElement(By.name("search"));
		searchBox.sendKeys(givenSearchValue);
		
		WebElement searchIcon = driver.findElement(By.xpath("//span[@class = 'input-group-btn']/child::button"));
		searchIcon.click();
		
		WebElement noProductErrorMsg = driver.findElement(By.xpath("//input[@id='button-search']/following-sibling::p"));
		String actualnoProductErrorMsg = noProductErrorMsg.getText();
		String expectednoProductErrorMsg = "There is no product that matches the search criteria.";
		
		Assert.assertEquals(actualnoProductErrorMsg, expectednoProductErrorMsg);
		
		driver.quit();
		
		
	}
	
	@Test
	public void searchWithoutProvidingAnyName() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		
		WebElement searchIcon = driver.findElement(By.xpath("//span[@class = 'input-group-btn']/child::button"));
		searchIcon.click();
		
		WebElement noProductErrorMsg = driver.findElement(By.xpath("//input[@id='button-search']/following-sibling::p"));
		String actualnoProductErrorMsg = noProductErrorMsg.getText();
		String expectednoProductErrorMsg = "There is no product that matches the search criteria.";
		
		Assert.assertEquals(actualnoProductErrorMsg, expectednoProductErrorMsg);
		
		driver.quit();
		
	}
	
	@Test
	public void searchCriteriaResultsInMultipleProducts() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		
		String givenSearchValue = "Mac";
		
		WebElement searchBox = driver.findElement(By.name("search"));
		searchBox.sendKeys(givenSearchValue);
		
		WebElement searchIcon = driver.findElement(By.xpath("//span[@class = 'input-group-btn']/child::button"));
		searchIcon.click();
		
		List<WebElement> products = driver.findElements(By.className("product-layout"));
//		for(WebElement product: products) {
//			System.out.println(product);
//		}
		
		if (products.size() > 1) {
			System.out.println("The search criteria returned more than 1 product");
			
		}else {
			System.out.println("The search criteria didn't return mutliple products");
		}
		
		
		driver.quit();
		
	}
	
	@Test
	public void sortDisplayedSearchResults() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		
		String givenSearchValue = "Mac";
		
		WebElement searchBox = driver.findElement(By.name("search"));
		searchBox.sendKeys(givenSearchValue);
		
		WebElement searchIcon = driver.findElement(By.xpath("//span[@class = 'input-group-btn']/child::button"));
		searchIcon.click();
		
		WebElement sortByOption = driver.findElement(By.id("input-sort"));
		sortByOption.click();
		
		//selecting option low > high
		WebElement sortByPriceLowToHighOption = driver.findElement(By.xpath("//select[@id = 'input-sort']/option[4]"));
		sortByPriceLowToHighOption.click();
		
//		String firstProductPrice = driver.findElement(By.xpath("//p[@class='price']")).getText();
//		System.out.println(firstProductPrice);
		
		List<WebElement> prices = driver.findElements(By.cssSelector(".price"));
		
		List<Integer> prices_list = new ArrayList<>();
 		
		for(WebElement price: prices) {
			String priceText = price.getText().replaceAll("[^\\d.]", "");
			String integerPart = priceText.split("\\.")[0];    
			prices_list.add(Integer.parseInt(integerPart));
		}
		
		List<Integer> sorted_prices_list = new ArrayList<>(prices_list);
        Collections.sort(sorted_prices_list);
        
        Assert.assertEquals(prices_list, sorted_prices_list);
        
        //Selecting option high < low
        
        WebElement sortByPriceHighToLowOption = driver.findElement(By.xpath("//select[@id = 'input-sort']/option[5]"));
        sortByPriceHighToLowOption.click();
		
		
		List<WebElement> pricesHigh = driver.findElements(By.cssSelector(".price"));
		
		List<Integer> pricesHigh_list = new ArrayList<>();
 		
		for(WebElement price: pricesHigh) {
			String priceText = price.getText().replaceAll("[^\\d.]", "");
			String integerPart = priceText.split("\\.")[0];    
			prices_list.add(Integer.parseInt(integerPart));
		}
		
		List<Integer> sorted_pricesHigh_list = new ArrayList<>(pricesHigh_list);
        Collections.sort(sorted_pricesHigh_list, Collections.reverseOrder());
        
        Assert.assertEquals(pricesHigh_list, sorted_pricesHigh_list);
		
		driver.quit();
		
	}
	
	

}
