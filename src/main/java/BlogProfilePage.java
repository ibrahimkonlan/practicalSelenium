import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BlogProfilePage {
    WebDriver driver;

    public BlogProfilePage(WebDriver driver) {
        this.driver = driver;

    }

    By LoginBtn = By.xpath("//button[normalize-space()='Login']");
    By Dropdown = By.xpath("//img[@alt='user profile']");
    By FirstList_MyProfile = By.xpath("//p[normalize-space()='My Profile']");


    // Method to verify login
    public void loginVerification() {
        driver.findElement(LoginBtn).click();
    }

    // Method to click the first item in the dropdown
    public void clickFirstList() throws InterruptedException {
        driver.findElement(Dropdown).click();
    }
    public void clickFirstListProfile() {
        driver.findElement(FirstList_MyProfile).click();
    }
}

