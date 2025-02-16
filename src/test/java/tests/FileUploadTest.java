package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class FileUploadTest {

    @Test
    public void fileUploadTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.findElement(By.id("file-upload")).sendKeys("src/test/resources/Harakteristika-pasporta-SSHA.jpg");
        driver.findElement(By.id("file-submit")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.textToBe(By.xpath("//h3"), "File Uploaded!"));
        Assert.assertEquals(driver.findElement(By.id("uploaded-files")).getText(), "Harakteristika-pasporta-SSHA.jpg");
        driver.quit();
    }
}
