package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {
    @FindBy(css = ".read")
    public WebElement datenschutzerklaerungTaste;
}
