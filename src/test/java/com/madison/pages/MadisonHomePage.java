package com.madison.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.List;
import java.util.Random;

@DefaultUrl("http://qa3.madison.com/")
public class MadisonHomePage extends PageObject {

    @FindBy(css = ".level0")
    private List<WebElement> categoryMenuItems;

    public void navigateToRandomCategoryPage() {
        Random random = new Random();
        String categories = Integer.parseInt(categoryMenuItems.get(categoryMenuItems.size()-1));
        Actions action = new Actions(getDriver());
        action.moveToElement();
        System.out.println("cucubau");
    }
}
