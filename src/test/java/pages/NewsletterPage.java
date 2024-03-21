package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsletterPage extends BasePage {
    @FindBy(css = ".col-lg-9 > div:nth-child(1) > div:nth-child(1) > h1:nth-child(1)")
    public WebElement anmeldungNewsletter;
    @FindBy(css = "#wpforms-3893-field_4_1")
    public WebElement herrRadio;
    @FindBy(css = "#wpforms-3893-field_5")
    public WebElement vorname;
    @FindBy(css = "#wpforms-3893-field_6")
    public WebElement nachname;
    @FindBy(css = "#wpforms-3893-field_7")
    public WebElement firma;
    @FindBy(css = "#wpforms-3893-field_1")
    public WebElement email;
    @FindBy(css = "#wpforms-3893-field_14_1")
    public WebElement datenschutzBox;
    @FindBy(css = ".g-recaptcha > div:nth-child(1) > div:nth-child(1) > iframe:nth-child(1)")
    public WebElement noRobotIframe;
    @FindBy(css = ".recaptcha-checkbox-border")
    public WebElement noRobotCheckbox;
    @FindBy(css = "#wpforms-submit-3893")
    public WebElement anmeldenTaste;
    @FindBy(css = "#wpforms-confirmation-3893 > p:nth-child(1)")
    public WebElement dankeschoenNachricht;
}
