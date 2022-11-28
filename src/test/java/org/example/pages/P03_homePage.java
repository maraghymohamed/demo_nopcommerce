package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.example.stepdef.Hooks.driver;
public class P03_homePage {

    public List<WebElement> slider_elements(){
        return driver.findElements(By.cssSelector("[class=\"nivoSlider\"]>a"));
    // div[class="nivo-controlNav"]>a
    }
    public WebElement wishlist_page_quantity(){
        return driver.findElement(By.className("qty-input"));
    }
    public WebElement wishlist_icon(){
        return driver.findElement(By.className("ico-wishlist"));

    }
    public WebElement Bar_Notification(){
        return driver.findElement(By.className("bar-notification"));

    }

    public WebElement HTC_ONE_add_to_wishlist_btn(){
        return driver.findElement(By.cssSelector("div[data-productid=\"18\"]>div>div>div[class=\"buttons\"]>button[title=\"Add to wishlist\"]"));

    }

    public  WebElement facebook(){
        return driver.findElement(By.cssSelector("li[class=\"facebook\"]"));
    }
    public WebElement twitter(){
        return driver.findElement(By.cssSelector("li[class=\"twitter\"]"));
    }
    public WebElement rss(){
        return driver.findElement(By.cssSelector("li[class=\"rss\"]"));
    }
    public WebElement youtube(){

        return driver.findElement(By.cssSelector("li[class=\"youtube\"]"));
    }
    public WebElement page_title(){
        return driver.findElement(By.className("page-title"));

    }

    public List<WebElement> subMenu(){
        String css = "ul[class=\"top-menu notmobile\"]>li>ul[class=\"sublist first-level\"]>li>a";
        return driver.findElements(By.cssSelector(css));
    }

    public List<WebElement>  topmenu (){
        return driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a"));

    }

    public WebElement product_Name(){
        return driver.findElement(By.className("product-name"));

    }

    public WebElement search_box(){
        return driver.findElement(By.id("small-searchterms"));

    }
    public List<WebElement> search_result(){
        return driver.findElements(By.cssSelector("div[class=\"item-box\"]"));


    }
    public WebElement search_btn(){
        return driver.findElement(By.className("search-box-button"));
    }
    public WebElement currency(){
        return  driver.findElement(By.id("customerCurrency"));
    }
    public List<WebElement> price_list(){
        return driver.findElements(By.cssSelector("span[class =\"price actual-price\"]"));
    }
}
