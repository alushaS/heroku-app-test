package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AddRemoveElementsTest {

        @Test
        public void addRemoveElementsTest() {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
            driver.findElement(By.xpath("//button[text()='Add Element']")).click();
            driver.findElement(By.xpath("//button[text()='Add Element']")).click();
            driver.findElement(By.xpath("//button[text()='Delete']")).click();
            List<WebElement> list = driver.findElements(By.xpath("//button[text()='Delete']"));
            Assert.assertEquals(list.size(), 1);
            driver.quit();
        }
    }
