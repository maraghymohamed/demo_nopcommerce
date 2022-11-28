package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepdef.Hooks.driver;

public class P02_login {

    public WebElement login_page_btn(){
        return driver.findElement(By.className("ico-login"));

    }
    public WebElement login_btn(){
        return driver.findElement(By.className("login-button"));
    }

    public WebElement email(){
        return driver.findElement(By.id("Email"));
    }
    public WebElement password(){
        return driver.findElement(By.id("Password"));
    }
    public WebElement error_msg(){
        return driver.findElement(By.className("validation-summary-errors"));
    }
    public WebElement MyAccount(){
        return driver.findElement(By.className("ico-account"));
    }
}
