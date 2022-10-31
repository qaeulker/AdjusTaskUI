package com.adjust.pages;

import com.adjust.utilities.BrowserUtils;
import com.adjust.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    HomePage homePage = new HomePage();

    @FindBy(xpath = "(//input[contains(@title,'Search Wikipedia')])[1]")
    public WebElement SearchBox;

    @FindBy(xpath = "//span[text()='Search']")
    public WebElement SearchButton;

    @FindBy(xpath = "//a[contains(@aria-controls,'mw-advancedSearch-expandable-options')]")
    public WebElement FilterAdvancedSearch;

    @FindBy(xpath = "//div[contains(@class,'oo-ui-widget oo-ui-widget-enabled mw-advancedSearch-namespacesPreview')]")
    public WebElement FilterSearchIn;

    @FindBy(xpath = "//input[@id='ooui-33']")
    public WebElement TheseWordsBox;

    @FindBy(xpath = "//input[@value='all']")
    public WebElement AllCheckBox;




    public void Click(String item) {


        BrowserUtils.waitFor(5);
        WebElement myButton;
        switch (item) {

            case "Advanced search": {
                myButton = homePage.FilterAdvancedSearch;
                myButton.click();
                break;
            }
            case "Search in": {
                myButton = homePage.FilterSearchIn;
                myButton.click();
                break;
            }

            case "These Words Box": {
                myButton = homePage.TheseWordsBox;
                myButton.click();
                break;
            }
            case "All checkBox": {
                myButton = homePage.AllCheckBox;
                myButton.click();
                break;
            }

        }


    }
}
