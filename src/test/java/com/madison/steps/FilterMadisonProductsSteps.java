package com.madison.steps;

import com.madison.pages.MadisonHomePage;
import com.madison.pages.ProductsPage;
import net.thucydides.core.annotations.Step;

public class FilterMadisonProductsSteps {
    private MadisonHomePage madisonHomePage;
    private ProductsPage productsPage;

    @Step
    public void navigateToMadisonHomePage() {
        madisonHomePage.open();
    }

    @Step
    public void navigateToRandomCategoryPage() {
        madisonHomePage.navigateToRandomCategoryPage();
    }

    @Step
    public void filterProductsByPrice(){
        productsPage.filterProductsByPrice();
    }
}
