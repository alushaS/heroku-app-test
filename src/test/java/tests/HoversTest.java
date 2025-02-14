package tests;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoversTest {

    @Test
    public void hoverUser1Test() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/hovers");
        Actions actions = new Actions(driver);
        List<WebElement> list = driver.findElements(By.xpath("//*[@class='figure']"));
        actions.moveToElement(list.get(0)).moveToElement(driver.findElement(By.xpath("//*[@href='/users/1']"))).click().build().perform();
        String user1Url = "https://the-internet.herokuapp.com/users/1";
        Assert.assertEquals(driver.getCurrentUrl(), user1Url);
        driver.quit();
    }

    @Test
    public void hoverUser2Test() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/hovers");
        Actions actions = new Actions(driver);
        List<WebElement> list = driver.findElements(By.xpath("//*[@class='figure']"));
        actions.moveToElement(list.get(1)).moveToElement(driver.findElement(By.xpath("//*[@href='/users/2']"))).click().build().perform();
        String user2Url = "https://the-internet.herokuapp.com/users/2";
        Assert.assertEquals(driver.getCurrentUrl(), user2Url);
        driver.quit();
    }

    @Test
    public void hoverUser3Test() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/hovers");
        Actions actions = new Actions(driver);
        List<WebElement> list = driver.findElements(By.xpath("//*[@class='figure']"));
        actions.moveToElement(list.get(2)).moveToElement(driver.findElement(By.xpath("//*[@href='/users/3']"))).click().build().perform();
        String user3Url = "https://the-internet.herokuapp.com/users/3";
        Assert.assertEquals(driver.getCurrentUrl(), user3Url);
        driver.quit();
    }
}