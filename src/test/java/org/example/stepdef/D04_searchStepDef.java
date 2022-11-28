package org.example.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.Locale;

import static org.example.stepdef.Hooks.driver;
public class D04_searchStepDef {
P03_homePage HP = new P03_homePage();

    @And("user clicks on search button")
    public void userClicksOnSearchButton(){
        HP.search_btn().click();
    }



    @When("user fills search box by {string}")
    public void userFillsSearchBoxBy(String arg0) {
        HP.search_box().sendKeys(arg0);
    }

    @Then("search result is successful with same {string}")
    public void searchResultIsSuccessfulWithSame(String arg0) {
        SoftAssert soft = new SoftAssert();

        String actual_url = driver.getCurrentUrl();
        String expected_url = "https://demo.nopcommerce.com/search?q=";
        soft.assertTrue(actual_url.contains(expected_url));

        List<WebElement> item = HP.search_result();
        int count =item.size();
        for(int i=0;i<count;i++){
            String actual_text =item.get(i).getText().toLowerCase(Locale.ROOT);
            //System.out.println(actual_text);
            soft.assertTrue(actual_text.contains(arg0));

        }
        soft.assertAll();
    }

    @And("click on the product result")
    public void clickOnTheProductResult() {
        HP.search_result().get(0).click();


    }

    @Then("search result is successful with same {string} and {string}")
    public void searchResultIsSuccessfulWithSameAnd(String arg0, String arg1) {


        SoftAssert soft = new SoftAssert();
        String actual_product = HP.product_Name().getText();
        soft.assertTrue(actual_product.contains(arg1));
        soft.assertAll();
    }
}
