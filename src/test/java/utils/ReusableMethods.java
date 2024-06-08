package utils;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import pages.UserHomePage;
import static org.junit.Assert.assertTrue;

public class ReusableMethods extends UserHomePage {
    public static void loginUser(String email, String password){
        UserHomePage visitorHomePage=new UserHomePage();
        UserHomePage.ReusableMethods.wait(3);
        UserHomePage.emailBoxLogin.sendKeys(email);
        UserHomePage.ReusableMethods.wait(3);
        UserHomePage.passwordBox.sendKeys(password);
        ReusableMethods.clickAndVerify(visitorHomePage.buttonSignIn);
    }

      public static void clickAndVerify(WebElement element) {
            assertTrue(element.isDisplayed());
              assertTrue(element.isEnabled());
                              element.click();
      }

      public static void wait(int secs) {
            try {
                  Thread.sleep(1000 * secs);
            } catch (InterruptedException e) {
                        e.printStackTrace();
            } catch (TimeoutException e) {
                        e.printStackTrace();
            } catch (NoSuchElementException e) {
                        e.printStackTrace();
            } catch (StaleElementReferenceException e) {
                        e.printStackTrace();
            } catch (Exception e) {
                        e.printStackTrace();
            }
      }
}


