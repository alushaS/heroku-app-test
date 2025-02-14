package tests;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTest {

    @Test
    public void selectOptionsTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        Select select = new Select(driver.findElement(By.xpath("//*[@id=\"dropdown\"]")));
        List<WebElement> optionsList = select.getOptions();
        WebElement option1 = optionsList.get(1);
        option1.click();
        String text1 = select.getFirstSelectedOption().getText();
        Assert.assertEquals(text1, "Option 1");
        WebElement option2 = optionsList.get(2);
        option2.click();
        String text2 = select.getFirstSelectedOption().getText();
        Assert.assertEquals(text2, "Option 2");
        driver.quit();
    }
}
