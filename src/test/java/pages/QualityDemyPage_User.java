package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class QualityDemyPage_User {

    public QualityDemyPage_User(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    public void loginMethodu(){
        loginLink.click();
        emailKutusu.sendKeys(ConfigReader.getProperty("myGecerliEmail"));
        passwordKutusu.sendKeys(ConfigReader.getProperty("myGecerliPassword"));

        ReusableMethods.bekle(2);
        myCookies.click();
        ReusableMethods.bekle(2);
        loginButonu.click();
    }

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement loginLink;

    //- Click “cookies” pop-up message
    @FindBy(xpath = "//a[@onclick=\"cookieAccept();\"]")
    public WebElement myCookies;

    @FindBy(xpath = "//input[@id='login-email']")
    public WebElement emailKutusu;

    @FindBy(xpath = "//input[@id='login-password']")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButonu;


    //login email
    @FindBy(xpath = "//input[@id='login-email']")
    public WebElement emailLogin;

    @FindBy(xpath = "//input[@id='login-password']")
    public WebElement passwordLogin;


    //mainPage> Sign Up link at top right>***
    @FindBy(xpath = "//*[@class='btn btn-sign-up']")
    public  WebElement signUpLink;
    //mainPage> Shopping cart icon at top right***
    @FindBy(xpath = "//*[@class='fas fa-shopping-cart']")
    public WebElement shoppingCartIcon;
    //mainPage> Search button named as "Search" *
    @FindBy(xpath = "(//button[@class='btn'])[5]")
    public WebElement searchButton;
    //mainPage> Search Icon next to Categories *
    @FindBy(xpath = "(//button[@class='btn'])[1]")
    public WebElement searchIcon;
    //mainPage> 57 Online Courses Text inside the box *
    @FindBy(xpath = "(//div[@class='home-fact-box mr-md-auto mr-auto'])[1]")
    public WebElement onlineCoursesText;
    //mainPage> Expert instruction text *
    @FindBy(xpath = "//*[text()='Expert instruction']")
    public WebElement expertInstructionText;
    //mainPage> Lifetime access text *
    @FindBy(xpath = "//*[text()='Lifetime access']")
    public WebElement lifetimeAccessText;
    //mainPage> Top categories text under Lifetime access text *
    @FindBy(xpath = "(//span[@class='header-underline-2'])[1]")
    public WebElement topCategoriesText;
    //mainPage> Top courses text *
    @FindBy(xpath = "(//span[@class='header-underline-2'])[2]")
    public WebElement topCoursesText;
    //mainPage> Top 10 Latest Courses text *
    @FindBy(xpath = "(//span[@class='header-underline-2'])[3]")
    public WebElement top10LatestCoursesText;
    //mainPage> Featured instructor text *
    @FindBy(xpath = "(//span[@class='header-underline-2'])[4]")
    public WebElement featuredInstructorText;
    //mainPage> Get started button *
    @FindBy(xpath = "//*[@class='btn btn-primary px-4 py-2']")
    public WebElement getStartedButton;
    //mainPage> Join now button *
    @FindBy(xpath = "//*[@class='btn btn-danger px-4 py-2']")
    public WebElement joinNowButton;
    //mainPage> About Us heading under "Help"*
    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[10]")
    public WebElement aboutUs;
    //mainPage> aboutUs> Course List Area *
    @FindBy(xpath = "//*[@class='category-course-list-area']")
    public WebElement courseListArea;
    //mainPage> aboutUs> Quality Demy photo *
    @FindBy(xpath = "//div[@class='col']")
    public WebElement qualityDemy;
    //mainPage> Web Design for Web Developers heading under Top Categories*
    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[1]")
    public WebElement webDesignForWebDevelopers;
    //mainPage> webDesignForWebDevelopers> Web Design for PHP Heading *
    @FindBy(xpath = "(//a[@class='course-title'])[1]")
    public WebElement webDesignForPHP;
    //mainPage> English Speaking Course heading under Top Categories**
    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[2]")
    public WebElement englishSpeakingCourse;
    //mainPage> englishSpeakingCourse> Eng. Spe. Cou. heading*
    @FindBy(xpath = "(//a[@class='course-title'])[1]")
    public WebElement englishCourseLearnToSpeakTitle;
    //mainPage> hTML5AndCSS heading under Top Categories*
    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[3]")
    public WebElement hTML5AndCSS;
    //mainPage> hTML5AndCSS> HTML5 and CSS heading *
    @FindBy(xpath = "//*[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement hTML5AndCSSHeading;
    //mainPage> piano heading under Top Categories *
    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[4]")
    public WebElement piano;
    //mainPage> piano> "Learn Piano in WEEKS not years" subtitle *
    @FindBy(xpath = "(//div[@class='course-subtitle d-none d-md-block'])[1]")
    public WebElement learnPianoInWeeksNotYearsHeading;
    //mainPage> englishGrammar heading under Top Categories *
    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[5]")
    public WebElement englishGrammar;
    //mainPage> englishGrammar> "Learn English Grammar" subtitle *
    @FindBy(xpath = "(//div[@class='course-subtitle d-none d-md-block'])[2]")
    public WebElement learnEnglishGrammar;
    //mainPage> aWSCertification heading under Top Categories *
    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[6]")
    public WebElement aWSCertification;
    //mainPage>aWSCertification> "AWS Certification" subtitle *
    @FindBy(xpath = "//*[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement aWSCertificationHeading;
    //mainPage> blog heading under Useful links*
    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[7]")
    public WebElement blog;
    //mainPage> blog> "Latest Blogs" heading *
    @FindBy(xpath = " (//div[@class='col-12'])[1]")
    public WebElement latestBlogHeading;
    //mainPage> allCourses heading under Useful links *
    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[8]")
    public WebElement allCourses;
    //mainPage> signUp heading under Useful links *
    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[9]")
    public WebElement signUpHeading;
    //mainPage> signUp> "Sign Up" button *
    @FindBy(xpath = "//*[@class='btn red radius-5 mt-4 w-100']")
    public WebElement signUpButton;
    //mainPage> privacyPolicy heading under Help *
    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[11]")
    public WebElement privacyPolicy;
    //mainPage> privacyPolicy> "Privacy Policy" top title *
    @FindBy(xpath = "//*[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement privacyPolicyTopTitle;
    //mainPage> termsandCondition heading under Help *
    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[12]")
    public WebElement termsAndCondition;
    //mainPage> termsandCondition> "Privacy Policy" top title *
    @FindBy(xpath = "//*[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement termsAndConditionTopTitle;
    //mainPage> refundPolicy heading under Help *
    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[13]")
    public WebElement refundPolicy;
    //mainPage> refundPolicy> "Refund Policy" top title *
    @FindBy(xpath = "//*[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement refundPolicyTopTitle;




























    //-------------------------176==325---------------LEVENT-------------------------------------------------------//
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
    // Home Page > Facebook Icon
    @FindBy(xpath = "//i[@class='fab fa-facebook-f']")
    public WebElement facebookIcon;
    // Home Page > Twitter Icon
    @FindBy(xpath = "//i[@class='fab fa-twitter']")
    public WebElement twitterIcon;
    // Home Page > LinkedIn Icon
    @FindBy(xpath = "//i[@class='fab fa-linkedin']")
    public WebElement linkedinIcon;
    // Home Page > Login Link > Forgot Password Link
    @FindBy(xpath = "//a[@class='text-muted text-12px fw-500 float-end']")
    public WebElement forgotPasswordLink;
    // Home Page > Login Link > Login Page > Login Button > Welcome Message
    @FindBy(xpath = "(//script[@type='text/javascript'])[3]")
    public WebElement wellcomeMessage;
    // Home Page > Sign Up Button > First Name Box
    @FindBy(xpath = "//input[@name='first_name']")
    public WebElement firstNameBox;
    // Home Page > Sign Up Button > Last Name Box
    @FindBy(xpath = "//input[@name='last_name']")
    public WebElement lastNameBox;
    // Home Page > Sign Up Button > E-mail Box (at Sign Up Page)
    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailBoxSignUpPage;
    // Home Page > Sign Up Button > Password Box (at Sign Up Page)
    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBoxSignUpPage;
    // Home Page > Sign Up Button > Login Button > Verification Code Page
    @FindBy(xpath = "//input[@id='verification_code']")
    public WebElement verificationCodeBox;
    // Home Page > Sign Up Button > Login Button > Verification Code Page
    @FindBy(xpath = "(//script[@type='text/javascript'])[3]")
    public WebElement verificationCodeWrongMessage;
    // Home Page > Sign Up Button > Login Button > Verification Code Page > Continue Button
    @FindBy(xpath = "(//button[@type='button'])[1]")
    public WebElement continueButton;
    // Home Page > Login Button > Forgot Password Page > Forgot Password Email Box
    @FindBy(xpath = "//input[@id='forgot-password-email']")
    public WebElement forgotPasswordEmailBox;
    // Home Page > Login Button > Forgot Password Page > Send Request Button
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement sendRequestButton;
    // Home Page > Login Button > Forgot Password Page > Login Link (Under Send Request Button)
    @FindBy(xpath = "(//a[@href='https://qualitydemy.com/login'])[2]")
    public WebElement forgotPasswordLoginLink;

    //---------------------------476==625-------------EMINE------------------------------------------------------//
    @FindBy (xpath = "//img[@src='https://qualitydemy.com/uploads/system/393645bf994114c23be28028a47a77a0.png']")
    public WebElement homePage;
    //Home Page >> Heart
    @FindBy (xpath = "(//i[@class='far fa-heart'])[1]")
    public WebElement heartButton;
    //Home Page >> Heart >> Go to WishList
    @FindBy (xpath = "//*[text()='Go to wishlist']")
    public WebElement goToWistListButton;
    //Home Page >> Heart >> Go to WishList >> Course 'React and Typescript' compare link
    @FindBy (xpath = "(//button[@class='btn-compare-sm float-end'])")
    public WebElement myWishListCompare1;
    //Home Page >> Heart >> Go to WishList >> Course compare page
    @FindBy (xpath = "//li[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement courseComparePage;
    //Home Page > Heart > Go to MywishList > SearchBox
    @FindBy (xpath = "//input[@placeholder='Search my wishlist']")
    public WebElement searchMyWishlist;
    //Home Page > Heart > Go to MywishList > React and Typescript
    @FindBy (xpath = "(//*[text()='React and Typescript'])[2]")
    public WebElement reactAndTypescriptText;
    //Home Page > User Test
    @FindBy (xpath = "(//img[@src='https://qualitydemy.com/uploads/user_image/placeholder.png'])[1]")
    public WebElement userTestButton;
    //Home Page > Heart > Go to MywishList > React and Typescript > Admin User
    @FindBy (xpath = "//a[@class='text-14px fw-600 text-decoration-none']")
    public WebElement ReactandTypescriptinstrocturIcon;
    //Home Page > Heart > Go to MywishList > React and Typescriptins >  38:45:16 Hours On demand videos
    @FindBy (xpath = "//i[@class='far fa-file-video']")
    public WebElement durationCourse;
    //Home Page > Heart > Go to MywishList > React and Typescriptins > 12 Lessons
    @FindBy (xpath = "//*[text()='12 Lessons']")
    public WebElement numberCourse;
    //Home Page > User Test >> Logg out
    @FindBy (xpath = "//*[text()=' Log out']")
    public WebElement loggOutButton;
    // ---------------------------------------- US_12 --------------------------------------
    //Home Page > Categories
    @FindBy (xpath = "//i[@class='fas fa-bars text-16px']")
    public WebElement categoriess;
    //Home Page > Categories > Web Design Course
    @FindBy (xpath = "(//a[@class='py-2 text-wrap d-flex'])[1]")
    public WebElement categoriWebDesing;
    //Home Page > Categories > Web Design Course > Web Design for Web Developers
    @FindBy (xpath = "//*[text()='Web Design for Web Developers']")
    public WebElement webDevelopers;
    //Home Page > Categories > Web Design Course > Web Design for Web Developers > React and Typescriptins compare link
    @FindBy (xpath = "(//button[@class='btn-compare-sm'])[2]")
    public WebElement courseCompareReactandTypescriptinsButton;
    //Home Page > Categories > Web Design Course > Web Design for Web Developers
    // > React and Typescriptins compare link > Choose a course to compare 1
    @FindBy(xpath = "(//select[@class='form-select compare-select-box'])[2]")
    public WebElement courseComparePageChooseButton1;
    //Home Page > Categories > Web Design Course > Web Design for Web Developers
    // > React and Typescriptins compare link > Choose a course to compare 1 > Web design for PHP
    @FindBy(xpath = "(//option[@value='web-design-for-php_1'])[2]")
    public WebElement courseComparePageChooseButtonWebDesignforWebPHP;
    //Home Page > Categories > Web Design Course > Web Design for Web Developers
    // > React and Typescriptins compare link > Choose a course to compare 2
    @FindBy (xpath = "(//select[@class='form-select compare-select-box'])[3]")
    public WebElement courseComparePageChooseButton2;
    //Home Page > Categories > Web Design Course > Web Design for Web Developers
    // > React and Typescriptins compare link > Choose a course to compare 2 > Ultimate AWS Certified Solutions Architect Associate SAA-C03
    @FindBy (xpath = "(//option[@value='ultimate-aws-certified-solutions-architect-associate-saa-c03_7'])[3]")
    public WebElement courseComparePageChooseButton2SAA;
    //Home Page > Categories > Web Design Course > Web Design for Web Developers
    // > React and Typescriptins compare link > learn more link
    @FindBy (xpath = "//*[text()='Learn more ']")
    public WebElement reactandTypescriptinsLearnMoreLink;
    //------------------------US_14--------------------------------------------------------------
    //Home Page > Categories > Web Design Course > Wordpress
    @FindBy (xpath = "    //img[@src='https://qualitydemy.com/uploads/thumbnails/course_thumbnails/optimized/course_thumbnail_default_31666766582.jpg']\n")
    public WebElement wordpressButton;
    //Home Page > Categories > Web Design Course > Wordpress > Buy now
    @FindBy (xpath = "//*[text()='Buy now']")
    public WebElement wordpressBuyNow;
    //Home Page > Categories > Web Design Course > Wordpress > Buy now > Shopping Buy text
    @FindBy(xpath = "//li[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement shoppingBuyPage;
    // Home Page > Test User > Purchase history
    @FindBy (xpath = "//*[text()='Purchase history']")
    public WebElement purchaseHistoryButton;
    //Home Page > Test User > Purchase history > Invoice Button
    @FindBy (xpath = "//*[text()='Invoice']")
    public  WebElement invoiceButton;
    //Home Page > Test User > Purchase history > Invoice Button > 'INVOICE' text
    @FindBy (xpath = "//h1[@class='page-title py-5 text-white print-hidden']")
    public WebElement invoiceText;
    //Home Page > Test User > Purchase history >  Disney Magic English
    @FindBy (xpath = "//a[@class='purchase-history-course-title']")
    public WebElement   disneyMagicEnglish;
    //Home Page > Test User > Purchase history >  Disney Magic English > Disney Magic English page
    @FindBy (xpath = "//div[@class='course-header-wrap']")
    public WebElement disneyMagicEnglishPage;


    //mainPage> Quality Demy logo *
    @FindBy(xpath = "//*[@class='navbar-brand pt-2 mt-1']")
    public WebElement logo;
    //mainPage> Categories heading *
    @FindBy(xpath = "//*[@class='fw-500']")
    public WebElement categories;
}
