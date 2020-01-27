package com.telran.wiki.tests;

import com.telran.wiki.fw.ApplicationManager;
import com.telran.wiki.utils.Listener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

import java.lang.reflect.Method;
import java.util.Arrays;

@Listeners(Listener.class)

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager();

    Logger logger = LoggerFactory.getLogger(TestBase.class);

    @BeforeMethod
    public void startTestLog(Method m, Object[] parameter) {
        logger.info("Start test " + m.getName() + " with parameters" + Arrays.asList(parameter));
    }

    @AfterMethod
    public void stopTestLog(Method m) {
        logger.info("Stop test " + m);
    }

    @BeforeSuite
    public void setUp() {
        app.init();
    }

    @AfterSuite
    public void tearDown() {
        app.stop();
    }


}