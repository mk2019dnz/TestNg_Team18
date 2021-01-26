package com.tests;

import com.pages.AmazonPagesTestBase;
import com.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class AmazonTest02 extends TestBase {



    
    @Test
    public void Test01() throws InterruptedException {
        driver.get("http://amazon.com");
        AmazonPagesTestBase amazonPagesTestBase = new AmazonPagesTestBase(driver);
        amazonPagesTestBase.amazonSearchBox.sendKeys("computer"+Keys.ENTER);

        Thread.sleep(2000);

        WebElement resultWebelement = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]"));
        String result = resultWebelement.getText();
        
        SoftAssert softAssert = new SoftAssert();
        System.out.println(result);

        // 1. verification
        boolean verify01 = result.contains("247");
        softAssert.assertTrue(verify01,"True");

        WebElement linkWebelement = driver.findElement(By.xpath("//*[@id=\"n/13896617011\"]/span/a/span"));

        // 2. verification
        softAssert.assertTrue(linkWebelement.isEnabled());

        softAssert.assertAll();





    }

}
