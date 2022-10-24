import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class JmeterIntegration {


    @Test
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "/Users/gabrielmustata/IdeaProjects/JmeterSeleniumIntegration/src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationexercise.com");
        driver.manage().window().maximize();
    }

//    @AfterClass
//    public void closeBrowser(){
//        driver.quit();
//    }
}