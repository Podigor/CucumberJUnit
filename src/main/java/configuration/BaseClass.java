package configuration;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class BaseClass {
    public static WebDriver driver;
    @BeforeClass
    public static void create() {
        driver = DriverFactory.createDriver(WebDrivers.CHROMECLEAN);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @AfterClass
    public static void end() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
