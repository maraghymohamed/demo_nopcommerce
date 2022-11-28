package org.example.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

import static org.example.stepdef.Hooks.driver;
public class D02_loginStepDef {
    P02_login l = new P02_login();

    @Given("user go to login page")
    public void userGoToLoginPage(){
       l.login_page_btn().click();
    }



    @And("user press on login button")
    public void userPressOnLoginButton() {
        l.login_btn().click();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(l.MyAccount().isDisplayed());

        String actual_url =driver.getCurrentUrl();
        String expected_url = "https://demo.nopcommerce.com/";
        soft.assertEquals(expected_url,actual_url);


    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        SoftAssert soft = new SoftAssert();


        String actual_url =driver.getCurrentUrl();
        String expected_url = "https://demo.nopcommerce.com/login?returnurl=%2F";
        soft.assertEquals(expected_url,actual_url);

        String actual_msg = l.error_msg().getText();
        String expected_msg = "Login was unsuccessful";
        soft.assertTrue(actual_msg.contains(expected_msg));

        String actual_color = l.error_msg().getCssValue("color");
        String actual_color_hex = Color.fromString(actual_color).asHex();
        String expected_color_hex = "#e4434b";
        soft.assertEquals(actual_color_hex,expected_color_hex);

        soft.assertAll();
    }

    @When("user login with valid {string} and {string}")
    public void userLoginWithValidAnd(String arg0, String arg1) {
        l.email().sendKeys(arg0);
        l.password().sendKeys(arg1);

    }

    @When("user login with invalid {string} and {string}")
    public void userLoginWithInvalidAnd(String arg0, String arg1) {
        l.email().sendKeys(arg0);
        l.password().sendKeys(arg1);
    }
}
