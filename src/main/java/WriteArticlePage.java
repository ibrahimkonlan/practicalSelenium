import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WriteArticlePage {

    WebDriver driver;

    public WriteArticlePage(WebDriver driver) {
        this.driver = driver;
    }

        By MY_LoginBtn = By.xpath("//button[normalize-space()='Login']");
        By Input_txtbox = By.xpath("//div[@class='ProseMirror NgxEditor__Content']");
        By Article = By.xpath("//a[normalize-space()='ARTICLE']");
        By TitleTxtBox = By.cssSelector("//textarea[@class='w-full p-4 titleTextArea text-2xl font-bold ng-pristine ng-invalid ng-touched']");
        By UploadButton = By.cssSelector("[class='inputFile hidden']");
      // By UploadButton = By.xpath("(//div[@class='imageModal absolute inset-0 flex items-center justify-center bg-[#4F4F4F] bg-opacity-50 text-white opacity-0 group-hover:opacity-100 transition-opacity duration-300'])[1]");
        By hoverElement = By.xpath("(//div[@class='imageModal absolute inset-0 flex items-center justify-center bg-[#4F4F4F] bg-opacity-50 text-white opacity-0 group-hover:opacity-100 transition-opacity duration-300'])[1]");


        public void Verify_Login() {
            driver.findElement(MY_LoginBtn).click();

    }
    public void clickOn_Article() throws InterruptedException {
        driver.findElement(Article).click();
    }
    public void write_Article(String InputTxt){
            try {
                driver.findElement(Input_txtbox).sendKeys(InputTxt);
            }catch (Exception e) {
                System.out.println("Expected Caught" + e.getMessage());

            }
         }
    public void Enter_TitleTxt(String inputTxt){
        try {
            driver.findElement(TitleTxtBox).sendKeys(inputTxt);
        }catch (Exception e) {
            System.out.println("Expected Caught" + e.getMessage());

        }
        }


//    public void scrollDown() {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//    }
    public void UploadPicture(String filePath) throws InterruptedException {
        WebElement uploadElement = driver.findElement(UploadButton);
        WebElement HoverElement = driver.findElement(hoverElement);
        Actions action = new Actions(driver);
        action.moveToElement(HoverElement).perform();
        Thread.sleep(5000);
       // WebElement uploadInput = driver.findElement(By.xpath("//input[@type='file']"));
       // ((JavascriptExecutor) driver).executeScript("arguments[0].style.display='block';", uploadElement);
//        uploadElement.click();
        uploadElement.sendKeys(filePath);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

    }

}


