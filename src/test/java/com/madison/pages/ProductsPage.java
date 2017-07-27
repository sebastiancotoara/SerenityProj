package com.madison.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;

public class ProductsPage extends PageObject {

    @FindBy(css = ".price:first-child")
    private List<WebElement> prices;

    public void filterProductsByPrice() {
        Random random = new Random();
            int randomPrice = random.nextInt(prices.size() - 1);
        System.out.println(randomPrice);
            System.out.println(prices.get(randomPrice).getText());
            prices.get(randomPrice).click();
            waitFor(10000);
    }

    public void filterProductsByColor(){

    }
}
