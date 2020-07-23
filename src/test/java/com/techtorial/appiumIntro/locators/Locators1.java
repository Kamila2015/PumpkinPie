package com.techtorial.appiumIntro.locators;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Locators1 {

    AndroidDriver <AndroidElement> driver;

    @Before
    public void setup() throws MalformedURLException {

        File apkFile = new File("src/test/resources/AppiumPractice.apk");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName","MyPhone");
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("newCommandTime", 600);
        desiredCapabilities.setCapability("automationName","uiautomator2");
        desiredCapabilities.setCapability("app", apkFile.getAbsolutePath());

        URL serverUrl = new URL("http:localhost:4723/wd/hub");
        driver = new AndroidDriver(serverUrl, desiredCapabilities);


    }

    @Test
    public void loc1(){

         //className [@attribute=‘value’] -> xpath in appium

        AndroidElement views = driver.findElement(By.xpath("//android.widget.TextView[@text='Views']"));
        views.click();

    }

    @Test
    public void log2(){

        AndroidElement views = driver.findElement(By.id("android:id/text1"));
        views.click();

    }
    @Test
    public void log3(){

        AndroidElement app = driver.findElementByAccessibilityId("App");
        app.click();

    }

    @Test

    public void loc4(){
       // content-> storage-> external storage -> delete buton is disabled
        AndroidElement content = driver.findElementByAndroidUIAutomator("text(\"Content\")");
        content.click();

        AndroidElement storage = driver.findElementByAccessibilityId("Storage");
        storage.click();

        AndroidElement externalStorage = driver.findElementById("android:id/text1");
        externalStorage.click();

        AndroidElement deleteButton = driver.findElement(By.xpath("//android.widget.Button[@resource-id='io.appium.android.apis:id/delete']"));
        System.out.println( deleteButton.isEnabled ());

    }


}
