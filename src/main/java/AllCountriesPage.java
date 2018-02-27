import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;

public class AllCountriesPage {

    static AppiumDriver driver;

    public AllCountriesPage(AppiumDriver driver) {
        this.driver = driver;
    }

//    private By kuwaitButton = By.xpath("//XCUIElementTypeApplication[@name=\"Western Union\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]\n");
//    private By bahrainButton = By.xpath("//XCUIElementTypeApplication[@name=\"Western Union\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]");
//    private By jamaicaButton = By.xpath("//XCUIElementTypeApplication[@name=\"Western Union\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[4]");
//    private By qatarButton = By.xpath("//XCUIElementTypeApplication[@name=\"Western Union\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[5]");
//    private By unitedArabEmiratesButton = By.xpath("//XCUIElementTypeApplication[@name=\"Western Union\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[6]");


    private By kuwaitButton = By.name("Kuwait");
    private By bahrainButton= By.name("Bahrain");
    private By jamaicaButton= By.name("Jamaica");
    private By qatarButton = By.name("Qatar");
    private By unitedArabEmiratesButton=By.name("United Arab Emirates");



    public OneCountryPage kuwaitCountry() {
        driver.findElement(kuwaitButton).click();
        return new OneCountryPage(driver);
    }

    public OneCountryPage goTokuwaitCountry() {
        this.kuwaitCountry();
        return new OneCountryPage(driver);
    }


    public OneCountryPage bahrainCountry() {
        driver.findElement(bahrainButton).click();
        return new OneCountryPage(driver);
    }

    public OneCountryPage goToBahrainCountry() {
        this.bahrainCountry();
        return new OneCountryPage(driver);
    }

    public OneCountryPage jamaicaCountry() {
        driver.findElement(jamaicaButton).click();
        return new OneCountryPage(driver);
    }

    public OneCountryPage goTojamaicaCountry() {
        this.jamaicaCountry();
        return new OneCountryPage(driver);
    }


    public OneCountryPage qatarCountry() {
        driver.findElement(qatarButton).click();
        return new OneCountryPage(driver);
    }

    public OneCountryPage goToQatarCountry() {
        this.qatarCountry();
        return new OneCountryPage(driver);
    }


}