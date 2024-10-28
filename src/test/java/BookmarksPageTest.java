import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BookmarksPageTest {
    WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        driver = new  EdgeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://blog.amalitech-dev.net/login");
    }
    @Test
    public void loginAndVerify() throws InterruptedException{
        BookmarksPage BKs = new BookmarksPage(driver);
        BKs.HomePageLogin();
        BKs.ClickProfile();
        BKs.SelectBookmarksFromDropdown();
        BKs.Enter_SearchForBookmarks();
    }
}
