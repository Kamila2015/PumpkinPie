package com.techtorial.appiumIntro.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class ViewsPage {

    private ViewsPage (AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    public static ViewsPage getViewPage(AndroidDriver driver){
        return  new ViewsPage(driver);
    }

    @AndroidFindBy(uiAutomator = "text(\"People Names\"")
        public AndroidElement peopleNames;


    }

