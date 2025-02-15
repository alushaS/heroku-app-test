package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class DynamicControlsTest {

    @Test
    public void dynamicControlsTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.xpath("//*[@onclick='swapCheckbox()']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(presenceOfElementLocated(By.xpath("//*[@id='message']")));
        List <WebElement> list = driver.findElements(By.xpath("//*[@type='checkbox']"));
        Assert.assertTrue(list.isEmpty());
        WebElement element = driver.findElement(By.xpath("//*[@type='text']"));
        Assert.assertFalse(element.isEnabled());
        driver.findElement(By.xpath("//*[@onclick='swapInput()']")).click();
        wait.until(presenceOfElementLocated(By.xpath("//*[@id='message']")));
        Assert.assertTrue(element.isEnabled());
        driver.quit();
    }
}
