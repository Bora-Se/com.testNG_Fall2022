package tests.aqualityDemy;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.QualityDemyPage_User22;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_03 {

    QualityDemyPage_User22 pageUser= new QualityDemyPage_User22();

    @Test
    public void testTC0301(){

        //- Launch browser
        //- Go to Quality Demy home page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        //- Click “cookies” pop-up message
        pageUser.acceptCookies.click();

        //- Test if Facebook, Twitter, LinkedIn icons are visable
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(pageUser.facebookIcon.isDisplayed());
        softAssert.assertTrue(pageUser.twitterIcon.isDisplayed());
        softAssert.assertTrue(pageUser.linkedinIcon.isDisplayed());
    }

    @Test
    public void testTC0302(){

        //- Launch browser
        //- Go to Quality Demy home page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        //- Test if Facebook, Twitter, LinkedIn icons are clickable"
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(pageUser.facebookIcon.isEnabled(),"Facebook icon can not be clicked");
        softAssert.assertTrue(pageUser.twitterIcon.isEnabled(),"Twitter icon can not be clicked");
        softAssert.assertTrue(pageUser.linkedinIcon.isEnabled(),"LinkedIn icon can not be clicked");
    }

    @Test
    public void testTC0303() throws InterruptedException {

        //"- Launch browser
        //- Go to Quality Demy home page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        //- Click Facebook icon
        Actions actions= new Actions(Driver.getDriver());
        actions.moveToElement(pageUser.facebookIcon).click();
        ReusableMethods.bekle(5);

        //- Test if Quality Demy's Facebook page is visible
        String expectedTitleFacebook="facebook";
        String actualTitleFacebook=Driver.getDriver().getTitle();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(expectedTitleFacebook, actualTitleFacebook);

        Driver.getDriver().navigate().back();

        //- Click Twitter icon
        actions.moveToElement(pageUser.twitterIcon).click();
        ReusableMethods.bekle(5);

        //- Test if Quality Demy's Twitter page is visible
        String expectedTitleTwitter="twitter";
        String actualTitleTwitter=Driver.getDriver().getTitle();
        softAssert.assertEquals(expectedTitleTwitter, actualTitleTwitter);

        Driver.getDriver().navigate().back();

        //- Click LinkedIn icon
        actions.moveToElement(pageUser.linkedinIcon).click();
        ReusableMethods.bekle(5);

        //- Test if Quality Demy's LinkedIn page is visible"
        String expectedTitleLinkedIn="LinkedIn";
        String actualTitleLinkedIn=Driver.getDriver().getTitle();
        softAssert.assertEquals(expectedTitleLinkedIn, actualTitleLinkedIn);
        Driver.closeDriver();
    }
}
