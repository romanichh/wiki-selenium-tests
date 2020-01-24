package com.telran.wiki.model;

public class Article {
    private String articleName;

    public String getArticleName() {
        return articleName;
    }

    public Article withArticleName(String articleName) {
        this.articleName = articleName;
        return this;
    }
}
