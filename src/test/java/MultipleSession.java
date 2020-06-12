import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultipleSession {
    @Test    
    public void executSessionOne(){
            //First session of WebDriver
	    System.out.println("open the browser: chrome");
        final String CHROME_DRIVER_DIRECTORY = System.getProperty("user.dir") + "/src/test/java/BrowserDrivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_DIRECTORY);
        final WebDriver driver = new ChromeDriver();
            //Goto guru99 site
            driver.get("http://demo.guru99.com/V4/");
            //find user name text box and fill it
            driver.quit();
        }
        
    @Test    
        public void executeSessionTwo(){
            //Second session of WebDriver
        System.out.println("open the browser: FIREFOX ");
        final String GECKO_DRIVER_DIRECTORY = System.getProperty("user.dir") + "/src/test/java/BrowserDrivers/geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", GECKO_DRIVER_DIRECTORY);
        final WebDriver driver = new FirefoxDriver();
        //Goto guru99 site
        driver.get("http://demo.guru99.com/V4/");
        //find user name text box and fill it
        driver.quit();
        }
        
    @Test    
        public void executSessionThree(){
            //Third session of WebDriver
            System.out.println("open the browser: chrome III");
            final String CHROME_DRIVER_DIRECTORY = System.getProperty("user.dir") + "/src/test/java/BrowserDrivers/chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_DIRECTORY);
            final WebDriver driver = new ChromeDriver();
            //Goto guru99 site
        driver.get("http://demo.guru99.com/V4/");
        //find user name text box and fill it
        driver.quit();
        }  
    
}
