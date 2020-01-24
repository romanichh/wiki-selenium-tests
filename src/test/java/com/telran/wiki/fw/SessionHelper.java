package com.telran.wiki.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {
    public SessionHelper(WebDriver wd) {
        super(wd);
    }

    public void fillLoginForm(String user, String pwd) throws InterruptedException {
        //username
        type(By.id("wpName1"), user);
        type(By.id("wpPassword1"), pwd);
        click(By.id("wpLoginAttempt"));
        pause(20000);
    }

    public void confirmLogin() {
        click(By.id("login"));
    }

    public void clickLoginLink() throws InterruptedException {

        click(By.cssSelector("#pt-login"));
    }

    public void login() throws InterruptedException {
        clickLoginLink();
        fillLoginForm("Romanich87", "romaroma87");
    }

    public void selectLanguage() {
        click(By.cssSelector("#js-link-box-en"));
    }

    public void clear(By locator) {
        wd.findElement(locator).clear();
    }
}
