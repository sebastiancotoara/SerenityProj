package com.emag.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductViewPage extends PageObject {

    @FindBy(css="div.product-highlight.product-page-actions button")
    private WebElement addToCartButton;

    public void clickOnAddToCartButton() {
        addToCartButton.click();
    }

    public String getProductTitle() {
        return getDriver().findElement(By.cssSelector(".page-title")).getText();
    }

    public void clickOnShowCartDetails() {
        getDriver().findElement(By.cssSelector(".btn")).submit();
    }
}
