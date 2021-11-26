import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.GenelDriver;

public class _02_assert extends GenelDriver {
    @Test
    void assert_equals(){

        WebElement akzeptieren=driver.findElement(By.className("jsx-4131758822"));
        akzeptieren.click();

        WebElement hallo_geschlosen=driver.findElement(By.cssSelector("a[title='Close (Esc)']"));
        hallo_geschlosen.click();

        WebElement sucht_input=driver.findElement(By.id("site-search-query"));
        sucht_input.sendKeys("reifen");

        WebElement sucht_button=driver.findElement(By.id("site-search-submit"));
         sucht_button.click();

         WebElement gesucht_sache=driver.findElement(By.cssSelector("span[class='breadcrump-summary']"));

        Assert.assertTrue(gesucht_sache.getText().contains("reifen"));

    }
}
