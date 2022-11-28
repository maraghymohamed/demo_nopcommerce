package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.example.stepdef.Hooks.driver;
public class P01_register {
   public List<WebElement> gender (){
       List<WebElement> gender = driver.findElements(By.cssSelector("div[id=\"gender\"]>span>input"));
       return gender;
    }
    public WebElement register_page_btn (){
        WebElement registerbtn = driver.findElement(By.className("ico-register"));
        return registerbtn;
    }
    public WebElement firstName(){
       WebElement firstName = driver.findElement(By.id("FirstName"));
       return firstName;
    }
    public WebElement lastName(){
       WebElement lastName = driver.findElement(By.id("LastName"));
       return lastName;

    }
    public WebElement daylist(){
       WebElement daylist = driver.findElement(By.name("DateOfBirthDay"));
        return daylist;
    }
    public WebElement monthlist(){
        WebElement monthlist = driver.findElement(By.name("DateOfBirthMonth"));
        return monthlist;
    }
    public WebElement yearlist(){
        WebElement yearList = driver.findElement(By.name("DateOfBirthYear"));
        return yearList;
    }
    public WebElement emial(){
       WebElement email = driver.findElement(By.id("Email"));
       return email;
    }
    public WebElement password(){
       WebElement password = driver.findElement(By.id("Password"));
       return password;
    }
    public WebElement confirm_password(){
       WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
       return confirmPassword;
    }
    public WebElement register_btn(){
       WebElement regBtn = driver.findElement(By.id("register-button"));
       return regBtn;
    }
    public WebElement msg(){
       return driver.findElement(By.className("result"));
    }
    public WebElement continue_btn(){

       return driver.findElement(By.cssSelector("a[class=\"button-1 register-continue-button\"]"));
    }

    /*public P01_register(){
        PageFactory.initElements(driver,this);

    }
    @FindBy(className = "ico-register")
    public  WebElement registerbtn;
   /*
    @FindBy(css = "div[id=\"gender\"]>span>input")
    public List<WebElement> gender;
*/
}
