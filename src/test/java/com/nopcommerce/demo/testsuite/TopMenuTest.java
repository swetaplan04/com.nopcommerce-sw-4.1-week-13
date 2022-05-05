package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {

    HomePage homePage = new HomePage();

    @Test
    public void verifyPageNavigationToComputersPageAndVerifyText(){
        homePage.selectMenu("Computers");
        String actualMessage = homePage.getTextFromComputers();
        Assert.assertEquals(actualMessage,"Computers", "Error message");
    }

    @Test
    public void verifyPageNavigationToElectronicsPageAndVerifyText(){
        homePage.selectMenu("Electronics");
        String actualMessage = homePage.getTextFromElectronics();
        Assert.assertEquals(actualMessage,"Electronics", "Error message");
    }

    @Test
    public void verifyPageNavigationToApparelPageAndVerifyText(){
        homePage.selectMenu("Apparel");
        String actualMessage = homePage.getTextFromApparel();
        Assert.assertEquals(actualMessage,"Apparel", "Error message");
    }

    @Test
    public void verifyPageNavigationToDigitalDownloadsPageAndVerifyText(){
        homePage.selectMenu("Digital downloads");
        String actualMessage = homePage.getTextFromDigitalDownloads();
        Assert.assertEquals(actualMessage,"Digital downloads", "Error message");
    }

    @Test
    public void verifyPageNavigationToBooksPageAndVerifyText(){
        homePage.selectMenu("Books");
        String actualMessage = homePage.getTextFromBooks();
        Assert.assertEquals(actualMessage,"Books", "Error message");
    }

    @Test
    public void verifyPageNavigationToJewelryPageAndVerifyText(){
        homePage.selectMenu("Jewelry");
        String actualMessage = homePage.getTextFromJewelry();
        Assert.assertEquals(actualMessage,"Jewelry", "Error message");
    }

    @Test
    public void verifyPageNavigationToGiftCardsPageAndVerifyText(){
        homePage.selectMenu("Gift Cards");
        String actualMessage = homePage.getTextFromGiftCards();
        Assert.assertEquals(actualMessage,"Gift Cards", "Error message");
    }
}



