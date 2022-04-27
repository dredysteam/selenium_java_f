package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver driver;
    private By inputField = By.id("target");
    private  By resultText = By.id("result");

    public KeyPressesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterText(String text){
        driver.findElement(inputField).sendKeys(text);
    }
    public void enterDollar(){
//        enterText(Keys.chord(Keys.SHIFT + "4"));
        enterText(Keys.chord(Keys.SHIFT + "4") + "=4");
    }
    public String getResultText(){
        return driver.findElement(resultText).getText();
    }
    public String getInputFieldText(){
        return driver.findElement(inputField).getAttribute("value");
    }
}
