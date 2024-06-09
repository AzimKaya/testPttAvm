package pages;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
public abstract class Base {
  public Base() {
    PageFactory.initElements(Driver.getDriver(), this);
  }
  public static String            actualUrl;
  public static String          expectedUrl;
  public static UserHomePage   userHomePage;

  public static void initialize() {
          userHomePage = new UserHomePage();
  }
}
