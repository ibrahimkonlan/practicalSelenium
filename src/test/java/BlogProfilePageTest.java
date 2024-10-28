import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BlogProfilePageTest {
    WebDriver driver;

    @BeforeTest
    public void BeforeTest(){
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://blog.amalitech-dev.net/login");
    }
    @Test
    public void VerifyandAcessAmaliBlogPage() throws InterruptedException {
        BlogProfilePage Page = new BlogProfilePage(driver);
        Page.loginVerification();
        Page.clickFirstList();
        Page.clickFirstListProfile();

    }
}
