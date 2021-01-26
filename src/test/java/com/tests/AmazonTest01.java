package com.tests;

import com.pages.AmazonPagesTestBase;
import com.utilities.TestBase;
import org.testng.annotations.Test;


public class AmazonTest01 extends TestBase {



    @Test (dependsOnMethods = "Test02")
    public void Test01(){

     driver.get("http://amazon.com");
     AmazonPagesTestBase amazonPagesTestBase = new AmazonPagesTestBase(driver);
     amazonPagesTestBase.amazonSearchBox.sendKeys("computer");

    }

    @Test
    public void Test02(){
        driver.get("http://google.com");
    }

    @Test (priority = 1)
    public void Test03(){
        driver.get("http://ebay.com");
    }


}
