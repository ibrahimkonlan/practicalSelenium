import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookPage {

    WebDriver driver;

    public FacebookPage(WebDriver driver) {
        this.driver = driver;
    }

    By Username_input = By.id("email");
    By Password_input = By.id("pass");
    By Login_btn = By.name("login");

    public void EnterUsername(){
        driver.findElement(Username_input).sendKeys("Konlan");

    }
    public void EnterPassword(){
        driver.findElement(Password_input).sendKeys("Konlan123");

    }
    public void VerifyLogin(){
        driver.findElement(Login_btn).click();
//        String title = driver.getTitle();


    }
}