package pageObjets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

   public  WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;

    }
  private By username = By.cssSelector("[type='email']");
    private By passward = By.cssSelector("[type='password']");
    private By button = By.cssSelector("[value='Log In']");

    public WebElement userName(){
       return  driver.findElement(username);
    }
    public WebElement passward(){
        return driver.findElement(passward);

    }
    public WebElement button(){
        return driver.findElement(button);
    }


}
