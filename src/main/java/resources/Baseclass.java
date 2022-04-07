package resources;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Baseclass {
    public WebDriver driver;
     public Properties p;

    public WebDriver initialiseDriver() throws IOException {
        p= new Properties();
        FileInputStream file = new FileInputStream("C:\\Users\\abhat\\IdeaProjects\\Maven\\src\\main\\java\\resources\\data.properties");
        p.load(file);
        String browsername = p.getProperty("browser");
        if (browsername.equals("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("headless");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);


        } else if (browsername.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();


        } else if (browsername.equals("Edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new ChromeDriver();


        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
        return driver;


    }

}