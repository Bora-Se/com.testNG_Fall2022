package tests.day19_crossBrowserTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.TestBaseCross;

public class C01_AmazonSearchTest extends TestBaseCross {


    @Test
    public void test01(){

        // Amazon ana sayfaya gidin
        driver.get(ConfigReader.getProperty("amazonUrl"));
        // Nutella icin arama yapin
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella" + Keys.ENTER);
        // Sonuclarin Nutella icerdigini test edelim
        String actuelSonucYazisi=driver.
                findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"))
                .getText();
        String expectedKelime="Nutella";
        Assert.assertTrue(actuelSonucYazisi.contains(expectedKelime));

    }

}
