package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerTest extends TestBase {
    HomePage homepage = new HomePage();
    ComputerPage computerspage = new ComputerPage();
    DesktopPage desktopspage = new DesktopPage();
    BuildYourComputerPage buildyourowncomputerpage = new BuildYourComputerPage();
    ShoppingCart shoppingcart = new ShoppingCart();
    LoginPage loginpage = new LoginPage();
    CheckOutPage checkoutpage = new CheckOutPage();

    @Test
    public void verifyProductArrangeInAscendingOrder(){
        homepage.clickOnComputersLink();
        computerspage.clickOnDesktopCategory();
        desktopspage.clickOnSortByPriceLowToHigh();
        String actualMessage = desktopspage.getPriceLowToHighOptionText();
        Assert.assertEquals(actualMessage,"Price: Low to High","error");
    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        //2.1 Click on Computer Menu.
        homepage.clickOnComputersLink();
        //2.2 Click on Desktop
        computerspage.clickOnDesktopCategory();
        //2.3 Select Sort By position "Name: A to Z"
        desktopspage.clickOnSortByAToZ();
        Thread.sleep(1000);
        //2.4 Click on "Add To Cart"
        desktopspage.clickOnAddToCartButton();
        //2.5 Verify the Text "Build your own computer"
        String actualMessage = buildyourowncomputerpage.getBuildYourOwnComputerText();
        Assert.assertEquals(actualMessage,"Build your own computer","error");
        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        buildyourowncomputerpage.selectProcessor2_2GHzIntelPentiumDualCoreE2200();
        buildyourowncomputerpage.selectRAM8GB();
        buildyourowncomputerpage.selectHDDRadio400GB();
        buildyourowncomputerpage.selectOSRadioVistaPremium();
        Thread.sleep(1000);
        //buildyourowncomputerpage.selectCheckBoxMicrosoftOffice();
        buildyourowncomputerpage.selectCheckBoxTotalCommander();

        // 2.11 Verify the price "$1,475.00"
        String actualPriceMessage = buildyourowncomputerpage.getPriceText();
        Assert.assertEquals(actualPriceMessage,"$1,470.00","error");
        // 2.12 Click on "ADD TO CART" Button
        buildyourowncomputerpage.clickOnAddToCartButton();
        //2.13 Verify the Message "The product has been added to your shopping cart" on Top green bar
        String actualProductAddedToCartMessage = buildyourowncomputerpage.getProductAddedToShoppingCart();
        Assert.assertEquals(actualProductAddedToCartMessage,"The product has been added to your shopping cart","error");
        // After that close the bar clicking on the cross button
        buildyourowncomputerpage.closeTheBarByClickingOnTheCrossButton();
        // 2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        buildyourowncomputerpage.mouseHoverOnShoppingCartButton();
        buildyourowncomputerpage.clickOnGoToCartButton();
        // 2.15 Verify the message "Shopping cart"
        String actualShoppingCartMessage = shoppingcart.getShoppingCartText();
        Assert.assertEquals(actualShoppingCartMessage,"Shopping cart","error");
        Thread.sleep(2000);
        //2.16 Change the Qty to "2" and Click on "Update shopping cart"
        shoppingcart.changeQuantity();
        shoppingcart.clickOnUpdateCartButton();
        //2.17 Verify the Total"$2,950.00
        String actualTotalMessage = shoppingcart.getTotalText();
        Assert.assertEquals(actualTotalMessage,"$2,950.00","error");
        // 2.18 click on checkbox “I agree with the terms of service”
        shoppingcart.clickOnTermsOfServiceCheckBox();
        // 2.19 Click on “CHECKOUT”
        shoppingcart.clickOnCheckOutButton();
        // 2.20 Verify the Text “Welcome, Please Sign In!”
        String actualWelcomeSignInText = loginpage.getWelcomePageSignInText();
        Assert.assertEquals(actualWelcomeSignInText,"Welcome, Please Sign In!","error");
        //2.21Click on “CHECKOUT AS GUEST”Tab
        loginpage.clickOnCheckoutAsGuestButton();
        //2.22 Fill the all mandatory field
        checkoutpage.inputFirstname("Ramesh");
        checkoutpage.inputLastname("Patel");
        checkoutpage.inputEmail("Ramesh17Patel@gmail.com");
        checkoutpage.selectCountry("United Kingdom");
        checkoutpage.inputCity("London");
        checkoutpage.inputAddress1("123 High Street");
        checkoutpage.inputPostalCode("EC127YS");
        checkoutpage.inputPhoneNumber("12345678");
        //2.23 Click on “CONTINUE”
        checkoutpage.clickOnContinueButton();
        //2.24 Click on Radio Button “Next Day Air($0.00)”
        checkoutpage.clickOnNextDayAirRadioButton();
        // 2.25 Click on “CONTINUE”
        checkoutpage.clickOnContinueButton1();
        // 2.26 Select Radio Button “Credit Card”
        checkoutpage.clickOnCreditCard();
        checkoutpage.clickOnPaymentContinueButton();
        //2.27 Select “Master card” From Select credit card dropdown
        checkoutpage.selectCreditCard("Master card");
        //2.28 Fill all the details
        checkoutpage.inputCardHolderName("Mr Ramesh Patel");
        checkoutpage.inputCardNumber("5356 6548 1418 5420");
        checkoutpage.selectExpireMonth("12");
        checkoutpage.selectExpireYear("2025");
        checkoutpage.inputCardCode("789");
        // 2.29 Click on “CONTINUE”
        checkoutpage.clickOnContinueButton2();
        //2.30 Verify “Payment Method” is “Credit Card”
        String actualCardMessage = checkoutpage.getCreditCardText();
        Assert.assertEquals(actualCardMessage,"Credit Card","error");
        // 2.32 Verify “Shipping Method” is “Next Day Air”
        String actualShippingMessage = checkoutpage.getNextDayAirText();
        Assert.assertEquals(actualShippingMessage,"Next Day Air","error");
        //2.33 Verify Total is “$2,950.00”
        String actualTotalAmountMessage = checkoutpage.getTotalAmountText();
        Assert.assertEquals(actualTotalMessage,"$2,950.00","error");
        //2.34 Click on “CONFIRM”
        checkoutpage.clickOnConfirmButton();
        //2.35 Verify the Text “Thank You”
        String actualThankYouText = checkoutpage.getThankYouText();
        Assert.assertEquals(actualThankYouText,"Thank you","error");
        // 2.36 Verify the message “Your order has been successfully processed!”
        String actualOrderSuccessText = checkoutpage.getOrderSuccessProcessText();
        Assert.assertEquals(actualOrderSuccessText,"Your order has been successfully processed!","error");
        // 2.37 Click on “CONTINUE”
        checkoutpage.clickOnContinueButton3();
        // 2.38 Verify the text “Welcome to our store”
        String actualWelcomeStoreText = homepage.getWelcomeOurStoreText();
        Assert.assertEquals(actualWelcomeStoreText,"Welcome to our store","error");

    }
}