package org.example.stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import static org.example.stepdef.Hooks.driver;
public class D06_homeSlidersStepDef {
    P03_homePage HP = new P03_homePage();
    @When("user click on nokia product on slider")
    public void UserClickOnNokiaProductOnSlider(){

    }

    @Then("nokia product page open successfully")
    public void nokiaProductPageOpenSuccessfully() {

    }

    @When("user click on iphone product on slider")
    public void userClickOnIphoneProductOnSlider() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(HP.slider_elements().get(0)));
        HP.slider_elements().get(0).click();
    }

    @Then("iphone product page open successfully")
    public void iphoneProductPageOpenSuccessfully() {
    }
}
