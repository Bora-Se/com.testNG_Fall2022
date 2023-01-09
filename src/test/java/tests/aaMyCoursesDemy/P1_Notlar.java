package tests.aaMyCoursesDemy;

import org.openqa.selenium.interactions.Actions;
import utilities.Driver;

public class P1_Notlar {

    Actions actions = new Actions(Driver.getDriver());

    // // Add to cart ve Added to cart i nasil yakalayacagiz? Select moveTo?
    //        /*//actions.moveToElement(pageUser.moveToElementEnglish).perform();
    //        //actions.moveToElement(pageUser.addElement).perform();
    //        //actions.moveToElement(pageUser.webDevelopers).click().perform();
    //        // derse tiklayalim, Add to cart butonuna basalim, Added to yugorelim   add
    //
    //        actions.moveToElement(pageUser.moveToElementEnglish).sendKeys(Keys.LEFT).sendKeys(Keys.LEFT).sendKeys(Keys.LEFT)
    //                .sendKeys(Keys.LEFT).sendKeys(Keys.LEFT).sendKeys(Keys.LEFT)
    //                .sendKeys(Keys.LEFT).sendKeys(Keys.LEFT).sendKeys(Keys.LEFT).sendKeys(Keys.ENTER).perform();
    //
    //        System.out.println(Driver.getDriver().switchTo().alert().getText());
    //        Driver.getDriver().switchTo().alert().accept();  */
    //
    //        //softAssert.assertTrue(pageUser.addedToCartButton.isEnabled(), "Logged in as Var");
    //
    //        /*4- Popup mesajini yazdirin
    //        System.out.println(driver.switchTo().alert().getText());
    //        //    5- Popup'i tamam diyerek kapatin
    //        driver.switchTo().alert().accept();
    //        //    6- "Click and hold" kutusuna basili tutun
    //        WebElement clickandHold= driver.findElement(By.xpath("(//div[@class='col-lg-12 text-center'])[3]"));
    //        actions.clickAndHold(clickandHold).perform();
    //        //    7-"Click and hold" kutusunda cikan yaziyi yazdirin
    //        System.out.println(clickandHold.getText());*/

    /// Home // Course  Add / Added to Cart Button
    //        //String expectedAddedtoCart = "Added to Cart";
    //        //Assert.assertTrue(pageUser.addedToCartButton.isDisplayed(),"Added to Cart Yazisi gorunmuyor");
    //        //String actuelAddedtoCart = Driver.getDriver().getWindowHandle()+"";
    //        //System.out.println(actuelAddedtoCart);
    //        //Assert.assertEquals(actuelAddedtoCart,expectedAddedtoCart,"Add to Cart yazisi Degismedi");
    //        //Assert.assertTrue(pageUser.addToCartButton.getText().contains(expectedAddedtoCart),"Add to Cart yazisi Degismedi");
    //
    //


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

        // @Test
    //    public void stripeLogoTest3901(){
    //
    //        /*Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
    //        ReusableMethods.bekle(2);
    //        //instructorFor_Instructor.acceptCookies.click();
    //        instructorFor_Instructor.loginLink.click();
    //        instructorFor_Instructor.emailBox.sendKeys(ConfigReader.getProperty("myStudentEmail3"));
    //        instructorFor_Instructor.passwordBox.sendKeys(ConfigReader.getProperty("myStudentPassword3"));
    //        instructorFor_Instructor.loginButton.click();
    //
    //         */




}
