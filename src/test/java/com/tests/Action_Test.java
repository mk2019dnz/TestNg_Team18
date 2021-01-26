package com.tests;

import com.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action_Test extends TestBase {


    @Test
    public void Test01() {
        //  sag tiklama ==> contextClick(element)
        //  cift tiklama ==> doubleClick(element)
        //  mouse webelementin uzerine goturme ==> moveToElement(element)
        //  asagi yukari ==>  sendKeys(Keys.PAGE_DOWN) ,sendKeys(Keys.PAGE_UP)
        //  daha asagi ve daha yukari ==>  sendKeys(Keys.END) , sendKeys(Keys.ARROW_UP)
        //  surukle birak  ==> dragAndDrop(element,element)
        //  buyuk kucuk yazma ==> keyDown(Keys.SHIFT)  ,  keyUp(Keys.SHIFT)

        driver.get("https://the-internet.herokuapp.com/context_menu");
        Actions actions = new Actions(driver);
        WebElement clicktextMenu = driver.findElement(By.id("hot-spot"));
        actions.contextClick(clicktextMenu).perform();
        driver.switchTo().alert().accept();

    }


}
