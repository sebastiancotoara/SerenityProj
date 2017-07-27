package com.madison.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;

public class ProductsPage extends PageObject {

    Random random;
    Actions builder;

    @FindBy(css = ".odd li .price")
    private List<WebElement> prices;

    public void filterProductsByPrice() {
        int randomPrice = random.nextInt(prices.size() - 1);
        builder.moveToElement(prices.get(randomPrice));
    }
}
