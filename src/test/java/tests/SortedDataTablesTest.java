package tests;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortedDataTablesTest {

    @Test
    public void tablesNameTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/tables");
        driver.findElement(By.xpath("//*[@id=\"table2\"]/tbody/tr[1]/td[1]"));
        String actualResult1 = driver.findElement(By.xpath("//*[@id=\"table2\"]/tbody/tr[1]/td[1]")).getText();
        String expectedResult1 = "Smith";
        Assert.assertEquals(actualResult1, expectedResult1);
        driver.quit();
    }

    @Test
    public void tablesEmailTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/tables");
        driver.findElement(By.xpath("//*[@id=\"table2\"]/tbody/tr[3]/td[3]"));
        String actualResult = driver.findElement(By.xpath("//*[@id=\"table2\"]/tbody/tr[3]/td[3]")).getText();
        String expectedResult = "jdoe@hotmail.com";
        Assert.assertEquals(actualResult, expectedResult);
        driver.quit();
    }

    @Test
    public void tablesButtonTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/tables");
        driver.findElement(By.xpath("//*[@id=\"table2\"]/tbody/tr[4]/td[6]"));
        String actualResult = driver.findElement(By.xpath("//*[@id=\"table2\"]/tbody/tr[4]/td[6]")).getText();
        String expectedResult = "edit delete";
        Assert.assertEquals(actualResult, expectedResult);
        driver.quit();
    }
}
