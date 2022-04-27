package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class KeysTests extends BaseTests {

    @Test
    public void testBackspace(){
        var keyPage = homePage.clickKeyPresses();
        keyPage.enterText("hello" + Keys.BACK_SPACE);
        assertEquals(keyPage.getResultText(),"You entered: BACK_SPACE");
    }
    @Test
    public void testDollar(){
        var keyPage = homePage.clickKeyPresses();
        keyPage.enterDollar();
        assertEquals(keyPage.getInputFieldText(),"$=4");
    }
}
