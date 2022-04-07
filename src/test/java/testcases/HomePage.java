package testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pageObjets.LandingPage;
import pageObjets.LoginPage;
import resources.Baseclass;

import java.io.IOException;

public class HomePage extends Baseclass {
    @Before
    public void initialize() throws IOException {
        driver = initialiseDriver();
        driver.get(p.getProperty("URL"));

    }

    @Test
    public void basePageNavigation() throws IOException {
        driver = initialiseDriver();
        driver.get(p.getProperty("URL"));
        LandingPage p = new LandingPage(driver);
        p.popup().click();
        p.login().click();
        LoginPage lp = new LoginPage(driver);
        lp.userName().sendKeys("abc@qw.com");
        lp.passward().sendKeys("1232323");
        System.out.println("Hello Ashish develop branch changes");
        lp.button().click();

    }

    @After
    public void teardown(){
        driver.close();

    }








    }

