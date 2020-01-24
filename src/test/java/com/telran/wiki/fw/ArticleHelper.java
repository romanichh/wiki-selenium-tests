package com.telran.wiki.fw;

import com.telran.wiki.model.Article;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ArticleHelper extends HelperBase {
    public ArticleHelper(WebDriver wd) {
        super(wd);
    }

    public void searchArticleFromMainPage(Article article) {
        type(By.id("searchInput"), article.getArticleName());
        click(By.cssSelector(".pure-button.pure-button-primary-progressive"));
    }

    public String getArticleName() {
        return wd.findElement(By.cssSelector("h1")).getText();
    }
}
