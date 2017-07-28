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

    @Step
    public void filterProductsByColor(){
        productsPage.filterProductsByColor();
    }

    @Step
    public void filterProductsByOccasion(){
        productsPage.filterProductsByOccasion();
    }

    @Step
    public void filterProductsBySize(){
        productsPage.filterProductsBySize();
    }

    @Step
    public void filterProductsByFit(){
        productsPage.filterProductsByFit();
    }

    @Step
    public void filterProductsByType(){
        productsPage.filterProductsByType();
    }

    @Step
    public void filterProductsByGender(){
        productsPage.filterProductsByGender();
    }
}
