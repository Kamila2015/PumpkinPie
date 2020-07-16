package com.techtorial.appiumIntro;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumIntro1 {



    @Test
    public void intro1(){

        File apkFile = new File("src/test/resources/AppiumPractice.apk");
        //prerequisites  --> our client code

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        // no argument constructor --> you created one but didn`t give parameters(it`s empty)
        //default constructor--> if you don`t have a constructor, compiler provides u one default constructor

        desiredCapabilities.setCapability("deviceName","MyPhone" );
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("automationName", "uiautomator2");
        desiredCapabilities.setCapability("app", apkFile.getAbsolutePath());

      URL url;

          try {

            url = new URL("http://localhost:4723/wd/hub"); // this is my appium server

          } catch (MalformedURLException e) {
            throw new RuntimeException();
        }


        AndroidDriver <AndroidElement> androidDriver = new AndroidDriver(url,desiredCapabilities);
          //in Appium: //className [@attribute=‘value’] —> appium xpath locator any key and value in the list
        AndroidElement accessibility = androidDriver.findElement(By.xpath("//android.widget.TextView[@resource-id ='android:id/text1'] "));
        accessibility.click();
        androidDriver.navigate().back();

        AndroidElement animation = androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Animatio']"));
        animation.click();
        androidDriver.navigate().back();

        AndroidElement app = androidDriver.findElement(By.xpath("//android.widget.TextView[@text='App']"));
        app.click();
        androidDriver.navigate().back();

        AndroidElement content = androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Content']"));
        content.click();
        androidDriver.navigate().back();

        AndroidElement graphics = androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Graphics']"));
        graphics.click();
        androidDriver.navigate().back();

        AndroidElement media = androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Media']"));
        media.click();
        androidDriver.navigate().back();

        AndroidElement nfc = androidDriver.findElement(By.xpath("//android.widget.TextView[@text='NFC']"));
        nfc.click();
        androidDriver.navigate().back();

        AndroidElement os = androidDriver.findElement(By.xpath("//android.widget.TextView[@text='OS']"));
        os.click();
        androidDriver.navigate().back();

        AndroidElement preference = androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Preference']"));
        preference.click();
        androidDriver.navigate().back();


        AndroidElement text = androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Text']"));
        text.click();
        androidDriver.navigate().back();

        AndroidElement views = androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Views']"));
        views.click();
        androidDriver.navigate().back();


     }
}
