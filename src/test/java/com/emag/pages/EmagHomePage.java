package com.emag.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://www.emag.ro")
public class EmagHomePage extends PageObject {

    @FindBy(css = "#emg-input-autosuggest")
    private WebElement searchInput;

    @FindBy(css = "[class~=emag-fluid-search-btn]")
    private WebElement searchButton;

    public void inputSearchTerm(String keyword) {
        searchInput.sendKeys(keyword);
        searchButton.click();
    }
}
