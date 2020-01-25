package com.telran.wiki.tests;

import com.telran.wiki.model.Article;
import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviders {


    @DataProvider
    public Iterator<Object[]> articleList() throws IOException {
        List<Object[]> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/ArticlePositiveCsv.csv")));
        String line = reader.readLine();
        while (line != null) {
            String[] split = line.split(",");
            list.add(new Object[]{new Article().withArticleName(split[0])});
            line = reader.readLine();
        }
        return list.iterator();
    }
}
