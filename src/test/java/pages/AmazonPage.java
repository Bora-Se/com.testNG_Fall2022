package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement amazonAramaKutusu;

    @FindBy (xpath= "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramasonucuElementi;

    @FindBy(xpath = "//select[@title='Search in']")
    public WebElement dropdownMenu;

}
