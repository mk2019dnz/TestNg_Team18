package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPagesTestBase {

    WebDriver driver;   // TestBase classi kullanilacak ise page classi bu sekilde tanimlanir
    public AmazonPagesTestBase (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy (id = "twotabsearchtextbox")
    public WebElement amazonSearchBox;


}
