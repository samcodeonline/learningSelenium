package part3_4.com.demoqa.base;

import com.demoqa.pages.HomePage;
import com.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static com.base.BasePage.delay;
import static utilities.Utilities.setUtilityDriver;

public class BaseTest {
    private WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    private String DEMOQA_URL = "https://www.demoqa.com/";

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get(url);
    }

    @BeforeMethod
    public void loadApplication() {
        driver.get(DEMOQA_URL);
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUtilityDriver();
        homePage = new HomePage();
//        homePage.setDriver(driver);
    }

    @AfterClass
    public void tearDown(){
        delay(3000);
        driver.quit();
    }
}
