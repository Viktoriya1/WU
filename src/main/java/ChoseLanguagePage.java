import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChoseLanguagePage {

    static AppiumDriver driver;

    public ChoseLanguagePage(AppiumDriver driver){
        this.driver = driver;
    }

//    private By doneButton = By.name("Done");
    private By doneButton = By.xpath("//XCUIElementTypeButton[@name=\"Done\"]");


    public MainPage clickDoneButton(){
        driver.findElement(doneButton).click();
        return new MainPage(driver);
    }


    public MainPage goToMainPage(){
        this.clickDoneButton();
        return new MainPage(driver);
    }

}
