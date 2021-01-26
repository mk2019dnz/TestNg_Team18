package com.tests;

import com.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileDownloadTest extends TestBase {

    @Test
    public void fileUpload() throws InterruptedException {
        // bilgisayardan websayfasina dosya yukleme
        driver.get("http://the-internet.herokuapp.com/upload");
        WebElement fileChooseButton = driver.findElement(By.id("file-upload"));
        fileChooseButton.sendKeys("C:\\Users\\mk201\\OneDrive\\Desktop\\alfabet.jpg");

        WebElement uploadButton = driver.findElement(By.id("file-submit"));
        uploadButton.click();

        Thread.sleep(5000);

        WebElement verify = driver.findElement(By.tagName("h3"));
        Assert.assertTrue(verify.isDisplayed());
    }



}
