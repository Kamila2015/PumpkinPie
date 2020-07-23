package com.techtorial.appiumIntro.gestures;

import com.techtorial.appiumIntro.pages.CommonUtils;
import com.techtorial.appiumIntro.pages.MainPage;
import com.techtorial.appiumIntro.pages.ViewsPage;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;
import java.time.Duration;

public class GestureIntro {

    AndroidDriver <AndroidElement> driver;
    MainPage mainPage;
    ViewsPage viewsPage;

    @Before
    public void setup()throws MalformedURLException {
         driver = CommonUtils.getAndroidDriver();
         mainPage = MainPage.getMainPage(driver);
         viewsPage = ViewsPage.getViewPage(driver);


    }


    @Test
    public void gesture1(){

        //tap
        TouchAction touchAction = new TouchAction(driver);

        touchAction.tap(TapOptions.tapOptions().
                withElement(ElementOption.element(mainPage.app))).perform();


    }

    @Test
    public void get2(){
        TouchAction touchAction = new TouchAction(driver);
        touchAction.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofSeconds(2))
                .withElement(ElementOption.element(viewsPage.peopleNames))).perform();


    }
}
