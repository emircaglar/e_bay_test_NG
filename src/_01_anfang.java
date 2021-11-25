import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class _01_anfang {

    public static WebDriver driver;

    @BeforeClass
    void anfang() {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.ebay-kleinanzeigen.de/");

    }

    @AfterClass
    void ausgang() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
    
    
    
    @Test
     void url(){

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
    }
    @Test
    void title(){

        System.out.println("driver.getTitle() = " + driver.getTitle());

    }
    @Test
    void handel(){

        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());
    }
}
