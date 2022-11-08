package tests.automationExercise;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AutomationExercisePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class C04_Exercise04 {

    @Test
    public void test04(){
        /*---------------------------------------------------------------------------------*/
        //Test Case 4: Logout User
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        //AutomationExercisePage automationExercisePage=new AutomationExercisePage();
        SoftAssert softAssert=new SoftAssert();
        String expectedUrl="https://automationexercise.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl,"homepage'de degilsiniz");

        //4. Click on 'Signup / Login' button
        AutomationExercisePage automationExercisePage=new AutomationExercisePage();
        ReusableMethods.bekle(2);
        automationExercisePage.signUpLinki.click();

        //5. Verify 'Login to your account' is visible
        softAssert.assertTrue(automationExercisePage.loginAccountElementi.isDisplayed(), "Logged in as Gorunmuyor");

        //6. Enter correct email address and password
        automationExercisePage.emailKutusu.sendKeys("");
        automationExercisePage.passwordKutusu.sendKeys("");

        //7. Click 'login' button
        automationExercisePage.loginButonu.click();

        //8. Verify that 'Logged in as username' is visible
        softAssert.assertTrue(automationExercisePage.loggedinAs.isDisplayed(), "Logged in as Gorunmuyor");

        //9. Click 'Logout' button
        automationExercisePage.logout.click();

        //10. Verify that user is navigated to login page




    }


}
