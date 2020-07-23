package com.techtorial.appiumIntro.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class StoragePage {
    public StoragePage( AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        // "this"-> means instance of the class
    }

//android:id/text1 --> id

    @AndroidFindBy(id = "android:id/text1")
    public AndroidDriver externalStorage;


    @AndroidFindBy(xpath ="//android.widget.Button[@resource-id='io.appium.android.apis:id/delete")
    public AndroidElement deleteButton;
}
