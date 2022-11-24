package tests.aqualityDemy;

import org.apache.http.util.Asserts;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.QDPage;
import pages.QualityDemyPage_User;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_38 {

    QDPage pageUser = new QDPage();
    Actions actions = new Actions(Driver.getDriver());

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void testTC3801() {

        //- Launch browser
        //- Go to Quality Demy home page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        ReusableMethods.bekle(2);

        //Click “cookies” pop-up message
        pageUser.acceptCookies.click();
        //Click login link
        pageUser.loginLinki.click();

        //Enter instructor's (valid) e-mail address
        pageUser.emailBox.sendKeys(ConfigReader.getProperty("myGecerliEmail"));
        //Enter instructor's (valid) password
        pageUser.passwordBox.sendKeys(ConfigReader.getProperty("myGecerliPassword"));

        //Click login Button
        pageUser.loginButton.click();

        //Home Page > Top Courses > Web Design for PHP
        pageUser.webDesignCourse.click();
        ReusableMethods.bekle(2);
        pageUser.compareThisButton.click();

        SoftAssert softAssert = new SoftAssert();

        //Home Page/compare?course-1=web-design-for-php
        String expectedCompare = "web-design-for-php";
        String actuelCompareUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actuelCompareUrl.contains(expectedCompare));

        softAssert.assertAll();

    }

    @Test
    public void testTC3802() {
        //- Launch browser
        //- Go to Quality Demy home page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        ReusableMethods.bekle(2);

        /*
       // pageUser.acceptCookies.click();
        //Click login link
        pageUser.loginLinki.click();

        //Enter instructor's (valid) e-mail address
        pageUser.emailBox.sendKeys(ConfigReader.getProperty("myGecerliEmail"));
        //Enter instructor's (valid) password
        pageUser.passwordBox.sendKeys(ConfigReader.getProperty("myGecerliPassword"));

        //Click login Button
        pageUser.loginButton.click();

         */
        //Home page, Click a course "English Course Learn To Speak"
        pageUser.englishCourse.click();
        //Home/course/english-course-learn-to-speak, Click the "Buy now" button
        pageUser.buyNowButton.click();

        SoftAssert softAssert = new SoftAssert();

        // Home/shopping_cart
        String expected = "English Course Learn To Speak";
        String actuelShoppingCartElement = Driver.getDriver().getTitle();
        softAssert.assertTrue(actuelShoppingCartElement.contains(expected));
        softAssert.assertAll();

    }

    @Test
    public void testTC3803() {

        //- Launch browser
        //- Go to Quality Demy home page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        ReusableMethods.bekle(2);

        //Click “cookies” pop-up message
        pageUser.acceptCookies.click();
        //Click login link
        pageUser.loginLinki.click();

        //Enter instructor's (valid) e-mail address
        pageUser.emailBox.sendKeys(ConfigReader.getProperty("myGecerliEmail"));
        //Enter instructor's (valid) password
        pageUser.passwordBox.sendKeys(ConfigReader.getProperty("myGecerliPassword"));

        //Click login Button
        pageUser.loginButton.click();

        //Home page, Click a course "English Course Learn To Speak"
        pageUser.englishCourse.click();
        //Home/course/english-course-learn-to-speak, Click the "Add to cart" button
        pageUser.addToCartButton.click();

        // Verify that 'Added to Cart' is visible          // Home // Course  Add / Added to Cart Button
        softAssert.assertTrue(pageUser.addedToCartButton.isDisplayed(), "Added to Cart Gorunmuyor");

        ReusableMethods.bekle(3);
        pageUser.cartButton.click();

        softAssert.assertTrue(pageUser.englishCourseShoppingCart.isDisplayed(), "English Course Gorunmuyor");

        softAssert.assertAll();


    }

    @Test
    public void testTC3804() {

        //- Launch browser
        //- Go to Quality Demy home page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        ReusableMethods.bekle(2);

        //Click “cookies” pop-up message
        pageUser.acceptCookies.click();
        //Click login link
        pageUser.loginLinki.click();

        //Enter instructor's (valid) e-mail address
        pageUser.emailBox.sendKeys(ConfigReader.getProperty("myGecerliEmail"));
        //Enter instructor's (valid) password
        pageUser.passwordBox.sendKeys(ConfigReader.getProperty("myGecerliPassword"));

        //Click login Button
        pageUser.loginButton.click();

        //Home page, Click a course "English Course Learn To Speak"
        pageUser.englishCourse.click();
        ReusableMethods.bekle(2);
        //Home/course/english-course-learn-to-speak, Click the "Add to wishlist" button
        pageUser.addTowishlistButton.click();
        // Verify that 'Added to wishlist' is visible
        softAssert.assertTrue(pageUser.addedTowishlistButton.isDisplayed(), "Added to wishlist Gorunmuyor");

        ReusableMethods.bekle(2);
        pageUser.myCoursesButton.click();
        pageUser.wishlistsButton.click();

        softAssert.assertTrue(pageUser.englishCourseMyWishlist.isDisplayed(), "English Course My_wishlist te Gorunmuyor");

        softAssert.assertAll();

    }

    @Test
    public void testTC3805() {

        // ----- BIRKEZ calistiralim
        //- Launch browser
        //- Go to Quality Demy home page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        ReusableMethods.bekle(2);

        //Click “cookies” pop-up message
        pageUser.acceptCookies.click();
        //Click login link
        pageUser.loginLinki.click();

        //Enter instructor's (valid) e-mail address
        pageUser.emailBox.sendKeys(ConfigReader.getProperty("myGecerliEmail11"));
        //Enter instructor's (valid) password
        pageUser.passwordBox.sendKeys(ConfigReader.getProperty("myGecerliPassword11"));

        //Click login Button
        pageUser.loginButton.click();


        // Home Page Course
        //----  pageUser.webDesignCourseForPHP.click();

        // --- pageUser.getEnrolledwebDesignCourseButton.click();

        // Verify that 'Already purchased' is visible          // Home // Course  Already purchased
        softAssert.assertTrue(pageUser.addedToCartButton.isDisplayed(), "Already purchased Gorunmuyor");

        ReusableMethods.bekle(3);
        pageUser.cartButton.click();

        softAssert.assertTrue(pageUser.englishCourseShoppingCart.isDisplayed(), "Web Design for PHP Gorunmuyor");
        // Home Page/My_Course
        String expected = "Web Design for PHP";
        String actuelGetEnrolledElementi = Driver.getDriver().getTitle();
        softAssert.assertTrue(actuelGetEnrolledElementi.contains(expected));

        softAssert.assertAll();


    }

    @Test
    public void testTC3806() {

        // ----- BIRKEZ calistiralim
        //- Launch browser
        //- Go to Quality Demy home page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        ReusableMethods.bekle(2);

        //Click “cookies” pop-up message
        pageUser.acceptCookies.click();
        //Click login link
        pageUser.loginLinki.click();

        //Enter instructor's (valid) e-mail address
        pageUser.emailBox.sendKeys(ConfigReader.getProperty("myGecerliEmail11"));
        //Enter instructor's (valid) password
        pageUser.passwordBox.sendKeys(ConfigReader.getProperty("myGecerliPassword11"));

        //Click login Button
        pageUser.loginButton.click();

        pageUser.learnPythonCourseDersi.click();
         // videonun oldugu bolgede iframe var




    }
}