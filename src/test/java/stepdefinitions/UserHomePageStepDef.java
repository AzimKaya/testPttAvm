package stepdefinitions;
import io.cucumber.java.en.Given;
import org.openqa.selenium.JavascriptExecutor;
import pages.Base;
import pages.UserHomePage;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;
import static org.junit.Assert.*;
public class UserHomePageStepDef extends Base {
        UserHomePage userHomePage =new UserHomePage();
    @Given("Go to {string}")
    public void go_to(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }
    @Given("Clicks the Login buttonLink on the home page")
    public void clicks_the_login_button_link_on_the_home_page() {
        ReusableMethods.wait(2);
        userHomePage.cookie.click();
        ReusableMethods.clickAndVerify(userHomePage.linkLogin);
        JavascriptExecutor javascriptExecutor= (JavascriptExecutor) Driver.getDriver();
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();",userHomePage.linkFacebook);
    }
    @Given("Login by entering valid {string} and {string} on the SignIn page.")
    public void login_by_entering_valid_and_on_the_sign_ın_page(String email, String password) {
        ReusableMethods.wait(2);
        ReusableMethods.loginUser(ConfigReader.getProperty(email), ConfigReader.getProperty(password));
        ReusableMethods.wait(2);
        userHomePage.eptticonClose.click();

    }
    @Given("Verify that the body redirect buttons {string},{string},{string},{string},{string},are working.")
    public void clickButton(String Facebook, String Twitter, String Instagram, String Linkedin, String YouTube) {
        String[] buttonArray = new String[]{"Facebook", "Twitter","Instagram", "Linkedin", "YouTube",};
        for (String button : buttonArray) {
            switch (button) {
                case "Facebook":
                    ReusableMethods.wait(2);
                    ReusableMethods.clickAndVerify(userHomePage.linkFacebook);
                    expectedUrl = "https://www.facebook.com/epttavm";
                    for (String windowHandle : Driver.getDriver().getWindowHandles()) {
                        Driver.getDriver().switchTo().window(windowHandle);
                    }
                    actualUrl = Driver.getDriver().getCurrentUrl();
                    assertEquals(expectedUrl, actualUrl);
                    ReusableMethods.wait(2);
                    Driver.getDriver().close();
                    Driver.getDriver().switchTo().window(Driver.getDriver().getWindowHandles().iterator().next());
                    break;
                case "Twitter":
                    ReusableMethods.clickAndVerify(userHomePage.linkTwitter);
                    expectedUrl = "https://x.com/epttavm";
                    for (String windowHandle : Driver.getDriver().getWindowHandles()) {
                        Driver.getDriver().switchTo().window(windowHandle);
                    }
                    actualUrl = Driver.getDriver().getCurrentUrl();
                    assertEquals(expectedUrl, actualUrl);
                    ReusableMethods.wait(2);
                    Driver.getDriver().close();
                    Driver.getDriver().switchTo().window(Driver.getDriver().getWindowHandles().iterator().next());
                    break;
                case "Instagram":
                    ReusableMethods.clickAndVerify(userHomePage.linkInstagram);
                    expectedUrl = "https://www.instagram.com/pttavm/";
                    for (String windowHandle : Driver.getDriver().getWindowHandles()) {
                        Driver.getDriver().switchTo().window(windowHandle);
                    }
                    actualUrl = Driver.getDriver().getCurrentUrl();
                    assertEquals(expectedUrl, actualUrl);
                    ReusableMethods.wait(2);
                    Driver.getDriver().close();
                    Driver.getDriver().switchTo().window(Driver.getDriver().getWindowHandles().iterator().next());
                    break;
                case "Linkedin":
                    ReusableMethods.clickAndVerify(userHomePage.linkLinkedin);
                    expectedUrl = "https://tr.linkedin.com/company/pttavm";
                    for (String windowHandle : Driver.getDriver().getWindowHandles()) {
                        Driver.getDriver().switchTo().window(windowHandle);
                    }
                    actualUrl = Driver.getDriver().getCurrentUrl();
                    assertEquals(expectedUrl, actualUrl);
                    ReusableMethods.wait(2);
                    Driver.getDriver().close();
                    Driver.getDriver().switchTo().window(Driver.getDriver().getWindowHandles().iterator().next());
                    break;
                case "YouTube":
                    ReusableMethods.clickAndVerify(userHomePage.linkYouTube);
                    expectedUrl = "https://www.youtube.com/user/epttavm";
                    for (String windowHandle : Driver.getDriver().getWindowHandles()) {
                        Driver.getDriver().switchTo().window(windowHandle);
                    }
                    actualUrl = Driver.getDriver().getCurrentUrl();
                    assertEquals(expectedUrl, actualUrl);
                    ReusableMethods.wait(2);
                    Driver.getDriver().close();
                    Driver.getDriver().switchTo().window(Driver.getDriver().getWindowHandles().iterator().next());
                    Driver.quitDriver();
                    break;
                default:
                    throw new IllegalArgumentException("Invalid button name");
            }
        }
    }
}












