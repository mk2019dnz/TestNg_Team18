package com.tests;

import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import org.testng.annotations.Test;

public class EbayTest01 {

    @Test
    public void Test01(){
        Driver.getDriver().get(ConfigurationReader.getProperty("ebayUrl"));
    }
}
