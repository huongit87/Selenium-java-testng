package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_04_Relative_Locator {
    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2Fapparel");
    }

    @Test
    public void TC_01() {
        // Tìm Remember Me Text
        WebElement rememberMeText = driver.findElement(RelativeLocator.with(By.tagName("label"))
                // Đứng trên Login button
                .above(By.cssSelector("button.login-button"))
                // Đứng dưới Password textbox
                .below(By.id("Password"))
                // Đứng bên phải của Remember Me checkbox
                .toRightOf(By.id("RememberMe"))
                .toLeftOf(By.xpath("//a[text()='Forgot password?']")));

        System.out.println(rememberMeText.getText());
    }

    @Test
    public void TC_02_Login() {

    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }


}

