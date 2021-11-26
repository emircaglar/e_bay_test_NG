import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.GenelDriver;

import java.util.concurrent.TimeUnit;

public class _01_anfang extends GenelDriver {

    
    @Test(priority = 2)
     void url(){

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
    }
    @Test(enabled = false)
    void title(){

        System.out.println("driver.getTitle() = " + driver.getTitle());

    }
    @Test(priority = 1)
    void handel(){

        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());
    }
}
