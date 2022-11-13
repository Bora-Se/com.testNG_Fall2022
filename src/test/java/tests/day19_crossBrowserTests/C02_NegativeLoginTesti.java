package tests.day19_crossBrowserTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.ReusableMethods;
import utilities.TestBaseCross;

public class C02_NegativeLoginTesti extends TestBaseCross {

    @Test
    public void negativeTest(){

        /*//mycoursdemy anasayfaya gidin
        driver.get(ConfigReader.getProperty("myUrl"));

        // login butonuna tiklayin
        driver.findElement(By.xpath("//a[text()='Log in']")).click();
        ReusableMethods.bekle(3);
        driver.findElement(By.xpath("//a[@onclick=\"cookieAccept();\"]")).click();

        //email ve password icin gecersiz degerler girin

         */

        driver.get(ConfigReader.getProperty("myUrl"));

        driver.findElement(By.xpath("//a[text()='Log in']")).click();

        driver.findElement(By.xpath("//input[@id='login-email']")).
                sendKeys(ConfigReader.getProperty("myYanlisEmail"));

        driver.findElement(By.xpath("//input[@id='login-password']")).
                sendKeys(ConfigReader.getProperty("myYanlisPassword"));
        ReusableMethods.bekle(2);
        driver.findElement(By.xpath("//*[text()='Accept']")).click();
        ReusableMethods.bekle(2);
        driver.findElement(By.xpath("//button[text()='Login']")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Log in']")).isDisplayed());
    }


    }



