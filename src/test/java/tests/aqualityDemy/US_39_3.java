package tests.aqualityDemy;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.QualityDemyPage_Instructor22;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_39_3 {


    /*
   the functions of the payment page should work correctly
-The pay with stripe button should be visible after clicking the stripe logo
-When the pay with stripe button is clicked, it should redirect to checkout.stripe.com
-When the close button is clicked, it should redirect to the shopping cart page.
-E-mail, card information, country information should be filled in appropriately on checkout.stripe.com page
-When the pay button is pressed, it should be checked that the necessary information has been filled.
-If the required information is filled when the pay button is clicked, a tick should appear on the pay button and then it should redirect to my_courses page.
-course purchased after payment should be displayed on my_courses page
    */
    QualityDemyPage_Instructor22 qualityDemyPage_Instructor=new QualityDemyPage_Instructor22();
    Actions actions=new Actions(Driver.getDriver());


    @BeforeClass
    public void setUp(){
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        qualityDemyPage_Instructor.acceptCookies.click();
        qualityDemyPage_Instructor.loginLink.click();
        qualityDemyPage_Instructor.emailBox.sendKeys(ConfigReader.getProperty("myStudentEmailBora"));
        qualityDemyPage_Instructor.passwordBox.sendKeys(ConfigReader.getProperty("myStudentPasswordBora"));
        qualityDemyPage_Instructor.loginButton.click();
    }

    @Test
    public void US_39_TC01(){

        //-The pay with stripe button should be visible after clicking the stripe logo


        actions.moveToElement(qualityDemyPage_Instructor.categories).perform();
        actions.moveToElement(qualityDemyPage_Instructor.categoriWebDesing).perform();
        actions.moveToElement(qualityDemyPage_Instructor.HTMLandCSS).perform();
        actions.moveToElement(qualityDemyPage_Instructor.HTMLandCSS).click().perform();

        ReusableMethods.bekle(3);

        qualityDemyPage_Instructor.buildResponsiRealWorldHTMLandCSSlink.click();
        qualityDemyPage_Instructor.courseBuyNow.click();

        qualityDemyPage_Instructor.checkoutButton.click();
        qualityDemyPage_Instructor.stripeButoon.click();

        Assert.assertTrue(qualityDemyPage_Instructor.payWithStripe.isDisplayed());

    }

    @Test
    public void US_39_TC02(){

        // -When the pay with stripe button is clicked, it should redirect to checkout.stripe.com

        actions.moveToElement(qualityDemyPage_Instructor.categories).perform();
        actions.moveToElement(qualityDemyPage_Instructor.categoriWebDesing).perform();
        actions.moveToElement(qualityDemyPage_Instructor.HTMLandCSS).click().perform();

        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();

        ReusableMethods.bekle(3);

        qualityDemyPage_Instructor.buildResponsiRealWorldHTMLandCSSlink.click();
        qualityDemyPage_Instructor.courseBuyNow.click();

        qualityDemyPage_Instructor.checkoutButton.click();
        qualityDemyPage_Instructor.stripeButoon.click();
        qualityDemyPage_Instructor.payWithStripe.click();

        ReusableMethods.bekle(5);

        String expectedUrl="checkout.stripe";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));


    }
    @Test
    public void US_39_TC03(){

        //-When the close button is clicked, it should redirect to the shopping cart page.

        actions.moveToElement(qualityDemyPage_Instructor.categories).perform();
        actions.moveToElement(qualityDemyPage_Instructor.categoriWebDesing).perform();
        actions.moveToElement(qualityDemyPage_Instructor.HTMLandCSS).click().perform();

        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();

        ReusableMethods.bekle(3);

        qualityDemyPage_Instructor.buildResponsiRealWorldHTMLandCSSlink.click();
        qualityDemyPage_Instructor.courseBuyNow.click();

        qualityDemyPage_Instructor.checkoutButton.click();
        qualityDemyPage_Instructor.stripeButoon.click();
        qualityDemyPage_Instructor.closeButton.click();
        Assert.assertTrue(qualityDemyPage_Instructor.shoppingCardPage.isDisplayed());
    }
    @Test
    public void US_39_TC04(){

        //-E-mail, card information, country information should be filled in appropriately on checkout.stripe.com page


        actions.moveToElement(qualityDemyPage_Instructor.categories).perform();
        actions.moveToElement(qualityDemyPage_Instructor.categoriWebDesing).perform();
        actions.moveToElement(qualityDemyPage_Instructor.HTMLandCSS).click().perform();

        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();

        ReusableMethods.bekle(3);

        qualityDemyPage_Instructor.buildResponsiRealWorldHTMLandCSSlink.click();
        qualityDemyPage_Instructor.courseBuyNow.click();

        qualityDemyPage_Instructor.checkoutButton.click();
        qualityDemyPage_Instructor.stripeButoon.click();
        qualityDemyPage_Instructor.payWithStripe.click();

        qualityDemyPage_Instructor.checkoutEmail.sendKeys("user_1106335@login.com" + Keys.ENTER);
        ReusableMethods.bekle(2);
        qualityDemyPage_Instructor.cardNummer.sendKeys("4242424242424242" +Keys.ENTER);
        ReusableMethods.bekle(2);
        qualityDemyPage_Instructor.expDatum.sendKeys("1225" +Keys.ENTER);
        ReusableMethods.bekle(2);
        qualityDemyPage_Instructor.cardCVC.sendKeys("321" +Keys.ENTER);
        ReusableMethods.bekle(2);
        qualityDemyPage_Instructor.nameOnCard.sendKeys("Abc Def");  // +Keys.Enter yapmadim cunku satin alma islemi olmamasi icin
        ReusableMethods.bekle(2);
      /*  actions.moveToElement(instructorFor_Instructor.countryName).perform();
        ReusableMethods.wait(2);
        actions.moveToElement(instructorFor_Instructor.countrySweden).click().perform();
        ReusableMethods.wait(2);  */

        //Burada zatan Sweden otomatik secili oldugu icin hata veriyor. Yazdim ama yoruma aldim

    }
    @Test
    public void US_39_TC05(){

        //   When the pay button is pressed, it should be checked that the necessary information has been filled.

        actions.moveToElement(qualityDemyPage_Instructor.categories).perform();
        actions.moveToElement(qualityDemyPage_Instructor.categoriWebDesing).perform();
        actions.moveToElement(qualityDemyPage_Instructor.HTMLandCSS).click().perform();

        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();

        ReusableMethods.bekle(3);

        qualityDemyPage_Instructor.buildResponsiRealWorldHTMLandCSSlink.click();
        qualityDemyPage_Instructor.courseBuyNow.click();

        qualityDemyPage_Instructor.checkoutButton.click();
        qualityDemyPage_Instructor.stripeButoon.click();
        qualityDemyPage_Instructor.payWithStripe.click();

        qualityDemyPage_Instructor.checkoutEmail.sendKeys("user_1106335@login.com" + Keys.ENTER);
        ReusableMethods.bekle(2);
        qualityDemyPage_Instructor.cardNummer.sendKeys("4242424242424242" +Keys.ENTER);
        ReusableMethods.bekle(2);
        qualityDemyPage_Instructor.expDatum.sendKeys("1225" +Keys.ENTER);
        ReusableMethods.bekle(2);
        qualityDemyPage_Instructor.cardCVC.sendKeys("321" +Keys.ENTER);
        ReusableMethods.bekle(2);
        qualityDemyPage_Instructor.nameOnCard.sendKeys("Abc Def");
        ReusableMethods.bekle(2);
//bir ??nceki testin aynisi cunku bilgilerin doldurulduguna dair bir test olmadigindan tekrar sendkeys ile g??nderdim

    }
    @Test
    public void US_39_TC06(){
        actions.moveToElement(qualityDemyPage_Instructor.categories).perform();
        actions.moveToElement(qualityDemyPage_Instructor.categoriWebDesing).perform();
        actions.moveToElement(qualityDemyPage_Instructor.HTMLandCSS).click().perform();

        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();

        ReusableMethods.bekle(3);

        qualityDemyPage_Instructor.buildResponsiRealWorldHTMLandCSSlink.click();
        qualityDemyPage_Instructor.courseBuyNow.click();

        qualityDemyPage_Instructor.checkoutButton.click();
        qualityDemyPage_Instructor.stripeButoon.click();
        qualityDemyPage_Instructor.payWithStripe.click();

        qualityDemyPage_Instructor.checkoutEmail.sendKeys("user_1106335@login.com" + Keys.ENTER);
        ReusableMethods.bekle(2);
        qualityDemyPage_Instructor.cardNummer.sendKeys("4242424242424242" +Keys.ENTER);
        ReusableMethods.bekle(2);
        qualityDemyPage_Instructor.expDatum.sendKeys("1225" +Keys.ENTER);
        ReusableMethods.bekle(2);
        qualityDemyPage_Instructor.cardCVC.sendKeys("321" +Keys.ENTER);
        ReusableMethods.bekle(2);
        qualityDemyPage_Instructor.nameOnCard.sendKeys("Abc Def" );
        ReusableMethods.bekle(2);

        /*   instructorFor_Instructor.payButton.click();  */
        // yorumda kalmali cunku satin alma islemi yapildiktan sonra testler tekrar calismiyor


    }

    @Test
    public void US_39_TC07(){

        //-Course purchased after payment should be displayed on my_courses page

        ReusableMethods.bekle(5);

        qualityDemyPage_Instructor.myCourses.click();

        Assert.assertTrue(qualityDemyPage_Instructor.myCoursePageWordpres.isDisplayed());
    }


    @AfterClass
    public void tearDown(){

        Driver.closeDriver();
    }
}