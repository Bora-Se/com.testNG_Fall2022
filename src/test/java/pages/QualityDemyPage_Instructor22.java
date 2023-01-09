package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualityDemyPage_Instructor22 {

    public QualityDemyPage_Instructor22(){
        PageFactory.initElements(Driver.getDriver(),this);

    }


    //Homepage => Categories
    @FindBy (xpath="//span[text()='Categories']")
    public WebElement categories2; //i[@class='fas fa-bars text-16px']
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
    // -----------------------------------------------------
    // Home page > Log in
    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement loginLink;
    //Home Page > Log in > Email box
    @FindBy(xpath = "//input[@id='login-email']")
    public WebElement emailBox;
    //Home Page > Log in > Login
    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButton;
    //Home Page > cookies "Accept"
    @FindBy(xpath = "//*[text()='Accept']")
    public WebElement acceptCookies;
    //Home Page > Log in > Password box
    @FindBy(xpath = "//input[@id='login-password']")
    public WebElement passwordBox;
    //Home Page
    @FindBy (xpath = "//img[@src='https://qualitydemy.com/uploads/system/393645bf994114c23be28028a47a77a0.png']")
    public WebElement homePage;
    //Home Page > Categories
    @FindBy (xpath = "//i[@class='fas fa-bars text-16px']")
    public WebElement categories;
    //Home Page > Categories > Web Design Course
    @FindBy (xpath = "(//a[@class='py-2 text-wrap d-flex'])[1]")
    public WebElement categoriWebDesing;
    //Home Page > Categories > Web Design Course > HTML5 and CSS
    @FindBy (xpath = "(//*[text()='HTML5 and CSS'])[1]")
    public WebElement HTMLandCSS;
    //Home Page > Categories > Web Design Course > Web Design for Web Developers > Build Responsive Real-World Websites with HTML and CSS
    @FindBy(xpath = "//img[@src='https://qualitydemy.com/uploads/thumbnails/course_thumbnails/optimized/course_thumbnail_default_12.jpg']")
    public WebElement buildResponsiRealWorldHTMLandCSSlink;
    //Home Page > Categories > Web Design Course > Build Responsive Real-World Websites with HTML and CSS > Buy now
    @FindBy (xpath = "//*[text()='Buy now']")
    public WebElement courseBuyNow;
    //Home Page > Shopping
    @FindBy(xpath = "(//a[@href='https://qualitydemy.com/home/shopping_cart'])[1]")
    public WebElement shoppingButton;
    //Home Page > Shopping > checkout
    @FindBy (xpath = "//button[@class='btn red w-100 radius-10 mb-3']")
    public WebElement checkoutButton;
    //Home Page > Shopping >  'Build Responsive Real-World Websites with HTML and CSS' course > checkout > stripe
    @FindBy (xpath = "//img[@class='payment-gateway-icon']")
    public WebElement stripeButoon;
    //Home Page > Shopping >  'Build Responsive Real-World Websites with HTML and CSS' course > checkout > stripe > payWithStripe
    @FindBy (xpath = "//button[@class='stripe-button payment-button float-end']")
    public WebElement payWithStripe;
    //Home Page > Shopping >  'Build Responsive Real-World Websites with HTML and CSS' course > checkout > close button
    @FindBy (xpath = "//i[@class='fa fa-times']")
    public WebElement closeButton;
    //Home Page > Shopping Card Page
    @FindBy (xpath = "//li[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement shoppingCardPage;
    //Home Page > Shopping Card Page > Checkout sprite Page
    @FindBy (xpath = "(//input[@class='CheckoutInput Input Input--empty'])[1]")
    public WebElement checkoutEmail;
    //Home Page > Shopping Card Page > Checkout sprite Page
    @FindBy (xpath = "//input[@autocomplete='cc-number']")
    public WebElement cardNummer;
    //Home Page > Shopping Card Page > Checkout sprite Page
    @FindBy (xpath = "//input[@autocomplete='cc-exp']")
    public WebElement expDatum;
    //Home Page > Shopping Card Page > Checkout sprite Page
    @FindBy(xpath = "//input[@autocomplete='cc-csc']")
    public WebElement cardCVC;
    //Home Page > Shopping Card Page > Checkout sprite Page
    @FindBy (xpath = "//input[@autocomplete='ccname']")
    public WebElement nameOnCard;
    //Home Page > Shopping Card Page > Checkout sprite Page
    @FindBy (xpath = "//select[@autocomplete='billing country']")
    public WebElement countryName;
    //Home Page > Shopping Card Page > Checkout sprite Page
    @FindBy (xpath = "//*[text()='Sweden']")
    public WebElement countrySweden;
    // Home Page > MyCourses
    @FindBy(xpath = "(//*[text()='My courses'])[1]")
    public WebElement myCourses;
    // Home Page > MyCourses > Wordpress
    @FindBy (xpath = "//img[@src='https://qualitydemy.com/uploads/thumbnails/course_thumbnails/optimized/course_thumbnail_default_31666766582.jpg']")
    public WebElement myCoursePageWordpres;
    //
    @FindBy(xpath = "//div[@class='SubmitButton-IconContainer']")
    public WebElement payButton;


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
