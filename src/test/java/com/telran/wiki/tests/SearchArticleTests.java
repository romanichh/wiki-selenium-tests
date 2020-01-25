package com.telran.wiki.tests;

import com.telran.wiki.model.Article;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchArticleTests extends TestBase {


    @Test(dataProvider = "articleList", dataProviderClass = DataProviders.class)
    public void testSearchArticle(Article article) {
        app.getArticle().searchArticleFromMainPage(article);
        String articleTitle = app.getArticle().getArticleName();
        Assert.assertEquals(articleTitle, "Java");
    }
}
