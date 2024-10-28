import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
        WebDriver driver;



        public GoogleSearchPage(WebDriver driver) {
            this.driver = driver;

        }

        By searchbox = By.xpath("//textarea[@id='APjFqb']");
        By Search_btn =By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']");
        By facebook_link = By.xpath("//h3[normalize-space()='Facebook - log in or sign up']");

        public void seacrhgoogle(String Searchinput) {
            try {
                driver.findElement(searchbox).sendKeys(Searchinput);
                driver.findElement(Search_btn).click();
            } catch (Exception e) {
                System.out.println("Expected Caught" + e.getMessage());
            }


        }
        public void ClickFacebook(){
            try {
                driver.findElement(facebook_link).click();
            } catch (Exception e) {
                System.out.println("Expected Caught" + e.getMessage());
            }
        }
    }
