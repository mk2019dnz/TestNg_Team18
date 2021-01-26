package com.tests;

import com.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Wait_Test {

    @Test
    public void implicitlyWait(){
        // implicitlywait() metodunu driver classinda tanimladigimiz icin tekrar tanimlama yapmadik

        Driver.getDriver().get("http://the-internet.herokuapp.com/dynamic_controls");
        WebElement removeButton = Driver.getDriver().findElement(By.xpath("//*[.='Remove']"));
        removeButton.click();
        WebElement addButton = Driver.getDriver().findElement(By.xpath("//*[.='Add']"));
        Assert.assertTrue(addButton.isDisplayed());



    }

    @Test
    public void explicitWait(){
        Driver.getDriver().get("http://the-internet.herokuapp.com/dynamic_controls");
        WebElement enableButton = Driver.getDriver().findElement(By.xpath("//*[.='Enable']"));
        enableButton.click();

        WebDriverWait wait =new WebDriverWait(Driver.getDriver(),15);

        WebElement mesaj = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        System.out.println(mesaj.getText());

    }




}
