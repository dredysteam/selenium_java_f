package base;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

//    @BeforeClass
    @BeforeAll
    public void setUp(){
        //        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        homePage  = new HomePage(driver);
        System.out.println("---This is Before All Method");
    }
//    @AfterClass
    @AfterAll
    public void tearDown(){

        driver.quit();
        System.out.println("---This is After All Method");
    }

    public static void main(String args[]){
        BaseTests test = new BaseTests();
        test.setUp();
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("---This is before each method");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("---This is after each method");
    }
}
