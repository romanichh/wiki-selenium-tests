package com.telran.wiki.tests;

import com.telran.wiki.model.Article;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchArticleTests extends TestBase {

    @Test
    public void testSearchArticle() {
        app.getArticle().searchArticleFromMainPage(new Article().withArticleName("Java"));
        String articleTitle = app.getArticle().getArticleName();
        Assert.assertEquals(articleTitle, "Java");
    }
}
