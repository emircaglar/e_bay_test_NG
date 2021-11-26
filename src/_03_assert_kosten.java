import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.GenelDriver;

import java.util.List;

public class _03_assert_kosten extends GenelDriver {
    @Test
    void assert_equals() throws InterruptedException {

        WebElement akzeptieren=driver.findElement(By.className("jsx-4131758822"));
        akzeptieren.click();

        WebElement hallo_geschlosen=driver.findElement(By.cssSelector("a[title='Close (Esc)']"));
        hallo_geschlosen.click();

        WebElement sucht_input=driver.findElement(By.id("site-search-query"));
        sucht_input.sendKeys("reifen");

        WebElement sucht_button=driver.findElement(By.id("site-search-submit"));
         sucht_button.click();

        WebElement von_bis_von = driver.findElement(By.id("srchrslt-brwse-price-min"));
        von_bis_von.sendKeys("100");
        WebElement von_bis_bis= driver.findElement(By.id("srchrslt-brwse-price-max"));
        von_bis_bis.sendKeys("200");

        WebElement weiter_suchen=driver.findElement(By.xpath("//div[@class='browsebox-section-body']/div/button/i"));
        weiter_suchen.click();

        Thread.sleep(2000);
        List<WebElement> prise_list=driver.findElements(By.cssSelector("p[class='aditem-main--middle--price']"));

        for (WebElement e :prise_list
                ) {
            System.out.println("e.getText() = " + e.getText().substring(0,3));
            int eelement=Integer.parseInt(e.getText().substring(0,3));
            Assert.assertTrue(100<=eelement||eelement<=200);
        }
        
        
        
    }
}
