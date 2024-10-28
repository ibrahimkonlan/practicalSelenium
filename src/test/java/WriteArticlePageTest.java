import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WriteArticlePageTest {
    WebDriver driver;

    @BeforeTest
    public void beforetest(){
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://blog.amalitech-dev.net/login");
    }
    @Test
    public void verifyAndLogin() throws InterruptedException{
        WriteArticlePage Article = new WriteArticlePage(driver);
        Article.Verify_Login();
        Article.clickOn_Article();
        Article.write_Article("Cloud deployments and SaaS offerings have moved many workload deployments out of the data center.");
       Article.Enter_TitleTxt("World's Class Blog Post");
//        Article.scrollDown();
        Thread.sleep(5000);
        Article.UploadPicture("C:\\Users\\HarunaIbrahimKonlan\\Downloads\\B4.jpeg");
    }
}
