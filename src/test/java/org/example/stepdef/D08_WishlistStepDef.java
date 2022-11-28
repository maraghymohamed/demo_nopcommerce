package org.example.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.example.stepdef.Hooks.driver;

public class D08_WishlistStepDef {
    P03_homePage HP = new P03_homePage();
    @When("user click on add to wishlist button")
     public void userClickOnAddToWishlistButton(){
        HP.HTC_ONE_add_to_wishlist_btn().click();

     }

    @Then("success notification bar appears to user")
    public void successNotificationBarAppearsToUser() {
        SoftAssert soft = new SoftAssert();
        String actual_msg =HP.Bar_Notification().getText();
        String expected_msg = "The product has been added to your wishlist";
        soft.assertTrue(actual_msg.contains(expected_msg));


        String actual_RGBA = HP.Bar_Notification().getCssValue("background-color");
        String actual_Hex = Color.fromString(actual_RGBA).asHex();
        String expected_Hex = "#4bb07a";
        soft.assertEquals(actual_Hex,expected_Hex);

        soft.assertAll();
    }

    @And("user click on top menu wishlist icon")
    public void userClickOnTopMenuWishlistIcon() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(HP.Bar_Notification()));
        HP.wishlist_icon().click();
    }

    @Then("item is added successfully")
    public void itemIsAddedSuccessfully() {
        SoftAssert soft = new SoftAssert();
        String quantity = HP.wishlist_page_quantity().getAttribute("value");
        int quan = Integer.valueOf(quantity);
        soft.assertTrue((quan>0));
        System.out.println(quan);
        soft.assertAll();
}
}
