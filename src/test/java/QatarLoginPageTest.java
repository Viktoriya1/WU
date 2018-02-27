import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class QatarLoginPageTest {


        private AppiumDriver driver;
        private AllCountriesPage allCountriesPage;
        private WebDriverWait wait;

        @Before
        public void setUp() throws Exception{
            URL serverURL = new URL("http://127.0.0.1:4723/wd/hub");

            DesiredCapabilities capabilities = new DesiredCapabilities();

            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");

            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iphone 6");
            capabilities.setCapability(MobileCapabilityType.UDID, "C8CC2FE5-4D18-4AD1-AA8B-646CB1CAC171");

//        capabilities.setCapability("nativeInstrumentsLib","true");
             capabilities.setCapability(MobileCapabilityType.APP, "/Users/tereshchenkoviktoriia/Library/Developer/Xcode/DerivedData/WesternUnion-hcvdbaublvobsqcpsiatjuynodvq/Build/Products/Debug-iphonesimulator/WesternUnion_PI.app");


            capabilities.setCapability("showXcodeLog", "true");
            capabilities.setCapability("autoAcceptAlerts", "true");


            System.out.println("Step 1.Create new driver");
            driver = new IOSDriver(serverURL, capabilities);
            wait = new WebDriverWait(driver, 90);
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
            allCountriesPage = new AllCountriesPage(driver);


        }

        @Test
        public void signIn(){
            MainPage mainPage = allCountriesPage.goToQatarCountry()
                    .goToChoseLanguagePage()
                    .goToMainPage()
                    .goToLoginRegisterPage()
                    .goToMainPageLoggedIn("m@mailforspam.com", "Password_01");


            String header = mainPage.getLoggenInInscriptionText();
            Assert.assertEquals("You've securely logged in", header);
        }


        @After
        public void tearDown(){
            driver.quit();
        }
    }
