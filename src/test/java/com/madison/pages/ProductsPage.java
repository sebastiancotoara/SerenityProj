package com.madison.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;

public class ProductsPage extends PageObject {

    Random random = new Random();

    @FindBy(css = ".price:first-child")
    private List<WebElement> prices;

    @FindBy(css = "")
    private List<WebElement> colors;

    @FindBy(css = "")
    private List<WebElement> ocassions;

    @FindBy(css = "")
    private List<WebElement> sizes;

    @FindBy(css = "")
    private List<WebElement> fits;

    @FindBy(css = "")
    private List<WebElement> types;

    @FindBy(css = "")
    private List<WebElement> genders;

    public void filterProductsByPrice() {
        int randomPrice = random.nextInt(prices.size() - 1);
        System.out.println(randomPrice);
        System.out.println(prices.get(randomPrice).getText());
        prices.get(randomPrice).click();
        waitFor(10000);
    }

    public void filterProductsByColor() {
        int randomColor = random.nextInt(colors.size() - 1);
        System.out.println(randomColor);
        System.out.println(colors.get(randomColor).getText());
        colors.get(randomColor).click();
        waitFor(10000);
    }

    public void filterProductsByOccasion() {
        int randomOccasion = random.nextInt(ocassions.size() - 1);
        System.out.println(randomOccasion);
        System.out.println(ocassions.get(randomOccasion).getText());
        ocassions.get(randomOccasion).click();
        waitFor(10000);
    }

    public void filterProductsBySize() {
        int randomSize = random.nextInt(sizes.size() - 1);
        System.out.println(randomSize);
        System.out.println(sizes.get(randomSize).getText());
        sizes.get(randomSize).click();
        waitFor(10000);
    }

    public void filterProductsByFit() {
        int randomFit = random.nextInt(fits.size() - 1);
        System.out.println(randomFit);
        System.out.println(fits.get(randomFit).getText());
        fits.get(randomFit).click();
        waitFor(10000);
    }

    public void filterProductsByType() {
        int randomType = random.nextInt(types.size() - 1);
        System.out.println(randomType);
        System.out.println(types.get(randomType).getText());
        types.get(randomType).click();
        waitFor(10000);
    }

    public void filterProductsByGender() {
        int randomGender = random.nextInt(genders.size() - 1);
        System.out.println(randomGender);
        System.out.println(genders.get(randomGender).getText());
        genders.get(randomGender).click();
        waitFor(10000);
    }
}
