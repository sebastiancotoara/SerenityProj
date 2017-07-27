package com.emag.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class SearchResultsListPage extends PageObject {

    @FindBy(css = ".emg-pagination-no")
    public List<WebElement> pages;

    @FindBy(css = ".lazy")
    public List<WebElement> products;

    public void redirectToRandomProductsListPage(String keyword) {
        Random random = new Random();
        int numberOfPages = Integer.parseInt(pages.get(pages.size() - 1).getText());
        System.out.println("Pages: " + numberOfPages);
        int pageNr = random.nextInt(numberOfPages);
        System.out.println("Page: " + pageNr);

        getDriver().get("https://www.emag.ro/search/" + keyword + "/p" + pageNr);
        System.out.println("Done");
    }

    public void clickOnRandomProduct() {
        Random random = new Random();
        int selectedProduct = random.nextInt(products.size()) + 1;
        System.out.println("product number: " + selectedProduct);
        products.get(selectedProduct).click();
    }
}
