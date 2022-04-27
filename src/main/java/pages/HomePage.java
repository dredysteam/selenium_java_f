package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class HomePage {

    private WebDriver driver;
//    private By formAuthenticationLink = By.linkText("Form Authentication");
//    private By dropDownLink = By.linkText("Dropdown");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication(){
//        driver.findElement(formAuthenticationLink).click();
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropDownPage clickDropDownLink(){
//        driver.findElement(dropDownLink).click();
        clickLink("Dropdown");
        return  new DropDownPage(driver);
    }

    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    // Generic method
    public void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

}
