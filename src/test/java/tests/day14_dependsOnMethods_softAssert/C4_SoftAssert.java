package tests.day14_dependsOnMethods_softAssert;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C4_SoftAssert extends TestBase {
    /*
    1. “http://zero.webappsecurity.com/” Adresine gidin
 2. Sign in butonuna basin
 3. Login kutusuna “username” yazin
 4. Password kutusuna “password” yazin
 5. Sign in tusuna basin
 6. Online banking menusu icinde Pay Bills sayfasina gidin
 7. “Purchase Foreign Currency” tusuna basin
 8. “Currency” drop down menusunden Eurozone’u secin
 9. soft assert kullanarak “Eurozone (Euro)” secildigini test edin
 10. soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin “Select One”, “Australia (dollar)“,
  “Canada (dollar)“,”Switzerland (franc)“,”China (yuan)“,”Denmark (krone)“,”Eurozone (euro)“,”Great Britain (pound)“,
  ”Hong Kong (dollar)“,”Japan (yen)“,”Mexico (peso)“,”Norway (krone)“,”New Zealand (dollar)“,”Sweden (krona)“,”Singapore
   (dollar)“,”Thailand (baht)”
     */

    @Test
    public void test01(){
        driver.get("http://zero.webappsecurity.com/");


    }
}
