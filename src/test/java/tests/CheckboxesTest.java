package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

    public class CheckboxesTest {

        @Test
        public void checkboxesTestFirst() {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://the-internet.herokuapp.com/checkboxes");
            WebElement checkbox = driver.findElements(By.cssSelector("[type=checkbox]")).get(0);
            if (!checkbox.isSelected()) {
                checkbox.click();
            }

            Assert.assertEquals(checkbox.isSelected(), true);
            driver.quit();
        }

        @Test
        public void checkboxesTestSecond() {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://the-internet.herokuapp.com/checkboxes");
            WebElement checkbox = driver.findElements(By.cssSelector("[type=checkbox]")).get(1);
            if (checkbox.isSelected()) {
                checkbox.click();
            }

            Assert.assertEquals(checkbox.isSelected(), false);
            driver.quit();
        }
    }