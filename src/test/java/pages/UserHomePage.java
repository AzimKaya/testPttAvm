package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class UserHomePage extends Base{
protected static utils.ReusableMethods ReusableMethods;

        @FindBy(xpath = "//*[@class='hidden md:flex user-login bg-eGrey-100 hover:bg-ePurple-500 hover:text-eBlue-900 select-none cursor-pointer text-eBlue-900 font-bold px-2 h-10 items-center justify-center rounded-full md:mr-0 md:ml-0 text-xs transition-all duration-250 hover:bg-eBlue-900 hover:text-white text-center']")
        public WebElement linkLogin;//Hompage ==>> Login button

        @FindBy(xpath = "(//*[@name='button'])[5]")
        public static WebElement cookie;//Login Home page ==>> Cookie button

        @FindBy(xpath = "//*[@id='login-email']")
        public static WebElement emailBoxLogin;//Login Home page ==>> Email address Text Box

        @FindBy(xpath = "//*[@name='password']")
        public static WebElement passwordBox;//Login Home page ==>> Password  Text Box

        @FindBy(xpath = "(//*[@class='h-7 flex justify-center items-center leading-none'])[1]")
        public WebElement buttonSignIn;//Hompage  ==>> Password SignIn button

        @FindBy (xpath = "(//*[@class='eptticon-close'])[3]")
        public WebElement eptticonClose;//Hompage ==>> Close button

        @FindBy (xpath = "//*[@aria-label='Facebook']")
        public WebElement linkFacebook;//Hompagefooter ==>> Facebook link button

        @FindBy (xpath = "//*[@aria-label='Twitter']")
        public WebElement linkTwitter;//Hompagefooter ==>> Twitter link button

        @FindBy(xpath = "//*[@aria-label='Instagram']")
        public WebElement linkInstagram;//Hompagefooter ==>> Instagram link button

        @FindBy(xpath = "//*[@aria-label='Linkedin']")
        public WebElement linkLinkedin;//Hompagefooter ==>> Linkedin link button

        @FindBy(xpath = "//*[@aria-label='YouTube']")
        public WebElement linkYouTube;//Hompagefooter ==>> YouTube link button

    }




