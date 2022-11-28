package org.example.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import java.util.Random;

import static org.example.stepdef.Hooks.driver;

public class D01_registration {
 P01_register reg = new P01_register();
    @Given("user go to register page")
    public void userG22oToRegisterPage(){
    reg.register_page_btn().click();
   }

    @When("user select gender type")
    public void userSelectGenderType() {
     reg.gender().get(0).click();

    }


    @And("user enter {string} automation and {string} tester")
     public void userEnterAutomationAndTester(String arg0, String arg1) {
     reg.firstName().sendKeys(arg0);
     reg.lastName().sendKeys(arg1);

    }


    @And("user enter date of birth")
    public void userEnterDateOfBirth() {

     Random random = new Random();
     //Day Static dropdown list
     int randomDay = random.nextInt(1,31);
     Select selectday= new Select(reg.daylist());
     System.out.println(selectday.getAllSelectedOptions().size());
     selectday.selectByIndex(randomDay);

     //Month Static dropdown list
     int randomMonth = random.nextInt(1,13);
     Select selectmonth = new Select(reg.monthlist());
     selectmonth.selectByIndex(randomMonth);

     //Year dropdown list
     String randomYear = Integer.toString(random.nextInt(1912,2022));
     Select seletyear = new Select(reg.yearlist());
     seletyear.selectByValue(randomYear);
    }


     @And("user enter email {string} field")
     public void userEnterEmailField(String arg0) {
     reg.emial().sendKeys(arg0);
    }

 @And("user fills Password fields {string}")
 public void userFillsPasswordFieldsConfirm_PSswrd(String arg0){
  reg.password().sendKeys(arg0);
  reg.confirm_password().sendKeys(arg0);
    }


    @And("user fills Password fields P@ssword P@sswrd")
    public void userFillsPasswordFieldsPSswordPSswrd() {

    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {

     reg.register_btn().click();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() {

     SoftAssert soft = new SoftAssert();
     //Message
     String actual_msg = reg.msg().getText();
     String expected_msg = "Your registration completed";
     soft.assertTrue(actual_msg.contains(expected_msg));
     //Message color
     String actual_color = reg.msg().getCssValue("color");
     String expected_color = "#4cb17c";
     String actual_color_hex = Color.fromString(actual_color).asHex();
     soft.assertEquals(expected_color,actual_color_hex);

     //Continue Button
     boolean cnt_btn;
     try {
      cnt_btn =reg.continue_btn().isDisplayed();
     }catch (Exception e){
      cnt_btn = false;
     }
      soft.assertTrue(cnt_btn);

     soft.assertAll();
    }

 }
