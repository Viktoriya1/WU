import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PasswordPage {

    static AppiumDriver driver;

    public PasswordPage(AppiumDriver driver){
        this.driver = driver;
    }


    private By passwordField = By.name("Password");
    private By nextButton = By.name("Next");

    public PasswordPage typePasswordField(String password){
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public MainPage clickNextButton(){
        driver.findElement(nextButton).click();
        return new MainPage(driver);
    }

    public MainPage goToMainPageLoggedIn(String password){
        this.typePasswordField(password);
        driver.hideKeyboard();
        this.clickNextButton();
        return new MainPage(driver);
    }
}
