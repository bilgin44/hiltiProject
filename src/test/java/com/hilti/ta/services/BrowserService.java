package com.hilti.ta.services;

public class BrowserService {
    public void refreshPage() {
        WebDriverFactory.getDriver().navigate().refresh();
    }
}
