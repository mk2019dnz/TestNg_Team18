package com.tests;

import com.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Iframe_Test extends TestBase {


    @Test
    public void Test01(){

        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame("mce_0_ifr"); // iframe icine gecis yapar (index ilede gidilebilir)
        WebElement paraf = driver.findElement(By.xpath("//p"));
        System.out.println(paraf.getText());
        paraf.clear();
        paraf.sendKeys("selam");
        driver.switchTo().defaultContent(); // defaultContent() ile ana govdeye gecis yapilir


    }


}
