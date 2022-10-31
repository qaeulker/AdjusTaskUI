package com.adjust.step_definitions;

import com.adjust.pages.HomePage;
import com.adjust.utilities.BrowserUtils;
import com.adjust.utilities.ConfigurationReader;
import com.adjust.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AdjustStepDefs {

    HomePage homePage = new HomePage();

    @When("user navigates to {string} page")
    public void userNavigatesToPage(String url) {

        Driver.get().get(ConfigurationReader.get("url"));

    }


    @Then("verify that the page title is {string}")
    public void verifyThatThePageTitleIs(String pageTitle) {
        String actualPageTitle = Driver.get().getTitle();
        String expectedPageTitle = pageTitle;

        Assert.assertEquals(expectedPageTitle, actualPageTitle);



    }

    @When("user searches for {string}")
    public void userSearchesFor(String item) {

        BrowserUtils.waitFor(5);
        homePage.SearchBox.click();

        homePage.SearchBox.sendKeys("Google");
        BrowserUtils.waitFor(2);
        homePage.SearchButton.click();
    }


    @Then("verify that user sees the results for {string}")
    public void verifyThatUserSeesTheResultsFor(String item) {


        String actualPageTitle = Driver.get().getTitle();
        String expectedPageTitle = item;

        Assert.assertTrue(actualPageTitle.contains(item));


    }


    @When("user write {string} in searchbox")
    public void userWriteInSearchbox(String item) {

        BrowserUtils.waitFor(5);
        homePage.SearchBox.click();

        homePage.SearchBox.sendKeys("Google");
        BrowserUtils.waitFor(2);

    }

    @And("user clicks {string}")
    public void userClicks(String item) {
        homePage.Click(item);

    }

    @When("user writes {string} in These Words Box")
    public void userWritesInTheseWordsBox(String item) {

        homePage.TheseWordsBox.sendKeys("news");
    }

    @And("user clicks search button")
    public void userClicksSearchButton() {
        homePage.SearchButton.click();
    }





}
