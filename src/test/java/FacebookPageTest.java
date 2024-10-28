import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FacebookPageTest {

    WebDriver driver;


    @BeforeTest
    public void beforeTest() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/index.php/");

    }
    @Test
    public void VerifyLogin() {
        FacebookPage page = new FacebookPage(driver);
        page.EnterUsername();
        page.EnterPassword();
        page.VerifyLogin();
    }
}