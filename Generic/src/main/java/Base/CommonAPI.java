package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public WebDriver driver=null;
    @Parameters({"url"})
    @BeforeMethod
    public void setUp(String url){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sheik\\IdeaProjects\\MyFirstWebAutomation\\Generic\\chromedriver\\chromedriver.exe");
        driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }
    @Test
    public void test1(){
       // String title = driver.getTitle();
        //Assert.assertEquals(title,"Health Insurance Plans for Individuals & Families, Employers, Medicare | UnitedHealthcare ");
    }

    @AfterMethod
    public void closeUp(){
       driver.quit();
    }
    public void enterTextIntoSearchBox(String locator){
        try {
            driver.findElement(By.xpath(locator)).sendKeys("medicare", Keys.ENTER);
        }
        catch (Exception e){
            System.out.println("xpath did not work System uses Id locator");
            driver.findElement(By.id(locator)).sendKeys("medicare", Keys.ENTER);
        }
    }
    public void clickOnSearchButton(String locator){
        driver.findElement(By.xpath(locator)).click();
    }
    public void checkUnitedHealthCareLogoIsWorking(String locator){
        driver.findElement(By.xpath(locator)).click();
    }
    public void clickOnSignInButton(String locator){
        driver.findElement(By.id(locator)).click();
    }
    public void clickOnProvider(String locator){
        driver.findElement(By.className(locator)).click();
    }
    public void clickOnHomeButton(String locator){
        driver.findElement(By.xpath(locator)).click();
    }
    public void clickOnIndividualAndFamilies(String locator){
        driver.findElement(By.xpath(locator)).click();
    }
    public void clickOnEmployers(String locator){
        driver.findElement(By.cssSelector(locator)).click();
    }
    public void clickOnMedicare(String locator){
        driver.findElement(By.xpath(locator)).click();
    }
    public void clickOnFindAdoctor(String locator){
        driver.findElement(By.cssSelector(locator)).click();
    }
    public void clickOnLearnMore(String locator){
        driver.findElement(By.xpath(locator)).click();
    }
    public void clickOnViewPlanInIndividualsAndFamilyPlan(String locator){
        driver.findElement(By.xpath(locator)).click();
    }

}
