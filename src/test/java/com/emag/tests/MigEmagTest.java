package com.emag.tests;

import java.util.List;
import java.util.Random;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.emag.steps.EmagSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class MigEmagTest {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    public EmagSteps emagSteps;

    @Before
    public void maximPage(){
    driver.manage().window().maximize();
    }

    @Test
    public void emagSearchTest() {
        emagSteps.navigateToHomePage();
        emagSteps.searchTermAndNavigateToRandomSearchPage("ceas");
        emagSteps.clickOnRandomProduct();
        emagSteps.getProductTitleAndClickOnAddToCartButton();
        emagSteps.clickOnShowCartDetails();
        emagSteps.checkByTitleIfProductWasAddedInCart();
    }
}
