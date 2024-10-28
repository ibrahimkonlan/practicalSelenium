import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmaliBlog_Article {

    WebDriver driver;
    WebDriver wait;

    public AmaliBlog_Article(WebDriver driver) {
        this.driver = driver;
//        this.wait = new WebDriverWait(driver, Duration.ofSeconds());
    }

    By login_btn = By.xpath("//button[normalize-space()='Login']");
    By first_article_link = By.xpath("//figcaption[normalize-space()='An Introduction to Java']");
    By comments = By.xpath("//textarea[@placeholder='Type a comment']");
    By submit_comment_btn = By.cssSelector("button[class=\"submitButton activeSubmitButton\"]");

    // Method to verify login
    public void verifyLogin() {
        WebElement loginButton=driver.findElement(login_btn);
                loginButton.click();
    }


    // Method to click the first article and scroll down
    public void clickFirstArticle() throws InterruptedException {
        WebElement firstArticle=driver.findElement(first_article_link);
                firstArticle.click();
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }
    public void EnterComments(String commentText) throws InterruptedException{
        driver.findElement(comments).sendKeys(commentText);
    }
    public void submitButton() throws InterruptedException{
        driver.findElement(submit_comment_btn).click();
    }
    }




