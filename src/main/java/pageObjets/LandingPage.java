package pageObjets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

    public WebDriver driver;

    public LandingPage(WebDriver driver){
        this.driver=driver;
    }

    By login = By.xpath("//a/i[@class='fa fa-lock fa-lg']/following::*[1]");
    By popu = By.xpath("//button[text()='NO THANKS']");
    By title = By.xpath("//h2[text()='Featured Courses']");
    By nav  = By.xpath("//span[text()='info@qaclickacademy.com']");



    public WebElement popup() {

        return driver.findElement(popu);
    }

    public WebElement login() {
        return driver.findElement(login);
    }
    public WebElement title(){
        return driver.findElement(title);
    }
    public WebElement navbar(){
        return driver.findElement(nav);
    }
}



