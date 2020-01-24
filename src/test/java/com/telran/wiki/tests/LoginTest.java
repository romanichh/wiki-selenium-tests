package com.telran.wiki.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test(enabled = true)
    public void testLoginNegative() throws InterruptedException {
        app.getSession().selectLanguage();
        app.getSession().clickLoginLink();
        app.getSession().pause(5000);
        app.getSession().fillLoginForm("dd", "fsdf");
        Assert.assertTrue(app.getSession().isElementPresent(By.cssSelector(".errorbox")));
    }

    @Test(enabled = true)
    public void testLoginPositive() throws InterruptedException {
        app.getSession().pause(5000);
        app.getSession().clear(By.id("wpName1"));
        app.getSession().fillLoginForm("Romanich87", "romaroma87");
        app.getSession().pause(3000);
        Assert.assertTrue(app.getSession().isElementPresent(By.cssSelector("[title='Wikipedia']")));
        app.getSession().pause(3000);
    }
}
