package com.emag.steps;

import com.emag.pages.*;
import com.emag.pages.SearchResultsListPage;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;

import static org.junit.Assert.assertTrue;

public class EmagSteps {
	private EmagHomePage emagHomePage;
	private SearchResultsListPage searchResultsList;
	private ProductViewPage productViewPage;
	private CartPage cartPage;

	@Step
	public void navigateToHomePage() {
		emagHomePage.open();
	}

	@Step
	public void searchTerm(String keyword) {
		emagHomePage.inputSearchTerm(keyword);
	}

	@Step
	public void navigateToRandomSearchPage(String keyword) {
		searchResultsList.redirectToRandomProductsListPage(keyword);
	}

	@StepGroup
	public void searchTermAndNavigateToRandomSearchPage(String keyword) {
		searchTerm(keyword);
		navigateToRandomSearchPage(keyword);
	}

	@Step
	public void clickOnRandomProduct() {
		searchResultsList.clickOnRandomProduct();
	}

	@Step
	public void clickOnAddToCartButton() {
		productViewPage.clickOnAddToCartButton();
	}

	@Step
	public void setSessionProductTitle() {
		Serenity.setSessionVariable("productTitle").to(productViewPage.getProductTitle());
	}

	@StepGroup
	public void getProductTitleAndClickOnAddToCartButton() {
		setSessionProductTitle();
		clickOnAddToCartButton();
	}

	@Step
	public void clickOnShowCartDetails() {
		productViewPage.clickOnShowCartDetails();
	}

	@Step
	public void checkByTitleIfProductWasAddedInCart() {
		assertTrue(cartPage.isProductInCart(Serenity.sessionVariableCalled("productTitle").toString()));
	}
}
