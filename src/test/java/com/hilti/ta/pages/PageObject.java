package com.hilti.ta.pages;

import com.hilti.ta.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public abstract class PageObject {

    protected boolean isElementVisible(final By locator) {
        try {
            final WebElement consentBanner = WebDriverFactory.getWebDriverWait(2).until(ExpectedConditions.presenceOfElementLocated(locator));
            return consentBanner.isDisplayed();
        } catch (final TimeoutException e) {
            // Element not found
            return false;
        }
    }


}
