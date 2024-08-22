package UserRegisterPackage;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterFunctionality {

	@Test
	public void registerAccountWithMandatoryFields() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		WebElement myAccountDropdown = driver.findElement(By.xpath("//span[text()='My Account']"));
		myAccountDropdown.click();
		
		WebElement registerOption = driver.findElement(By.linkText("Register"));
		registerOption.click();
		
		WebElement firstName = driver.findElement(By.id("input-firstname"));
		firstName.sendKeys("Papa");
		
		WebElement lastName = driver.findElement(By.id("input-lastname"));
		lastName.sendKeys("Jones");
		
		Date date = new Date();
		WebElement mailIdField = driver.findElement(By.id("input-email"));
		mailIdField.sendKeys(date.toString().replace(" ","_").replace(":", "_")+"@gmail.com");
		
		WebElement telephoneField = driver.findElement(By.id("input-telephone"));
		telephoneField.sendKeys("1111222333");
		
		WebElement passwordField = driver.findElement(By.id("input-password"));
		passwordField.sendKeys("@12345");
		
		WebElement confirmpasswordField = driver.findElement(By.id("input-confirm"));
		confirmpasswordField.sendKeys("@12345");
		
		WebElement policyCheckbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		policyCheckbox.click();
		
		WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
		submitButton.click();
		
		WebElement loginmyAccountDropdown = driver.findElement(By.xpath("//span[text()='My Account']"));
		loginmyAccountDropdown.click();
		
		WebElement logoutOption = driver.findElement(By.linkText("Logout"));
		Assert.assertTrue(logoutOption.isDisplayed());
		
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "https://tutorialsninja.com/demo/index.php?route=account/success";
		Assert.assertEquals(currentURL, expectedURL);
		
		WebElement AccountCreatedMessage = driver.findElement(By.xpath("//div[@id= 'content']//h1"));
		String actualAccountCreatedMessage = AccountCreatedMessage.getText();
		String expectedAccountCreatedMessage = "Your Account Has Been Created!";
		Assert.assertEquals(actualAccountCreatedMessage, expectedAccountCreatedMessage);
		
		WebElement congratsText = driver.findElement(By.xpath("//div[@id= 'content']//p[1]"));
		String actualcongratsText = congratsText.getText();
		String ExpectedcongratsText = "Congratulations! Your new account has been successfully created!";
		Assert.assertEquals(actualcongratsText, ExpectedcongratsText);
		
		
		WebElement memberprivilegeText = driver.findElement(By.xpath("//div[@id= 'content']//p[2]"));
		String actualmemberprivilegeText = memberprivilegeText.getText();
		String ExpectedmemberprivilegeText = "You can now take advantage of member privileges to enhance your online shopping experience with us.";
		Assert.assertEquals(actualmemberprivilegeText, ExpectedmemberprivilegeText);
		
		WebElement anyQuestionsText = driver.findElement(By.xpath("//div[@id= 'content']//p[3]"));
		String actualanyQuestionsText = anyQuestionsText.getText();
		String ExpectedanyQuestionsText = "If you have ANY questions about the operation of this online shop, please e-mail the store owner.";
		Assert.assertEquals(actualanyQuestionsText, ExpectedanyQuestionsText);
		
		WebElement confirmationMailText = driver.findElement(By.xpath("//div[@id= 'content']//p[4]"));
		String actualconfirmationMailText = confirmationMailText.getText();
		String ExpectedconfirmationMailText = "A confirmation has been sent to the provided e-mail address. If you have not received it within the hour, please contact us.";
		Assert.assertEquals(actualconfirmationMailText, ExpectedconfirmationMailText);
		
		
		WebElement contactUsLink = driver.findElement(By.linkText("contact us"));
		Assert.assertTrue(contactUsLink.isDisplayed());
				
		//checking whether user directed MyAccount Page when clicked continue
		WebElement continueButton = driver.findElement(By.xpath("//a[text()='Continue']"));
		continueButton.click();
		
		String actualMyAccountTitle = driver.getTitle();
		String expectedMyAccountTitle = "My Account";
		Assert.assertEquals(actualMyAccountTitle, expectedMyAccountTitle);
	
	    driver.quit();
}

	@Test
	public void registerAccountWithAllFields() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		WebElement myAccountDropdown = driver.findElement(By.xpath("//span[text()='My Account']"));
		myAccountDropdown.click();
		
		WebElement registerOption = driver.findElement(By.linkText("Register"));
		registerOption.click();
		
		WebElement firstName = driver.findElement(By.id("input-firstname"));
		firstName.sendKeys("Papa");
		
		WebElement lastName = driver.findElement(By.id("input-lastname"));
		lastName.sendKeys("Jones");
		
		Date date = new Date();
		WebElement mailIdField = driver.findElement(By.id("input-email"));
		mailIdField.sendKeys(date.toString().replace(" ","_").replace(":", "_")+"@gmail.com");
		
		WebElement telephoneField = driver.findElement(By.id("input-telephone"));
		telephoneField.sendKeys("1111222333");
		
		WebElement passwordField = driver.findElement(By.id("input-password"));
		passwordField.sendKeys("@12345");
		
		WebElement confirmpasswordField = driver.findElement(By.id("input-confirm"));
		confirmpasswordField.sendKeys("@12345");
		
		WebElement newsletterCheckbox = driver.findElement(By.xpath("//input[@name = 'newsletter'][@value='1']"));
		newsletterCheckbox.click();
		
		WebElement policyCheckbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		policyCheckbox.click();
		
		WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
		submitButton.click();
		
		WebElement loginmyAccountDropdown = driver.findElement(By.xpath("//span[text()='My Account']"));
		loginmyAccountDropdown.click();
		
		WebElement logoutOption = driver.findElement(By.linkText("Logout"));
		Assert.assertTrue(logoutOption.isDisplayed());
		
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "https://tutorialsninja.com/demo/index.php?route=account/success";
		Assert.assertEquals(currentURL, expectedURL);
		
		WebElement AccountCreatedMessage = driver.findElement(By.xpath("//div[@id= 'content']//h1"));
		String actualAccountCreatedMessage = AccountCreatedMessage.getText();
		String expectedAccountCreatedMessage = "Your Account Has Been Created!";
		Assert.assertEquals(actualAccountCreatedMessage, expectedAccountCreatedMessage);
		
		WebElement congratsText = driver.findElement(By.xpath("//div[@id= 'content']//p[1]"));
		String actualcongratsText = congratsText.getText();
		String ExpectedcongratsText = "Congratulations! Your new account has been successfully created!";
		Assert.assertEquals(actualcongratsText, ExpectedcongratsText);
		
		
		WebElement memberprivilegeText = driver.findElement(By.xpath("//div[@id= 'content']//p[2]"));
		String actualmemberprivilegeText = memberprivilegeText.getText();
		String ExpectedmemberprivilegeText = "You can now take advantage of member privileges to enhance your online shopping experience with us.";
		Assert.assertEquals(actualmemberprivilegeText, ExpectedmemberprivilegeText);
		
		WebElement anyQuestionsText = driver.findElement(By.xpath("//div[@id= 'content']//p[3]"));
		String actualanyQuestionsText = anyQuestionsText.getText();
		String ExpectedanyQuestionsText = "If you have ANY questions about the operation of this online shop, please e-mail the store owner.";
		Assert.assertEquals(actualanyQuestionsText, ExpectedanyQuestionsText);
		
		WebElement confirmationMailText = driver.findElement(By.xpath("//div[@id= 'content']//p[4]"));
		String actualconfirmationMailText = confirmationMailText.getText();
		String ExpectedconfirmationMailText = "A confirmation has been sent to the provided e-mail address. If you have not received it within the hour, please contact us.";
		Assert.assertEquals(actualconfirmationMailText, ExpectedconfirmationMailText);
		
		
		WebElement contactUsLink = driver.findElement(By.linkText("contact us"));
		Assert.assertTrue(contactUsLink.isDisplayed());
				
		//checking whether user directed MyAccount Page when clicked continue
		WebElement continueButton = driver.findElement(By.xpath("//a[text()='Continue']"));
		continueButton.click();
		
		String actualMyAccountTitle = driver.getTitle();
		String expectedMyAccountTitle = "My Account";
		Assert.assertEquals(actualMyAccountTitle, expectedMyAccountTitle);
	
	    driver.quit();
}

	@Test
	public void registerAccountWithoutAnyFields() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		WebElement myAccountDropdown = driver.findElement(By.xpath("//span[text()='My Account']"));
		myAccountDropdown.click();
		
		WebElement registerOption = driver.findElement(By.linkText("Register"));
		registerOption.click();
		
		WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
		submitButton.click();
		
		String actualFirstNameWarningMsg = driver.findElement(By.xpath("//input[@id = 'input-firstname']/following-sibling::div")).getText();
		String expectedFirstNameWarningMsg = "First Name must be between 1 and 32 characters!";
		Assert.assertEquals(actualFirstNameWarningMsg, expectedFirstNameWarningMsg);
		
		String actualLastNameWarningMsg = driver.findElement(By.xpath("//input[@id = 'input-lastname']/following-sibling::div")).getText();
		String expectedLastNameWarningMsg = "Last Name must be between 1 and 32 characters!";
		Assert.assertEquals(actualLastNameWarningMsg, expectedLastNameWarningMsg);
		
		
		String actualEmailWarningMsg = driver.findElement(By.xpath("//input[@id = 'input-email']/following-sibling::div")).getText();
		String expectedEmailWarningMsg = "E-Mail Address does not appear to be valid!";
		Assert.assertEquals(actualEmailWarningMsg, expectedEmailWarningMsg);
		
		String actualPhoneNumberWarningMsg = driver.findElement(By.xpath("//input[@id = 'input-telephone']/following-sibling::div")).getText();
		String expectedPhoneNumberWarningMsg = "Telephone must be between 3 and 32 characters!";
		Assert.assertEquals(actualPhoneNumberWarningMsg, expectedPhoneNumberWarningMsg);
		
		String actualPasswordWarningMsg = driver.findElement(By.xpath("//input[@id = 'input-password']/following-sibling::div")).getText();
		String expectedPasswordWarningMsg = "Password must be between 4 and 20 characters!";
		Assert.assertEquals(actualPasswordWarningMsg, expectedPasswordWarningMsg);
		
		
		String actualPolicyWarningMsg = driver.findElement(By.xpath("//div[@id = 'account-register']/div[1]")).getText();
		String expectedPolicyWarningMsg = "Warning: You must agree to the Privacy Policy!";
		Assert.assertEquals(actualPolicyWarningMsg, expectedPolicyWarningMsg);
		
		driver.quit();
		
		
	}
	
	@Test
	public void registerAccountWithYesNewsletterField() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		WebElement myAccountDropdown = driver.findElement(By.xpath("//span[text()='My Account']"));
		myAccountDropdown.click();
		
		WebElement registerOption = driver.findElement(By.linkText("Register"));
		registerOption.click();
		
		WebElement firstName = driver.findElement(By.id("input-firstname"));
		firstName.sendKeys("Papa");
		
		WebElement lastName = driver.findElement(By.id("input-lastname"));
		lastName.sendKeys("Jones");
		
		Date date = new Date();
		WebElement mailIdField = driver.findElement(By.id("input-email"));
		mailIdField.sendKeys(date.toString().replace(" ","_").replace(":", "_")+"@gmail.com");
		
		WebElement telephoneField = driver.findElement(By.id("input-telephone"));
		telephoneField.sendKeys("1111222333");
		
		WebElement passwordField = driver.findElement(By.id("input-password"));
		passwordField.sendKeys("@12345");
		
		WebElement confirmpasswordField = driver.findElement(By.id("input-confirm"));
		confirmpasswordField.sendKeys("@12345");
		
		WebElement newsletterCheckbox = driver.findElement(By.xpath("//input[@name = 'newsletter'][@value='1']"));
		newsletterCheckbox.click();
		
		WebElement policyCheckbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		policyCheckbox.click();
		
		WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
		submitButton.click();
		
		WebElement loginmyAccountDropdown = driver.findElement(By.xpath("//span[text()='My Account']"));
		loginmyAccountDropdown.click();
		
		WebElement logoutOption = driver.findElement(By.linkText("Logout"));
		Assert.assertTrue(logoutOption.isDisplayed());
		
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "https://tutorialsninja.com/demo/index.php?route=account/success";
		Assert.assertEquals(currentURL, expectedURL);
		
		WebElement AccountCreatedMessage = driver.findElement(By.xpath("//div[@id= 'content']//h1"));
		String actualAccountCreatedMessage = AccountCreatedMessage.getText();
		String expectedAccountCreatedMessage = "Your Account Has Been Created!";
		Assert.assertEquals(actualAccountCreatedMessage, expectedAccountCreatedMessage);
		
		WebElement congratsText = driver.findElement(By.xpath("//div[@id= 'content']//p[1]"));
		String actualcongratsText = congratsText.getText();
		String ExpectedcongratsText = "Congratulations! Your new account has been successfully created!";
		Assert.assertEquals(actualcongratsText, ExpectedcongratsText);
		
		
		WebElement memberprivilegeText = driver.findElement(By.xpath("//div[@id= 'content']//p[2]"));
		String actualmemberprivilegeText = memberprivilegeText.getText();
		String ExpectedmemberprivilegeText = "You can now take advantage of member privileges to enhance your online shopping experience with us.";
		Assert.assertEquals(actualmemberprivilegeText, ExpectedmemberprivilegeText);
		
		WebElement anyQuestionsText = driver.findElement(By.xpath("//div[@id= 'content']//p[3]"));
		String actualanyQuestionsText = anyQuestionsText.getText();
		String ExpectedanyQuestionsText = "If you have ANY questions about the operation of this online shop, please e-mail the store owner.";
		Assert.assertEquals(actualanyQuestionsText, ExpectedanyQuestionsText);
		
		WebElement confirmationMailText = driver.findElement(By.xpath("//div[@id= 'content']//p[4]"));
		String actualconfirmationMailText = confirmationMailText.getText();
		String ExpectedconfirmationMailText = "A confirmation has been sent to the provided e-mail address. If you have not received it within the hour, please contact us.";
		Assert.assertEquals(actualconfirmationMailText, ExpectedconfirmationMailText);
		
		
		WebElement contactUsLink = driver.findElement(By.linkText("contact us"));
		Assert.assertTrue(contactUsLink.isDisplayed());
				
		//checking whether user directed MyAccount Page when clicked continue
		WebElement continueButton = driver.findElement(By.xpath("//a[text()='Continue']"));
		continueButton.click();
		
		String actualMyAccountTitle = driver.getTitle();
		String expectedMyAccountTitle = "My Account";
		Assert.assertEquals(actualMyAccountTitle, expectedMyAccountTitle);
		
		WebElement SubUnsubnewsletterhyperlink = driver.findElement(By.linkText("Subscribe / unsubscribe to newsletter"));
		SubUnsubnewsletterhyperlink.click();
		boolean yesRadioButton = driver.findElement(By.xpath("//input[@name = 'newsletter'][@value='1']")).isSelected();
		Assert.assertTrue(yesRadioButton);
		
		driver.quit();
		
		
}
	@Test
	public void registerAccountWithNoNewsletterField() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		WebElement myAccountDropdown = driver.findElement(By.xpath("//span[text()='My Account']"));
		myAccountDropdown.click();
		
		WebElement registerOption = driver.findElement(By.linkText("Register"));
		registerOption.click();
		
		WebElement firstName = driver.findElement(By.id("input-firstname"));
		firstName.sendKeys("Papa");
		
		WebElement lastName = driver.findElement(By.id("input-lastname"));
		lastName.sendKeys("Jones");
		
		Date date = new Date();
		WebElement mailIdField = driver.findElement(By.id("input-email"));
		mailIdField.sendKeys(date.toString().replace(" ","_").replace(":", "_")+"@gmail.com");
		
		WebElement telephoneField = driver.findElement(By.id("input-telephone"));
		telephoneField.sendKeys("1111222333");
		
		WebElement passwordField = driver.findElement(By.id("input-password"));
		passwordField.sendKeys("@12345");
		
		WebElement confirmpasswordField = driver.findElement(By.id("input-confirm"));
		confirmpasswordField.sendKeys("@12345");
		
		WebElement newsletterCheckbox = driver.findElement(By.xpath("//input[@name = 'newsletter'][@value='0']"));
		newsletterCheckbox.click();
		
		WebElement policyCheckbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		policyCheckbox.click();
		
		WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
		submitButton.click();
		
		WebElement loginmyAccountDropdown = driver.findElement(By.xpath("//span[text()='My Account']"));
		loginmyAccountDropdown.click();
		
		WebElement logoutOption = driver.findElement(By.linkText("Logout"));
		Assert.assertTrue(logoutOption.isDisplayed());
		
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "https://tutorialsninja.com/demo/index.php?route=account/success";
		Assert.assertEquals(currentURL, expectedURL);
		
		WebElement AccountCreatedMessage = driver.findElement(By.xpath("//div[@id= 'content']//h1"));
		String actualAccountCreatedMessage = AccountCreatedMessage.getText();
		String expectedAccountCreatedMessage = "Your Account Has Been Created!";
		Assert.assertEquals(actualAccountCreatedMessage, expectedAccountCreatedMessage);
		
		WebElement congratsText = driver.findElement(By.xpath("//div[@id= 'content']//p[1]"));
		String actualcongratsText = congratsText.getText();
		String ExpectedcongratsText = "Congratulations! Your new account has been successfully created!";
		Assert.assertEquals(actualcongratsText, ExpectedcongratsText);
		
		
		WebElement memberprivilegeText = driver.findElement(By.xpath("//div[@id= 'content']//p[2]"));
		String actualmemberprivilegeText = memberprivilegeText.getText();
		String ExpectedmemberprivilegeText = "You can now take advantage of member privileges to enhance your online shopping experience with us.";
		Assert.assertEquals(actualmemberprivilegeText, ExpectedmemberprivilegeText);
		
		WebElement anyQuestionsText = driver.findElement(By.xpath("//div[@id= 'content']//p[3]"));
		String actualanyQuestionsText = anyQuestionsText.getText();
		String ExpectedanyQuestionsText = "If you have ANY questions about the operation of this online shop, please e-mail the store owner.";
		Assert.assertEquals(actualanyQuestionsText, ExpectedanyQuestionsText);
		
		WebElement confirmationMailText = driver.findElement(By.xpath("//div[@id= 'content']//p[4]"));
		String actualconfirmationMailText = confirmationMailText.getText();
		String ExpectedconfirmationMailText = "A confirmation has been sent to the provided e-mail address. If you have not received it within the hour, please contact us.";
		Assert.assertEquals(actualconfirmationMailText, ExpectedconfirmationMailText);
		
		
		WebElement contactUsLink = driver.findElement(By.linkText("contact us"));
		Assert.assertTrue(contactUsLink.isDisplayed());
				
		//checking whether user directed MyAccount Page when clicked continue
		WebElement continueButton = driver.findElement(By.xpath("//a[text()='Continue']"));
		continueButton.click();
		
		String actualMyAccountTitle = driver.getTitle();
		String expectedMyAccountTitle = "My Account";
		Assert.assertEquals(actualMyAccountTitle, expectedMyAccountTitle);
		
		WebElement SubUnsubnewsletterhyperlink = driver.findElement(By.linkText("Subscribe / unsubscribe to newsletter"));
		SubUnsubnewsletterhyperlink.click();
		boolean yesRadioButton = driver.findElement(By.xpath("//input[@name = 'newsletter'][@value='0']")).isSelected();
		Assert.assertTrue(yesRadioButton);
		
		driver.quit();

}

	@Test
	public void registerAccountPageNavigationsDifferentWays() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		WebElement myAccountDropdown = driver.findElement(By.xpath("//span[text()='My Account']"));
		myAccountDropdown.click();
		
		WebElement registerOption = driver.findElement(By.linkText("Register"));
		registerOption.click();
		
		String currentURL = driver.getCurrentUrl();
		String actualURL = "https://tutorialsninja.com/demo/index.php?route=account/register";
		Assert.assertEquals(currentURL, actualURL);
		
		WebElement myAccountDropdown2 = driver.findElement(By.xpath("//span[text()='My Account']"));
		myAccountDropdown2.click();
		
		WebElement loginOption = driver.findElement(By.linkText("Login"));
		loginOption.click();
		
		WebElement continueButton = driver.findElement(By.linkText("Continue"));
		continueButton.click();
		
		String currentURL2 = driver.getCurrentUrl();
		String actualURL2 = "https://tutorialsninja.com/demo/index.php?route=account/register";
		Assert.assertEquals(currentURL2, actualURL2);
		
		WebElement myAccountDropdown3 = driver.findElement(By.xpath("//span[text()='My Account']"));
		myAccountDropdown3.click();
		
		WebElement loginOption2 = driver.findElement(By.linkText("Login"));
		loginOption2.click();
		
		WebElement registerOptionRightColumn = driver.findElement(By.xpath("//div[@class='list-group']/a[text()='Register']"));
		registerOptionRightColumn.click();
		
		String currentURL3 = driver.getCurrentUrl();
		String actualURL3 = "https://tutorialsninja.com/demo/index.php?route=account/register";
		Assert.assertEquals(currentURL3, actualURL3);
		
		driver.quit();
		
	}
	
	@Test
	public void passwordMismatchConfirmationCheck() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		WebElement myAccountDropdown = driver.findElement(By.xpath("//span[text()='My Account']"));
		myAccountDropdown.click();
		
		WebElement registerOption = driver.findElement(By.linkText("Register"));
		registerOption.click();
		
		WebElement firstName = driver.findElement(By.id("input-firstname"));
		firstName.sendKeys("Papa");
		
		WebElement lastName = driver.findElement(By.id("input-lastname"));
		lastName.sendKeys("Jones");
		
		Date date = new Date();
		WebElement mailIdField = driver.findElement(By.id("input-email"));
		mailIdField.sendKeys(date.toString().replace(" ","_").replace(":", "_")+"@gmail.com");
		
		WebElement telephoneField = driver.findElement(By.id("input-telephone"));
		telephoneField.sendKeys("1111222333");
		
		WebElement passwordField = driver.findElement(By.id("input-password"));
		passwordField.sendKeys("12345");
		
		WebElement confirmpasswordField = driver.findElement(By.id("input-confirm"));
		confirmpasswordField.sendKeys("abcde");
		
		WebElement newsletterCheckbox = driver.findElement(By.xpath("//input[@name = 'newsletter'][@value='1']"));
		newsletterCheckbox.click();
		
		WebElement policyCheckbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		policyCheckbox.click();
		
		WebElement continueButton = driver.findElement(By.xpath("//input[@type='submit']"));
		continueButton.click();
		
		String actualPasswordConfirmationMsg = driver.findElement(By.xpath("//div[@class='text-danger']")).getText();
		String expectedPasswordConfirmationMsg = "Password confirmation does not match password!";
		Assert.assertEquals(actualPasswordConfirmationMsg, expectedPasswordConfirmationMsg);
		
		driver.quit();
				
		
	}
	
	@Test
	public void properPlaceholdersCheck() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		WebElement myAccountDropdown = driver.findElement(By.xpath("//span[text()='My Account']"));
		myAccountDropdown.click();
		
		WebElement registerOption = driver.findElement(By.linkText("Register"));
		registerOption.click();
		
		WebElement firstNamePlaceholder = driver.findElement(By.id("input-firstname"));
		String actualfirstNamePlaceholder = firstNamePlaceholder.getAttribute("placeholder");
		String expectedfirstNamePlaceholder = "First Name";
		Assert.assertEquals(actualfirstNamePlaceholder, expectedfirstNamePlaceholder);
		
		WebElement lastNamePlaceholder = driver.findElement(By.id("input-lastname"));
		String actuallastNamePlaceholder = lastNamePlaceholder.getAttribute("placeholder");
		String expectedlastNamePlaceholder = "Last Name";
		Assert.assertEquals(actuallastNamePlaceholder, expectedlastNamePlaceholder);
		
		WebElement emailPlaceholder = driver.findElement(By.id("input-email"));
		String actualemailPlaceholder = emailPlaceholder.getAttribute("placeholder");
		String expectedemailPlaceholder = "E-Mail";
		Assert.assertEquals(actualemailPlaceholder, expectedemailPlaceholder);
		
		WebElement telephonePlaceholder = driver.findElement(By.id("input-telephone"));
		String actualtelephonePlaceholder = telephonePlaceholder.getAttribute("placeholder");
		String expectedtelephonePlaceholder = "Telephone";
		Assert.assertEquals(actualtelephonePlaceholder, expectedtelephonePlaceholder);
		
		WebElement passwordPlaceholder = driver.findElement(By.id("input-password"));
		String actualpasswordPlaceholder = passwordPlaceholder.getAttribute("placeholder");
		String expectedpasswordPlaceholder = "Password";
		Assert.assertEquals(actualpasswordPlaceholder, expectedpasswordPlaceholder);
		
		WebElement confirmPasswordPlaceholder = driver.findElement(By.id("input-confirm"));
		String actualConfirmPasswordPlaceholder = confirmPasswordPlaceholder.getAttribute("placeholder");
		String expectedConfirmPasswordPlaceholder = "Password Confirm";
		Assert.assertEquals(actualConfirmPasswordPlaceholder, expectedConfirmPasswordPlaceholder);
		
		driver.quit();
		
	}
}

