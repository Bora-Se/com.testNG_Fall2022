package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExercisePage {

    public AutomationExercisePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(linkText = " Signup / Login")
    public WebElement signUpLinki;  //

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signUpLinki2;

    @FindBy(linkText = "//a[@href='/']")
    public WebElement homeBasligi;

    @FindBy(xpath = "//*[text()='New User Signup!']")
    public WebElement newUserSignup;

    @FindBy(xpath = "//h2[text()='Login to your account']")
    public WebElement loginAccountElementi;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement newUserName;

    @FindBy(xpath = "(//input[@type='email'])[2]")
    public WebElement newEmailAdress;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement signupButton;




    @FindBy(xpath = "(//input[@name='email'])[1]")
    public WebElement emailKutusu;

    @FindBy(xpath = "(//input[@name='password'])[1]")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButonu;

    @FindBy(xpath = "")
    public WebElement loggedinAs;

    @FindBy(xpath = "//*[text()='Email Address already exist!']")
    public WebElement alreadyExist;

    @FindBy(xpath = "")
    public WebElement logout;



}