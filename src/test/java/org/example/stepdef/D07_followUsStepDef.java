package org.example.stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.pool.TypePool;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.example.stepdef.Hooks.driver;

// [class="x1e56ztr x1xmf6yo"]>h2
public class D07_followUsStepDef {
    P03_homePage HP = new P03_homePage();
    @When("user click on facebook icon")
    public void  userClickOnFacebookIcon(){
        HP.facebook().click();
    }

    @Then("user is redirected to website facebook page")
    public void userIsRedirectedToWebsiteFacebookPage() {
        WebDriverWait time = new WebDriverWait(driver,Duration.ofSeconds(2));
        time.until(ExpectedConditions.numberOfWindowsToBe(2));


        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        SoftAssert soft = new SoftAssert();
        String actual_url = driver.getCurrentUrl();
        System.out.println(actual_url);
        String expected_url ="https://www.facebook.com/nopCommerce";
        soft.assertEquals(actual_url,expected_url);
        soft.assertAll();


    }

    @When("user clicks on twitter  icon")
    public void userClicksOnTwitterIcon() {
        HP.twitter().click();
    }

    @Then("user is redirected to website twitter page")
    public void userIsRedirectedToWebsiteTwitterPage()  {
        WebDriverWait time = new WebDriverWait(driver,Duration.ofSeconds(2));
        time.until(ExpectedConditions.numberOfWindowsToBe(2));

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        SoftAssert soft = new SoftAssert();
        String actual_url = driver.getCurrentUrl();
        System.out.println(actual_url);
        String expected_url ="https://twitter.com/nopCommerce";
        soft.assertEquals(actual_url,expected_url);
        soft.assertAll();

    }

    @When("user clicks on rss icon")
    public void userClicksOnRssIcon() {
        HP.rss().click();
    }

    @Then("user is redirected to website rss page")
    public void userIsRedirectedToWebsiteRssPage()  {
        WebDriverWait time = new WebDriverWait(driver,Duration.ofSeconds(2));
        time.until(ExpectedConditions.numberOfWindowsToBe(2));

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        SoftAssert soft = new SoftAssert();
        String actual_url = driver.getCurrentUrl();
        System.out.println(actual_url);
        String expected_url ="https://demo.nopcommerce.com/new-online-store-is-open";
        soft.assertEquals(actual_url,expected_url);
        soft.assertAll();

    }

    @When("user clicks on youtube icon")
    public void userClicksOnYoutubeIcon() {
        HP.youtube().click();
    }

    @Then("user is redirected to website youtube page")
    public void userIsRedirectedToWebsiteYoutubePage() {
        WebDriverWait time = new WebDriverWait(driver,Duration.ofSeconds(2));
        time.until(ExpectedConditions.numberOfWindowsToBe(2));

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        SoftAssert soft = new SoftAssert();
        String actual_url = driver.getCurrentUrl();
        System.out.println(actual_url);
        String expected_url ="https://www.youtube.com/user/nopCommerce";
        soft.assertEquals(actual_url,expected_url);
        soft.assertAll();

    }
}
