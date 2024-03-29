package com.telranqa26.application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    public ApplicationManager() {
        System.out.println("Appconstructor");
    }

    WebDriver wd;
    UserHelper userHelper;
    CarHelper carHelper;

    public CarHelper getCarHelper() {
        return carHelper;
    }

    public UserHelper getUserHelper() {
        return userHelper;
    }

    public void start() {

        wd=new ChromeDriver();
        wd.navigate().to("https://ilcarro-dev-v1.firebaseapp.com/");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        userHelper = new UserHelper(wd);
        carHelper=new CarHelper(wd);

    }

    public void stop() {
        wd.quit();
    }
}
