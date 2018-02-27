import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    static AppiumDriver driver;

    public LoginPage(AppiumDriver driver){

        this.driver = driver;
    }

    private By yourCivilIdButton = By.name("Your Civil ID");
    private By logInButton = By.xpath("(//XCUIElementTypeButton[@name=\"Log In\"])[1]");
    private By registerButton = By.xpath("(//XCUIElementTypeButton[@name=\"Register\"])[1]");
    private By emailField = By.name("Email");
    private By passwordField = By.name("Password");




    public LoginPage typeCivilId(String civilId){
        driver.findElement(yourCivilIdButton).sendKeys(civilId);
        return this;
    }

    public LoginPage typeEmailField(String email){
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public LoginPage typePasswordField(String password){
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public MainPage goToMainPageLoggedIn(String email, String password){
        this.typeEmailField(email);
        this.typePasswordField(password);
        driver.hideKeyboard();
        this.clickLogin();
        return new MainPage(driver);
    }

    public RegisterPage clickRegisterButton(){
        driver.findElement(registerButton).click();
        return new RegisterPage(driver);
    }

    public SecureQuestionPage clickLogin(){
        driver.findElement(logInButton).click();
        return new SecureQuestionPage(driver);
    }

    public SecureQuestionPage goToSecureQuestionPage(String civilIdValue){
        this.typeCivilId(civilIdValue);
        driver.hideKeyboard();
        this.clickLogin();
        return new SecureQuestionPage(driver);
    }

}
