import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Main {
    public static WebDriver driver;

    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        String path = currentDir + "/Resources/chromedriver";
        System.setProperty("webdriver.chrome.driver",path);
        ChromeOptions options = new ChromeOptions();
//        Map<String,Object> prefs = new HashMap<>();
//        Map<String,Object> profile = new HashMap<>();
//        Map<String,Integer> contentSettings = new HashMap<>();
//        contentSettings.put("notification",2);
//        contentSettings.put("geolocation",2);
//        profile.put("managed_default_content_settings",contentSettings);
//        prefs.put("profile",profile);
//        options.setExperimentalOption("prefs",prefs);
        //To Allow pop up 1 and to Block 2,Default 0
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 1);
        options.setExperimentalOption("prefs", prefs);
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://chaldal.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[2]/div/div/div[2]/div[1]/div/div/div[2]/h5")).click();
//        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[2]/div/div/div[2]/div[1]/div/div/div[3]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[1]/div[1]/form/div/div[1]/input")).sendKeys("egg");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[1]/div[1]/form/div/div[1]/input")).sendKeys(Keys.ENTER);


    }




}
