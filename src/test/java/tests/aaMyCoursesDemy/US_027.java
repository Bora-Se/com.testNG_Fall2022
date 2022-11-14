package tests.aaMyCoursesDemy;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.MyCoursedemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_027 {

    @Test
    public void mUS_027Testi(){

        // Mycoursedemy anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        // login linkine basin
        MyCoursedemyPage myCoursedemyPage=new MyCoursedemyPage();
        myCoursedemyPage.loginLinki.click();
        // Kullanici email'i olarak valid email girin
        myCoursedemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("myGecerliEmail"));

        // Kullanici sifresi olarak valid sifre girin
        myCoursedemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("myGecerliPassword"));

        myCoursedemyPage.myCookies.click();
        ReusableMethods.bekle(2);
        // Login butonuna basarak login olun
        myCoursedemyPage.loginButonu.click();

        // Basarili olarak giris yapilabildigini test edin
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(myCoursedemyPage.coursesLinki.isDisplayed());

        softAssert.assertAll();
        Driver.closeDriver();

    }

}
