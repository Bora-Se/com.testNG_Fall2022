package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualityDemyPage_Instructor {

    public QualityDemyPage_Instructor(){
        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement loginLinki;

    @FindBy(xpath = "//input[@id='login-email']")
    public WebElement emailBox;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[text()='Accept']")
    public WebElement acceptCookies;

    @FindBy(xpath = "//input[@id='login-password']")
    public WebElement passwordBox;

    //Homepage => Categories
    @FindBy (xpath="//span[text()='Categories']")
    public WebElement categories;
    //Homepage => categories => Web Design Course
    @FindBy (xpath ="//span[text()='Web Design Course']")
    public WebElement categoriesWebDesign;
    //Homepage => Categories => English Course
    @FindBy (xpath = "//span[text()='English Course']")
    public WebElement categoriesEnglish;
    //Homepage => Categories => IT & SoftWare
    @FindBy (xpath="//span[text()='IT & Software']")
    public WebElement categoriesIt;
    //Homepage => Categories => Music
    @FindBy (xpath= "//span[text()='Music']")
    public WebElement categoriesMusic;
    //Homepage => categories => Personel Developments
    @FindBy (xpath= "//span[text()='Personal Developments']")
    public WebElement categoriesPersonelDevelopments;
    //Homepage => Categories => All courses
    @FindBy (xpath= "//span[text()='All courses']")
    public WebElement categoriesAllCourses;
    //Homepage => User box icon
    @FindBy (xpath= "//div[@class='user-box menu-icon-box']")
    public WebElement userBoxIcon;
    //Homepage => User box icon => My messages
    @FindBy(xpath = "//a[text()='My messages']")
    public WebElement myMessages;
    //Homepage => User box icon => My messages => textarea
    @FindBy (xpath= "//textarea[@name='message']")
    public WebElement messageArea;
    //Homepage => User box icon => My messages => Send
    @FindBy (xpath = "(//button[@type='submit'])[2]")
    public WebElement messageSendButton;
    //Homepage => User box icon => My messages => Cancel
    @FindBy (xpath = "(//button[@type='submit'])[2]")
    public WebElement messageCancelButton;
    //Homepage => User box icon => My messages => Compose
    @FindBy (xpath = "//button[@id='NewMessage']")
    public WebElement messageComposeButton;
    //Homepage => User box icon => My messages => correspondence
    @FindBy (xpath = "(//div[@class='message-sender-wrap'])[1]")
    public  WebElement correspondence;
    @FindBy (xpath="//div[@class='message-content']")
    public WebElement messageContent;
    //===============================US_15=================
    //Homepage => User box icon => User profile
    @FindBy (xpath= "//a[text()='User profile']")
    public WebElement userProfilePage;
    //Homepage => User box icon => User profile => FirstName
    @FindBy (xpath = "//input[@id='FristName']")
    public WebElement userProfileFirstName;
    //Homepage => User box icon => User profile => Last Name
    @FindBy (xpath = "//input[@name='last_name']")
    public WebElement userProfileLastName;
    //Homepage => User box icon => User profile => Title
    @FindBy (xpath = "//textarea[@name='title']")
    public WebElement userProfileTitle;
    //Homepage => User box icon => User profile => Skills
    @FindBy (xpath= "//span[@class='input placeholder']")
    public WebElement userProfileSkills;
    //Homepage => User box icon => User profile => Biography
    @FindBy (xpath = "//body[@id='tinymce']") //bu yanlış
    public WebElement userProfileBiography;
    //Homepage => User box icon => User profile => Twitter
    @FindBy (xpath = "//input[@name='twitter_link']")
    public WebElement userProfileTwitter;
    //Homepage => User box icon => User profile => Facebook
    @FindBy (xpath = "//input[@name='facebook_link']")
    public WebElement userProfileFacebook;
    //Homepage => User box icon => User profile => Linkedin
    @FindBy (xpath = "//input[@name='linkedin_link']")
    public WebElement userProfileLinkedin;
    //Homepage => User box icon => User profile => Save
    @FindBy (xpath = "//button[text()='Save']")
    public WebElement userProfileSave;
    //Homepage => User box icon => User profile => Profile
    @FindBy (xpath = "//i[@class='far fa-user-circle']")
    public WebElement userProfilProfilButton;
    //===========================US_18================================
    //Homepage => Instructor section
    @FindBy (xpath="//a[text()='Instructor']")
    public WebElement instructorSection;
    //Homepage => Instructor section => Number of courses
    @FindBy (xpath = "//p[text()='Number of courses']")
    public WebElement numberOfCourses;
    //Homepage => Instructor section => Courses page
    @FindBy (xpath = "//h4[@class='page-title']")
    public WebElement coursesPage;
    //Homepage => Instructor section => Number of Enrolment
    @FindBy (xpath = "//p[text()='Number of enrolment']")
    public WebElement numberOfEnrolment;
    //Homepage => Instructor section => Pending Balance
    @FindBy (xpath = "//p[text()='Pending balance']")
    public WebElement pendingBalance;
    //Homepage => Instructor section => Number of Enrolment => Payout Report
    @FindBy (xpath = "//h4[@class='page-title']")
    public WebElement payOutReport;
    //Homepage => Instructor section => Requested withdrawal amount
    @FindBy (xpath = "//p[text()='Requested withdrawal amount']")
    public WebElement requestedWithdrawelAmount;



}
