package com.tests;

import com.pages.JSalertPages;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import org.testng.annotations.Test;

public class Alert_Test {

    JSalertPages jSalertPages = new JSalertPages();


    @Test
    public void Test01() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("JSalert"));
        jSalertPages.simpleAlert.click();
        Thread.sleep(5000);
        System.out.println(Driver.getDriver().switchTo().alert().getText());
        Thread.sleep(5000);
        Driver.getDriver().switchTo().alert().accept();


    }

    @Test
    public void Test02() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("JSalert"));
        jSalertPages.promptAlert.click();
        Thread.sleep(5000);
        String mesaj = Driver.getDriver().switchTo().alert().getText();
        System.out.println(mesaj);
        Driver.getDriver().switchTo().alert().sendKeys("selam");
        Thread.sleep(5000);
        Driver.getDriver().switchTo().alert().accept();

    }



}
