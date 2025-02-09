package tests;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NotificationMessagesTest {

    @Test
    public void notificationMessagesTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/notification_message_rendered");
        driver.findElement(By.linkText("Click here")).click();
        String actualResult = driver.findElement(By.xpath("//*[@class=\"flash notice\"]")).getText();
        String expectedResult = driver.findElement(By.id("flash")).getText();
        Assert.assertEquals(actualResult,expectedResult);
        driver.quit();
    }
}
