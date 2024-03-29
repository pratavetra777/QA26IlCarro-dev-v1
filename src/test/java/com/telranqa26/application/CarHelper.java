package com.telranqa26.application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CarHelper extends HelperBase{
    public CarHelper(WebDriver wd) {
        super(wd);
    }
    //let the cat work on header
    public void initAddingNewCar(){
        click(By.cssSelector("header [href='/car']"));

    }

    public boolean isCarCreationFormPresent() {
        return isElementPresent(By.xpath("//h3[contains(., 'Let the car work')]"));
    }

    public void fillCarForm (String contry, String address, String distance, String serial_number, String brand, String model, String year, String engine, String fuel_consumption, String fuel, String transmition, String wD, String horsepower, String torque, String doors, String seats, String clasS, String about, String feature, String price){
        //WebElement element= wd.findElement(By.cssSelector("[name='about']"));

        type(By.cssSelector(".country"), contry);
        type(By.cssSelector(".address"), address);
        type(By.cssSelector(".distance_included"), distance);
        type(By.cssSelector(".serial_number"), serial_number);
        type(By.cssSelector(".brand"), brand);
        type(By.cssSelector(".model"), model);
        type(By.cssSelector(".year"), year);
        type(By.cssSelector(".engine"), engine);
        type(By.cssSelector(".fuel_consumption"), fuel_consumption);
        type(By.cssSelector(".fuel"), fuel);
        type(By.cssSelector(".transmition"), transmition);
        type(By.cssSelector(".wd"), wD);
        type(By.cssSelector(".horsepower"), horsepower);
        type(By.cssSelector(".torque"), torque);
        type(By.cssSelector(".doors"), doors);
        type(By.cssSelector(".seats"), seats);
        type(By.cssSelector(".class"), clasS);
        type(By.cssSelector("[name='about']"), about);
        //typeByElement(element,about);
        type(By.cssSelector(".type_feature"), feature);
        type(By.cssSelector(".price"), price);


    }



}
