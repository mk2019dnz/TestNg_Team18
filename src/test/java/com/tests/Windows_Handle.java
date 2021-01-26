package com.tests;

import com.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Set;

public class Windows_Handle extends TestBase {


    @Test
    public void Test01(){

        driver.get("https://the-internet.herokuapp.com/windows");
        String windowHandle = driver.getWindowHandle();
        System.out.println(windowHandle);

        // bulunulan pencerenin handle'ni alir.

        driver.findElement(By.partialLinkText("Click")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // acik olan tum pencerelerin handle'ni alir.

        Set<String> allWindowHandle = driver.getWindowHandles();

        for (String handles : allWindowHandle){
            System.out.println(handles);
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("=============================================");

        Object [] arr = allWindowHandle.toArray();
        String ikinciSayfa = arr[arr.length-1].toString();
        System.out.println(ikinciSayfa);

        driver.switchTo().window(ikinciSayfa);


    }

}
