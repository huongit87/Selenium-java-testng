package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_03_Locator {
    // Khai báo 1 biến đại diện cho Selenium Driver
    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();
        driver.get("https://live.techpanda.org/index.php/customer/account/login/");
    }


    @Test
    public void TC_01_ID() {
        driver.findElement(By.id("email"));
    }

    @Test
    public void TC_02_Class() {
        // Class chỉ truyền vào giá trị 1 phần nếu có khoảng trắng, nếu không có khoảng trắng thì lấy hết được
        driver.findElement(By.className("validate-password"));
    }

    @Test
    public void TC_03_Name() {
        driver.findElement(By.name("login[username]"));
        driver.findElement(By.name("login[password]"));

    }

    @Test
    public void TC_04_TagName() {
        // Tìm xem có bao nhiêu thẻ HTML giống nhau
        int inputNumber = driver.findElements(By.tagName("input")).size();
        System.out.println(inputNumber);

    }

    @Test
    public void TC_05_LinkText() {
        // Dùng với đường link
        // Tuyệt đối: Truyền cả text
        // Ctrl + Shift + U chuyển đổi text hoa thường
        driver.findElement(By.linkText("MY ACCOUNT"));
        driver.findElement(By.linkText("ADVANCED SEARCH"));
        driver.findElement(By.linkText("SEARCH TERMS"));
    }

    @Test
    public void TC_06_Partial_LinkText() {
        // Dùng với đường link
        // Tương đối: Lấy 1 phần hoặc tất cả
        driver.findElement(By.partialLinkText("ACCOUNT"));
        driver.findElement(By.partialLinkText("SEARCH"));
        driver.findElement(By.partialLinkText("TERMS"));
    }

    @Test
    public void TC_07_CSS() {
        //CSS format: tagname[attribute='value']
        // Css vs ID
        driver.findElement(By.cssSelector("input[id='email']"));
        driver.findElement(By.cssSelector("#email"));
        driver.findElement(By.cssSelector("input#email"));
        // Css vs Class
        driver.findElement(By.cssSelector("div[class='account-login']"));
        driver.findElement(By.cssSelector(".account-login"));
        driver.findElement(By.cssSelector("div.account-login"));

        driver.findElement(By.cssSelector("div[class='col-2 registered-users']"));
        driver.findElement(By.cssSelector("div.registered-users"));
        driver.findElement(By.cssSelector(".registered-users"));
        driver.findElement(By.cssSelector("div.registered-users.col-2"));

        // Css vs Name

        driver.findElement(By.cssSelector("input[name='login[username]']"));
        driver.findElement(By.cssSelector("input[name='login[password]']"));
        // Css vs TagName
        // Css vs Link
        driver.findElement(By.cssSelector("a[href='http://live.techpanda.org/index.php/about-magento-demo-store/'"));
        // Css vs PartialLink
        driver.findElement(By.cssSelector("a[href*='about-magento-demo-store/'"));

    }

    @Test
    public void TC_08_Xpath() {
        //Xpath format: //tagname[@attribute='value']
        // XPath vs ID
        driver.findElement(By.xpath("//input[@id='email']"));

        // XPath vs Class
        driver.findElement(By.xpath("//div[@class='account-login']"));
        driver.findElement(By.xpath("//div[@class='col-2 registered-users']"));
        // XPath vs Name
        driver.findElement(By.xpath("//input[@name='login[username]']"));
        driver.findElement(By.xpath("//input[@name='login[password]']"));
        // XPath vs TagName
        // XPath vs Link
        driver.findElement(By.xpath("//a[@href='http://live.techpanda.org/index.php/about-magento-demo-store/']"));
        driver.findElement(By.xpath("//a[text()='My Account']"));
        // XPath vs PartialLink
        driver.findElement(By.xpath("//a[contains(@href, 'customer/account')]"));
        driver.findElement(By.xpath("//a[contains(text(), 'My Account')]"));
        driver.findElement(By.xpath("//a[contains(text(), 'Orders and')]"));
    }


    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
