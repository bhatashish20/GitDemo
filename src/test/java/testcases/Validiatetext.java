package testcases;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pageObjets.LandingPage;
import resources.Baseclass;

import java.io.IOException;

public class Validiatetext extends Baseclass {

    @Before
    public void initialize() throws IOException {
        driver = initialiseDriver();
        driver.get(p.getProperty("URL"));

    }

    @Test
    public void validiate() throws IOException {
        LandingPage l = new LandingPage(driver);
        l.popup().click();
        Assert.assertEquals(l.title().getText(),"FEATURED COURSES");


    }
    @After
    public void teardown(){
        driver.close();

    }



}
