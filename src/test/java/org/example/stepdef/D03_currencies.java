package org.example.stepdef;
import static org.example.stepdef.Hooks.driver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D03_currencies {
    P03_homePage HP = new P03_homePage();

    @When("user select euro option")
    public void currency_select(){
        //HP.currency().click();
        Select select= new Select(HP.currency());
        select.selectByVisibleText("Euro");


    }

    @Then("euro symbol is displayed")
    public void check_prices_symbol(){
        SoftAssert soft = new SoftAssert();

        int cout = HP.price_list().size();
        boolean check= true;
        for (int i=0;i<cout;i++){
            String symbol = HP.price_list().get(i).getText();
            check = check & (symbol.contains("€")) & (!symbol.contains("$"));

        }
        soft.assertTrue(check);


        soft.assertAll();
    }
}
