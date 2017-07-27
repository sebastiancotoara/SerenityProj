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

    @FindBy(css = ".level0.parent")
    private WebElement catMenu;

    @FindBy(css = "#nav li.level0")
    private List<WebElement> categoryMenuItems;

    @FindBy(css = "#nav li.level0>li.level1 a")
    private List<WebElement> subcategoryMenu;

    @FindBy(css = "a.level1")
    private WebElement categName;

    public void navigateToRandomCategoryPage() {
        Random random = new Random();
        System.out.println(categoryMenuItems.size());
        int randomProdMenu = random.nextInt(categoryMenuItems.size() - 1);

        System.out.println(categoryMenuItems.get(randomProdMenu).getText() + " " + randomProdMenu);

        Actions builder = new Actions(getDriver());
        Actions hoverOverLocationSelector = builder.moveToElement(catMenu);
        hoverOverLocationSelector.perform();

//        waitFor(categName.getText());



        if (randomProdMenu > 4) {
            categoryMenuItems.get(randomProdMenu).click();
            System.out.println("5");
        } else {
            subcategoryMenu.remove(0);
            System.out.println(subcategoryMenu.size());
            int randomSubcategory = random.nextInt(subcategoryMenu.size()-1);
            System.out.println("submenu: " + subcategoryMenu.get(randomSubcategory).getText() + randomSubcategory);
            Actions action = new Actions(getDriver());
            action.moveToElement(categoryMenuItems.get(randomProdMenu)).moveToElement(subcategoryMenu.get(randomSubcategory));
        }

    }
}
