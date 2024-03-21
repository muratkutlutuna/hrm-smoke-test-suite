package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavBarPage extends BasePage{
    @FindBy(css = "#menu-navigation-hauptmenue-de-1 > li:nth-child(4) > a:nth-child(1)")
    public WebElement support;

    @FindBy(css = "#menu-navigation-hauptmenue-de-1 > li:nth-child(4) > ul:nth-child(2) > li:nth-child(4) > a:nth-child(1)")
    public WebElement newsletter;
}
