import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testLogger.ConsoleLogger;
import testLogger.Logger;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class selenium {


    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();


        logger.log("Creating web driver instance");
        ChromeDriver driver = new ChromeDriver();

        logger.log("Navigate to URL-Google");
        driver.get("http://www.google.com");


        logger.log("Wait fir title to be Google");
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.titleIs("Google"));

        logger.log("Fill text to search input anbd submit");
        WebElement element = driver.findElement(By.id("lst-ib"));
        element.sendKeys("Hillel");
        element.submit();


        wait.until(ExpectedConditions.titleContains("Hillel"));


        logger.log("Get all result items");
        List<WebElement> list = driver.findElements(By.className("g"));


        logger.log("Get first result items");
        WebElement firstResult = list.get(0);

        logger.log("Get url element result items");
        WebElement linkofHillel = firstResult.findElement(By.tagName("cite"));


        logger.log("Check url element link is hillel link");
        wait.until(ExpectedConditions.textToBePresentInElement(linkofHillel, "https://ithillel.ua"));



        logger.log("Test Pass");

        logger.log("Terminating driver");
        driver.quit();


    }
}




