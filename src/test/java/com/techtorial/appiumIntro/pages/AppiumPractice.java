package com.techtorial.appiumIntro.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumPractice {

    AndroidDriver<AndroidElement> driver;
    MainPage mainPage;
    ContentPage contentPage;
    StoragePage storagePage;


    @Before
    public void setup() throws MalformedURLException {
        File apkFile = new File("src/test/resources/AppiumPractice.apk");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setPlatform(Platform.ANDROID);
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"MyPhone");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, apkFile.getAbsolutePath());
        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 600);

        URL serverUrl = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver<AndroidElement>(serverUrl, desiredCapabilities);
        mainPage = new MainPage(driver);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        contentPage = new ContentPage(driver);
        storagePage = new StoragePage(driver);


    }

    @Test
    public void prac1(){

        mainPage.content.click();
        contentPage.storage.click();
       // storagePage.externalStorage.click();
        storagePage.deleteButton.click();






    }
}
