package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualityDemyPage_User {
    public QualityDemyPage_User(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //--LEVENT--------
    // Home Page > Login Link
    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement loginLinki;
    // Home Page > Login Link > Email Box
    @FindBy(xpath = "//input[@id='login-email']")
    public WebElement emailBox;
    // Home Page > Login Link > Login Button
    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButton;
    // Home Page > Cookies Pop-Up
    @FindBy(xpath = "//a[@onclick='cookieAccept();']")
    public WebElement acceptCookies;
    // Home Page > Login Link > Password Box
    @FindBy(xpath = "//input[@id='login-password']")
    public WebElement passwordBox;

    //Home Page > Top Courses > Web Design for PHP
    @FindBy(xpath = "//h5[text()='Web Design for PHP']")
    public WebElement webDesignCourse;

    //Home Page > Top Courses > Web Design for PHP > Compare this course with other
    @FindBy(xpath = "//a[@href='https://www.qualitydemy.com/home/compare?course-1=web-design-for-php&&course-id-1=1']")
    public WebElement compareThisButton;

    //Home Page > Home > Course compare
    @FindBy(xpath = "//li[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement courseCompare;

    //Home Page > Top Courses > English Course Learn To Speak
    @FindBy(xpath = "//h5[text()='English Course Learn To Speak']")
    public WebElement englishCourse;

    //Home ==> /home/course/english-course-learn-to-speak
    @FindBy(xpath = "//button[text()='Buy now']")
    public WebElement buyNowButton;

    @FindBy(xpath = "//button[text()='Checkout']")
    public WebElement checkoutButton;

    //Home ==> /home/course/english-course-learn-to-speak
    @FindBy(xpath = "//button[text()='Add to Cart']")
    public WebElement addToCartButton;

    //Home ==> /home/course/english-course-learn-to-speak
    @FindBy(xpath = "//button[text()='Added to Cart']")
    public WebElement addedToCartButton;

    //Home ==> /home/course/Go to cart
    @FindBy(xpath = "//div[@id='cart_items']")
    public WebElement cartButton;

    //Home / Shopping Cart
    @FindBy(xpath = " (//div[@class='cart-course-wrapper box-shadow-5'])[2] ")
    public WebElement shoppingCart;


    //Home / English Course Learn To Speak--> Add/Added yakalama
    @FindBy(xpath = "(//img[@data-bs-original-title='Admin User'])[3]")
    public WebElement moveToElementEnglish;


    //Home / Course / Shopping Cart /English Course Learn To Speak--> Sepete eklendi
    @FindBy(xpath = "(//div[text()='English Course Learn To Speak'])[3]")
    public WebElement englishCourseShoppingCart;

    //Home ==> /home/course/english-course-learn-to-speak/ Add to wishlist
    @FindBy(xpath = "//button[@onclick='handleAddToWishlist(this)']")  // (//button[@id='4'])[1]   //button[text()='Add to wishlist']
    public WebElement addTowishlistButton;

    //Home ==> /Home/course/english-course-learn-to-speak / Added to wishlist
    @FindBy(xpath = "//button[text()='Added to wishlist']")
    public WebElement addedTowishlistButton;

    //Home ==> /home/course/english-course-learn-to-speak / My courses //div[@id='wishlist_items']
    @FindBy(xpath = "(//a[text()='My courses'])[1]")
    public WebElement myCoursesButton;

    //Home ==> /home/my_course/ Wishlist //div[@id='wishlist_items']
    @FindBy(xpath = "(//a[@href='https://www.qualitydemy.com/home/my_wishlist'])[3]")
    public WebElement wishlistsButton;

    //Home / Course / Shopping Cart /English Course Learn To Speak--> Sepete eklendi
    @FindBy(xpath = "//h5[text()='English Course Learn To Speak']")
    public WebElement englishCourseMyWishlist;  //h5[text()='Learn Python: The Complete Python Programming Course']


    @FindBy(xpath = "//h5[text()='Learn Python: The Complete Python Programming Course']")
    public WebElement learnPythonCourseDersi;

    @FindBy(xpath = "//h5[text()='Web Design for PHP']")
    public WebElement webDesignCourseForPHP;

    @FindBy(xpath = "//a[text()='Get Enrolled']")
    public WebElement getEnrolledwebDesignCourseButton;



}
