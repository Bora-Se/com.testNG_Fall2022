package tests.automationExercise;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C05_Exercise05 {


@Test
    public void test5(){

    //Test Case 5: Register User with existing email
    //1. Launch browser
    //2. Navigate to url 'http://automationexercise.com'
    Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));
    //Driver.getDriver().get("http://automationexercise.com");

    //3. Verify that home page is visible successfully
    SoftAssert softAssert=new SoftAssert();
    String expectedUrl="autoUrl";
    //String expectedUrl="https://automationexercise.com/";
    String actualUrl=Driver.getDriver().getCurrentUrl();
    softAssert.assertEquals(actualUrl,expectedUrl,"homepage'de degislsiniz");

    //4. Click on 'Signup / Login' button
    AutomationExercisePage automationExercisePage=new AutomationExercisePage();
    automationExercisePage.signUpLinki.click();

    //5. Verify 'New User Signup!' is visible
    softAssert.assertTrue(automationExercisePage.newUserSignup.isDisplayed(), "New User Signup!, not found");

    //6. Enter name and already registered email address
    automationExercisePage.newUserName.sendKeys(ConfigReader.getProperty("automationemailadress"));
    automationExercisePage.newEmailAdress.sendKeys(ConfigReader.getProperty("newEmailAdress"));

    //7. Click 'Signup' button
    automationExercisePage.signupButton.click();

    //8. Verify error 'Email Address already exist!' is visible
    softAssert.assertTrue(automationExercisePage.alreadyExist.isDisplayed(), "Email Address already exist!, gorunmuyor");

    softAssert.assertAll();
    ReusableMethods.bekle(5);
    Driver.getDriver().close();








}
}
