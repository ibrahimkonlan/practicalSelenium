import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AmaliBlog_ArticleTest {
    WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://blog.amalitech-dev.net/login");
    }

    @Test
    public void verifyLogin() throws InterruptedException {
        AmaliBlog_Article page = new AmaliBlog_Article(driver);
        page.verifyLogin();
        page.clickFirstArticle();
        page.EnterComments("Great work");
        page.submitButton();

    }
//    @AfterTest
//    public void afterTest(){
//        driver.quit();
//    }
}



