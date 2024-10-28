import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleSearch_FacebookTest {
    WebDriver driver;

    GoogleSearchPage objectrepo;

    @BeforeTest
    public void beforeTest(){

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.google.co.uk/");

    }
    @Test
    public void SeacrhOperation() throws InterruptedException{
        GoogleSearchPage page = new GoogleSearchPage(driver);
        page.seacrhgoogle("facebook");


    }
   @Test
    public void VerifyandAccessFacebook(){
        objectrepo = new GoogleSearchPage(driver);
        objectrepo.ClickFacebook();

   }

//@AfterTest
//    public void afterTest(){
//        driver.quit();
//}
} 
