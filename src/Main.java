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
        driver.get("https://www.daraz.com.bd/");
        driver.manage().window().maximize();





    }




}
