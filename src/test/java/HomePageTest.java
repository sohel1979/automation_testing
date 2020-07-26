import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomePageTest {

    @Test
    public void openHomePage(){
        System.setProperty("webdriver.chrome.driver","C:\\automation_testing\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.partialLinkText("Sign in")).click();
        String actualText = driver.findElement(By.className("page-heading")).getText();
        Assert.assertEquals(actualText, "AUTHENTICATION");
        System.out.printf("Test passed");
        driver.quit();
    }
}
