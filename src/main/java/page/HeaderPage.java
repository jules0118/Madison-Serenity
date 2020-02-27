
package page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.time.Duration;

import static org.hamcrest.CoreMatchers.is;

public class HeaderPage extends AbstractPage{

    @FindBy(css="p.welcome-msg")
    private WebElementFacade greetMessage;

    @FindBy(css="header>title")
    private WebElementFacade headertitle;

    @FindBy(css = ".logo")
    private  WebElementFacade logo;

    @FindBy(css = ".skip-account")
    private WebElementFacade account;

    @FindBy(css="#header-account")
    private WebElementFacade accountDropDownList;
    @FindBy(id="select-language")
    private WebElementFacade languageDropDown;
    @FindBy (css = "#search")
    private  WebElementFacade clearsearch;

    @FindBy (css = "button search-button")
    private WebElementFacade searchbutton;

    @FindBy ( css =  ".page-title")
    private WebElementFacade getPageTitleSearch;

    public String getGreetMessage(){
            withTimeoutOf(Duration.ofSeconds(5)).waitFor(greetMessage);
            return greetMessage.getText();
    }
    public String headertitle(){
        return getDriver().getTitle();
    }
    public String getUrl(){
        return getDriver().getCurrentUrl();
    }
    public boolean showLogo(){
        return logo.isDisplayed();
    }
    public void clickLogo(){
        logo.click();
    }
    public void checkDropDown (){
        account.click();
    }
    public boolean checkAccountListIsDisplayed(){
        return accountDropDownList.isDisplayed();
    }
    public String seeAccount (){
        return account.getText();
    }
    public void selectLanguageValue(){
        languageDropDown.selectByVisibleText("French");
        Assert.assertThat(languageDropDown.getSelectedVisibleTextValue(), is("French"));
    }
    public void changeSearchField (){
        //insertInFieldSearchField.

    }



}
