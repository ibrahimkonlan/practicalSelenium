import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookmarksPage {
    WebDriver driver;

    public BookmarksPage(WebDriver driver) {
        this.driver = driver;
    }

    By HomePage_LoginBtn = By.xpath("//button[normalize-space()='Login']");
    By Profile_Dropdown = By.xpath("//img[@alt='user profile']");
    By Bookmarks = By.xpath("//a[contains(text(),'My Bookmarks')]");
    By Search_Bookmarks = By.xpath("//input[@placeholder='Search here...']");


    public void HomePageLogin(){
        driver.findElement(HomePage_LoginBtn).click();

    }
    public void ClickProfile()throws InterruptedException{
        WebElement ProfileDropdown = driver.findElement(Profile_Dropdown);
        ProfileDropdown.click();
    }
    public void SelectBookmarksFromDropdown() throws InterruptedException{
        WebElement SelectByVisibleText = driver.findElement(Bookmarks);
        SelectByVisibleText.click();
    }
    public void Enter_SearchForBookmarks() throws InterruptedException{
        WebElement Search = driver.findElement(Search_Bookmarks);
        Search.sendKeys("An Introduction to Java");
    }
}
