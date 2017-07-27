package com.madison.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;

@DefaultUrl("http://qa3.madison.com/")
public class MadisonHomePage extends PageObject {



    @FindBy(css = "#nav li.level0")
    private List<WebElement> categoryMenuItems;

    @FindBy(css = "#nav ol [class$=\"active\"] .level0 li .level1")
    private List<WebElement> subcategoryMenu;

    public void navigateToRandomCategoryPage() {
        Random random = new Random();
        Actions builder = new Actions(getDriver());

        int randomProdMenu = random.nextInt(categoryMenuItems.size() - 1);
        Actions hoverOverProductsMenu = builder.moveToElement(categoryMenuItems.get(randomProdMenu));
        hoverOverProductsMenu.perform();
        waitFor(10000);

        if (randomProdMenu < 5) {
            int randomSubcategory = random.nextInt((subcategoryMenu.size() - 1 + 1) + 1);
            Actions hoverOverSubCateg = builder.moveToElement(subcategoryMenu.get(randomSubcategory));
            hoverOverSubCateg.perform();
            waitFor(10000);
            subcategoryMenu.get(randomSubcategory).click();
        } else {
            categoryMenuItems.get(randomProdMenu).click();
            System.out.println("5");
        }
    }
}
