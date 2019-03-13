package Search;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class SearchTest extends CommonAPI {
    @Test
    public void searcUnited(){
      enterTextIntoSearchBox("q");
    }
    @Test
    public void searchBox(){
        enteringTextIntoSearchBox("q","jobs");
    }
    @Test
    public void buttonClick(){
        clickOnSearchButton("//input[@type='submit' and @class='search-button']");
    }
    @Test
    public void clickOnLogo(){
        checkUnitedHealthCareLogoIsWorking("//img[@class='uhc-logo desktop-logo']");
    }
    @Test
    public void clickOnsignIn(){
        clickOnSignInButton("loginmenubutton");
    }
    @Test
    public void clickProvider(){
        clickOnProvider("at-element-click-tracking");
    }
    @Test
    public void chlickHome(){
        clickOnHomeButton("//a[@class='top-menu1']");
    }
    @Test
    public void individualAndFamilies(){
        clickOnIndividualAndFamilies("//a[@title='Individuals & Families']");
    }
    @Test
    public void employers(){
        clickOnEmployers(".top-menu3" );
    }
    @Test
    public void checkMedicare(){
        clickOnMedicare("//a[@title='Medicare']");
    }
    @Test
    public void checkFindADoctor(){
        clickOnFindAdoctor(".top-menu6");
    }
    @Test
    public void  searchMore(){
        clickOnLearnMore("//a[@href='/medicare.html']");
    }
    @Test
    public void searchPlanFromIndividualsAndFamilyPlan(){
        clickOnViewPlanInIndividualsAndFamilyPlan("//a[@aria-label='View plans on UHOne.com (opens in a new window)']");
    }
}
