package org.example.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import static org.example.stepdef.Hooks.driver;
import java.util.Random;

public class D05_hoverCategoriesStepDef {
P03_homePage HP = new P03_homePage();
static String selection;
    @When("user hover over top menu items")
    public void userHoverOverTopMenuItem() {
        int size = HP.topmenu().size();
        Random random = new Random();
        int select = random.nextInt(size);
        Actions actions = new Actions(driver);
        actions.moveToElement(HP.topmenu().get(select)).perform();

        int rand;
        switch (select) {
            case 0:
                rand =random.nextInt(3);
                selection = HP.subMenu().get(rand).getText();
                HP.subMenu().get(rand).click();
                break;
            case 1:
                rand =random.nextInt(3,6);
                selection = HP.subMenu().get(rand).getText();
                HP.subMenu().get(rand).click();
                break;
            case 2:
                rand =random.nextInt(6,9);
                selection = HP.subMenu().get(rand).getText();
                HP.subMenu().get(rand).click();
                break;
            default:
                selection = HP.topmenu().get(select).getText();
                HP.topmenu().get(select).click();
        }
    }


    @Then("user is redirected to the selected page")
    public void userIsRedirectedToTheSelectedPage() {
        SoftAssert soft = new SoftAssert();

        String pageTitle = HP.page_title().getText().toLowerCase().trim();
        selection = selection.toLowerCase().trim();
        soft.assertEquals(pageTitle,selection);

        soft.assertAll();

    }
}
