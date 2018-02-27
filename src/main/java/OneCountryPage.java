import io.appium.java_client.AppiumDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OneCountryPage {
    static AppiumDriver driver;

    public OneCountryPage(AppiumDriver driver){
        this.driver = driver;
    }

//    private By nextButton = By.name("Next");

    private By nextButton = By.xpath("//XCUIElementTypeButton[@name=\"Next\"]");

    public ChoseLanguagePage clickNextButton(){
        driver.findElement(nextButton).click();
        return new ChoseLanguagePage(driver);
    }

    public ChoseLanguagePage goToChoseLanguagePage(){

        this.clickNextButton();
        return new ChoseLanguagePage(driver);
    }


}