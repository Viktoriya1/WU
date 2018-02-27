import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    static AppiumDriver driver;

    public MainPage(AppiumDriver driver){
        this.driver = driver;
    }

    private By sendMoneyButton = By.xpath("//XCUIElementTypeButton[@name=\"Send Money\"]");
    private By loginRegisterButton = By.name("Log In / Register");
    private By loggedInInscription = By.xpath("//XCUIElementTypeStaticText[@name=\"You've securely logged in\"]");

    public SendMoneyPage clickSendMoneyButton(){
        driver.findElement(sendMoneyButton).click();
        return new SendMoneyPage(driver);
    }

    public LoginPage clickLoginRegisterButton(){
        driver.findElement(loginRegisterButton).click();
        return new LoginPage(driver);
    }

    public String getLoggenInInscriptionText(){

        return driver.findElement(loggedInInscription).getText();
    }

    public LoginPage goToLoginRegisterPage(){
        this.clickLoginRegisterButton();
        return new LoginPage(driver);
    }

}
