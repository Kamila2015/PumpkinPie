package com.techtorial.appiumIntro.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class MainPage {


   public MainPage( AndroidDriver driver) {
       PageFactory.initElements(new AppiumFieldDecorator(driver), this);
       // "this"-> means instance of the class
   }

   public static MainPage getMainPage(AndroidDriver driver){
  return new MainPage(driver);
 }

   @AndroidFindBy(xpath ="//android.widget.TextView[@resource-id ='android:id/text1']")
    public AndroidElement accessibility;


    @AndroidFindBy(xpath ="//android.widget.TextView[@text='Animation']")
    public AndroidElement animation ;

    @AndroidFindBy(xpath ="//android.widget.TextView[@text='App']")
    public AndroidElement app ;

    @AndroidFindBy(xpath ="//android.widget.TextView[@text='Content']")
    public AndroidElement content ;

    @AndroidFindBy(xpath ="//android.widget.TextView[@text='Graphics']")
    public AndroidElement  graphics ;

    @AndroidFindBy(xpath ="//android.widget.TextView[@text='Media']")
    public AndroidElement   media ;

    @AndroidFindBy(xpath ="//android.widget.TextView[@text='NFC']")
    public AndroidElement nfc ;

    @AndroidFindBy(xpath ="//android.widget.TextView[@text='OS']")
    public AndroidElement os ;

    @AndroidFindBy(xpath ="//android.widget.TextView[@text='Preference']")
    public AndroidElement  preference ;

    @AndroidFindBy(xpath ="//android.widget.TextView[@text='Text']")
    public AndroidElement text ;

    @AndroidFindBy(xpath ="//android.widget.TextView[@text='Views']")
    public AndroidElement view ;








}
