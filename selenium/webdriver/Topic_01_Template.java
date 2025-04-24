package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_01_Template {
    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
    }
// Từ selenium 1/2/3/4 đều có 8 loại locator
    // ID
    // Class
    // Name
    // Tagname
    // LinkText
    // Partial LinkText
    // CSS Selecter
    // XPath - manh nhat

    @Test
    public void TC_01_Register() {

    }

    @Test
    public void TC_02_Login() {

    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }


}

