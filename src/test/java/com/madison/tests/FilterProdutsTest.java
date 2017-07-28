package com.madison.tests;

import com.madison.steps.FilterMadisonProductsSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class FilterProdutsTest {
    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    public FilterMadisonProductsSteps madisonSteps;

    @Before
    public void maximPage() {
        driver.manage().window().maximize();
    }

    @Test
    public void filterMadisonProducts() {
        madisonSteps.navigateToMadisonHomePage();
        madisonSteps.navigateToRandomCategoryPage();
        madisonSteps.filterProductsByPrice();
        madisonSteps.filterProductsByColor();
        madisonSteps.filterProductsByFit();
        madisonSteps.filterProductsByGender();
        madisonSteps.filterProductsByOccasion();
        madisonSteps.filterProductsByType();
        madisonSteps.filterProductsBySize();
    }
}
