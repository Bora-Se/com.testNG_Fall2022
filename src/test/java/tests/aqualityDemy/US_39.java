package tests.aqualityDemy;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.QualityDemyPage_Instructor;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_39 {


    QualityDemyPage_Instructor instructorFor_Instructor=new QualityDemyPage_Instructor();
    Actions actions=new Actions(Driver.getDriver());


    @BeforeClass
    public void setUp(){
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        instructorFor_Instructor.acceptCookies.click();
        instructorFor_Instructor.loginLink.click(); //
        instructorFor_Instructor.emailBox.sendKeys(ConfigReader.getProperty("myGecerliEmailInsBora"));
        instructorFor_Instructor.passwordBox.sendKeys(ConfigReader.getProperty("myGecerliPasswordInsBora"));
        instructorFor_Instructor.loginButton.click();
    }

    @Test
    public void stripeLogoTest3901(){

        //-The pay with stripe button should be visible after clicking the stripe logo

        actions.moveToElement(instructorFor_Instructor.categories).perform();
        actions.moveToElement(instructorFor_Instructor.categoriWebDesing).perform();
        actions.moveToElement(instructorFor_Instructor.webDevelopers).click().perform();

        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();

        ReusableMethods.bekle(3);

        instructorFor_Instructor.wordpresslink.click();
       instructorFor_Instructor.wordpressBuyNow.click();

         instructorFor_Instructor.checkoutButton.click();
        instructorFor_Instructor.stripeButoon.click();

        Assert.assertTrue(instructorFor_Instructor.payWithStripe.isDisplayed());

        /* */

    }

    @Test
    public void stripeButtonTest3902(){

        // -When the pay with stripe button is clicked, it should redirect to checkout.stripe.com

        actions.moveToElement(instructorFor_Instructor.categories).perform();
        actions.moveToElement(instructorFor_Instructor.categoriWebDesing).perform();
        actions.moveToElement(instructorFor_Instructor.webDevelopers).click().perform();

        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();

        ReusableMethods.bekle(3);

        instructorFor_Instructor.wordpresslink.click();
        instructorFor_Instructor.wordpressBuyNow.click();

        instructorFor_Instructor.checkoutButton.click();
        instructorFor_Instructor.stripeButoon.click();
        instructorFor_Instructor.payWithStripe.click();

        ReusableMethods.bekle(5);

        String expectedUrl="checkout.stripe";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));


    }
    @Test
    public void shoppingCardPageTest3903(){

        //-When the close button is clicked, it should redirect to the shopping cart page.

        actions.moveToElement(instructorFor_Instructor.categories).perform();
        actions.moveToElement(instructorFor_Instructor.categoriWebDesing).perform();
        actions.moveToElement(instructorFor_Instructor.webDevelopers).click().perform();

        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();

        ReusableMethods.bekle(3);

        instructorFor_Instructor.wordpresslink.click();
        instructorFor_Instructor.wordpressBuyNow.click();

        instructorFor_Instructor.checkoutButton.click();
        instructorFor_Instructor.stripeButoon.click();
        instructorFor_Instructor.closeButton.click();
        Assert.assertTrue(instructorFor_Instructor.shoppingCardPage.isDisplayed());
    }
    @Test
    public void StripecheckoutTest3904(){

        //-E-mail, card information, country information should be filled in appropriately on checkout.stripe.com page


        actions.moveToElement(instructorFor_Instructor.categories).perform();
        actions.moveToElement(instructorFor_Instructor.categoriWebDesing).perform();
        actions.moveToElement(instructorFor_Instructor.webDevelopers).click().perform();

        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();

        ReusableMethods.bekle(3);

        instructorFor_Instructor.wordpresslink.click();
        instructorFor_Instructor.wordpressBuyNow.click();

        instructorFor_Instructor.checkoutButton.click();
        instructorFor_Instructor.stripeButoon.click();
        instructorFor_Instructor.payWithStripe.click();

        instructorFor_Instructor.checkoutEmail.sendKeys("user_1106335@login.com" + Keys.ENTER);
        ReusableMethods.bekle(2);
        instructorFor_Instructor.cardNummer.sendKeys("4242424242424242" +Keys.ENTER);
        ReusableMethods.bekle(2);
        instructorFor_Instructor.expDatum.sendKeys("1225" +Keys.ENTER);
        ReusableMethods.bekle(2);
        instructorFor_Instructor.cardCVC.sendKeys("321" +Keys.ENTER);
        ReusableMethods.bekle(2);
        instructorFor_Instructor.nameOnCard.sendKeys("Abc Def");
        ReusableMethods.bekle(2);
        /*actions.moveToElement(instructorFor_Instructor.countryName).perform();
        ReusableMethods.wait(2);
        actions.moveToElement(instructorFor_Instructor.countrySweden).click().perform();
        ReusableMethods.wait(2);  */

        //Burada zatan Sweden secili oldugu icin hata veriyor

       Driver.closeDriver(); }

    @Test
    public void StripecheckoutKontrolTest3905(){

        //   When the pay button is pressed, it should be checked that the necessary information has been filled.

        actions.moveToElement(instructorFor_Instructor.categories).perform();
        actions.moveToElement(instructorFor_Instructor.categoriWebDesing).perform();
        actions.moveToElement(instructorFor_Instructor.HTMLandCSS).click().perform();

        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();

        ReusableMethods.bekle(3);

        instructorFor_Instructor.buildResponsiRealWorldHTMLandCSSlink.click();
        instructorFor_Instructor.courseBuyNow.click();

        instructorFor_Instructor.checkoutButton.click();
        instructorFor_Instructor.stripeButoon.click();
        instructorFor_Instructor.payWithStripe.click();

        instructorFor_Instructor.checkoutEmail.sendKeys("user_1106335@login.com" + Keys.ENTER);
        ReusableMethods.bekle(2);
        instructorFor_Instructor.cardNummer.sendKeys("4242424242424242" +Keys.ENTER);
        ReusableMethods.bekle(2);
        instructorFor_Instructor.expDatum.sendKeys("1225" +Keys.ENTER);
        ReusableMethods.bekle(2);
        instructorFor_Instructor.cardCVC.sendKeys("321" +Keys.ENTER);
        ReusableMethods.bekle(2);
        instructorFor_Instructor.nameOnCard.sendKeys("Abc Def");
        ReusableMethods.bekle(2);

        //bir önceki testin aynisi cunku bilgilerin doldurulduguna dair bir test olmadigindan tekrar sendkeys ile gönderdim

    }

    @Test
    public void tickTest3906(){
       //Dikkat,Calistirmak icin, tek kullanim hakkimiz var! Yani son satiri uyuttuk
       // -If the required information is filled when the pay button is clicked,
       // a tick should appear on the pay button and then it should redirect to my_courses page.

        actions.moveToElement(instructorFor_Instructor.categories).perform();
        actions.moveToElement(instructorFor_Instructor.categoriWebDesing).perform();
        actions.moveToElement(instructorFor_Instructor.HTMLandCSS).click().perform();

        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();

        ReusableMethods.bekle(3);

        instructorFor_Instructor.buildResponsiRealWorldHTMLandCSSlink.click();
        instructorFor_Instructor.courseBuyNow.click();

        instructorFor_Instructor.checkoutButton.click();
        instructorFor_Instructor.stripeButoon.click();
        instructorFor_Instructor.payWithStripe.click();

        instructorFor_Instructor.checkoutEmail.sendKeys("user_1106335@login.com" + Keys.ENTER);
        ReusableMethods.bekle(2);
        instructorFor_Instructor.cardNummer.sendKeys("4242424242424242" +Keys.ENTER);
        ReusableMethods.bekle(2);
        instructorFor_Instructor.expDatum.sendKeys("1225" +Keys.ENTER);
        ReusableMethods.bekle(2);
        instructorFor_Instructor.cardCVC.sendKeys("321" +Keys.ENTER);
        ReusableMethods.bekle(2);
        instructorFor_Instructor.nameOnCard.sendKeys("Abc Def" );
        ReusableMethods.bekle(2);

        /*   instructorFor_Instructor.payButton.click();  */
        // yorumda kalmali cunku satin alma islemi yapildiktan sonra testler tekrar calismiyor

    }

    @Test
    public void shoppingTest3907(){

        //-Course purchased after payment should be displayed on my_courses page

        ReusableMethods.bekle(5);
        instructorFor_Instructor.myCourses.click();
        Assert.assertTrue(instructorFor_Instructor.myCoursePageWordpres.isDisplayed());
    }

    @AfterClass
    public void tearDown(){

        //Driver.closeDriver();
    }
}


