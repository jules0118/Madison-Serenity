package steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import page.HeaderPage;

public class HeaderSteps {
    HeaderPage headerPage;
    @Step
    public void showPagetitle(String title){
        headerPage.getGreetMessage();
        Assert.assertEquals(headerPage.headertitle(),title);
    }
    @Step
    public void showCurrentUrl(String url){
        Assert.assertEquals(headerPage.getUrl(),url);
    }
    @Step
    public void showLogo() {
        Assert.assertTrue(headerPage.showLogo());
        headerPage.clickLogo();
        Assert.assertEquals(headerPage.getUrl(), "http://qa2.dev.evozon.com/");
    }
    @Step
    public void checkDropDown(){
        headerPage.checkDropDown();
        Assert.assertTrue(headerPage.checkAccountListIsDisplayed());
        Assert.assertEquals(headerPage.seeAccount(),"ACCOUNT");
    }
    @Step
    public void checkLanguages(){
        headerPage.selectLanguageValue();
    }
    @Step
    public void changeSearchField (){
        headerPage.changeSearchField();
    }
}
