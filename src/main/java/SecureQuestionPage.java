import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureQuestionPage {
    static AppiumDriver driver;

    public SecureQuestionPage(AppiumDriver driver){
        this.driver = driver;
    }

    private By secureAnswer = By.name("Secure answer");
    private By nextButton = By.xpath("//XCUIElementTypeButton[@name=\"Next\"]");

    public SecureQuestionPage typeSecureAnswer(String answer){
        driver.findElement(secureAnswer).sendKeys(answer);
        return this;
    }

    public PasswordPage clickNextButton(){
        driver.findElement(nextButton).click();
        return new PasswordPage(driver);
    }

    public PasswordPage goToPasswordPage(String answer){
        this.typeSecureAnswer(answer);
        driver.hideKeyboard();
        this.clickNextButton();
        return new PasswordPage(driver);
    }
}
