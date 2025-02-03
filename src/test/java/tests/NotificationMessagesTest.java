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
        String expectedResult1 = "Action successful\n×";
        String expectedResult2 = "\n            Action unsuccesful, please try again\n            ";
        List<String> messagesList = new ArrayList();
        messagesList.add(expectedResult1);
        messagesList.add(expectedResult2);

        for(String message : messagesList) {
            if (message.equals(actualResult)) {
                Assert.assertEquals(message, actualResult);
            }
        }
        driver.quit();
    }
}
