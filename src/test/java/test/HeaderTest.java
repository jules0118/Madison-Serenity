package test;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.HeaderSteps;

@RunWith(SerenityRunner.class)
public class HeaderTest extends BaseTest{
    @Steps
    HeaderSteps headerSteps;
    @Test
    public void getPagetitleTest(){
        headerSteps.showPagetitle("Madison Island");
    }
    @Test
    public void getCurrentUrl(){
        headerSteps.showCurrentUrl("http://qa2.dev.evozon.com/");
    }
    @Test
    public void getLogo (){
        headerSteps.showLogo();
    }
    @Test
    public void showClickLogo(){
        headerSteps.showLogo();
    }
    @Test
    public void checkDropDown(){
        headerSteps.checkDropDown();
    }
    @Test
    public void checkLanguageTest(){
        headerSteps.checkLanguages();
    }
    @Test
    public void changeSearchField(){
        //headerSteps.
    }
}
