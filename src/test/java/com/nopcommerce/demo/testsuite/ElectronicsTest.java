package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends TestBase {

    HomePage homePage = new HomePage();
    CellPhonePage cellphonepage = new CellPhonePage();
    NokiaLumiaPage nokialumiapage = new NokiaLumiaPage();
    ShoppingCart shoppingcart = new ShoppingCart();
    LoginPage loginpage = new LoginPage();
    RegisterPage registerpage = new RegisterPage();
    CheckOutPage checkoutpage = new CheckOutPage();

    @Test
    public void textVerified(){
        //1.1 Mouse Hover on “Electronics” Tab
        homePage.mouseHoverOnElectronicsTab();
        // 1.2 Mouse Hover on “Cell phones” and click
        homePage.clickOnCellPhoneLink();
        //1.3 Verify the text “Cell phones”
        String actualCellPhoneMessage = cellphonepage.getCellPhoneText();
        Assert.assertEquals(actualCellPhoneMessage,"Cell phones","error");
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        //2.1 Mouse Hover on “Electronics” Tab
        homePage.mouseHoverOnElectronicsTab();
        //2.2 Mouse Hover on “Cell phones” and click
        homePage.clickOnCellPhoneLink();
        //2.3 Verify the text “Cell phones”
        String actualCellPhoneMessage = cellphonepage.getCellPhoneText();
        Assert.assertEquals(actualCellPhoneMessage,"Cell phones","error");
        //2.4 Click on List View Tab
        cellphonepage.clickOnListViewLink();
        Thread.sleep(1000);
        //2.5 Click on product name “Nokia Lumia 1020” link
        cellphonepage.clickOnNokiaLomia();
        // 2.6 Verify the text “Nokia Lumia 1020”
        String actualNokiaLumiaText = nokialumiapage.getNokiaLumia1020Text();
        Assert.assertEquals(actualNokiaLumiaText,"Nokia Lumia 1020","error");
        //2.7 Verify the price “$349.00”
        String actualPriceText = nokialumiapage.getPriceText();
        Assert.assertEquals(actualPriceText,"$349.00","error");
        // 2.8 Change quantity to 2
        nokialumiapage.updateQuantityBox();
        // 2.9 Click on “ADD TO CART” tab
        nokialumiapage.clickOnAddToCartButton();
        //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String actualProductAddedText = nokialumiapage.getproductMessText();
        Assert.assertEquals(actualProductAddedText,"The product has been added to your shopping cart","error");
        // After that close the bar clicking on the cross button
        nokialumiapage.clickGreenButton();
        // 2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button
        nokialumiapage.mouserHoverOnShoppingCart();
        nokialumiapage.clickOnGoToCartButton();
        //2.12 Verify the message "Shopping cart"
        shoppingcart.getShoppingCartText();

        //2.13 Verify the quantity is 2
        String actualQuantityMessage = shoppingcart.getVerifyQuantity();
        Assert.assertEquals(actualQuantityMessage,"(2)","error");
        // 2.14 Verify the Total $698.00
        String actualTotalMessage = shoppingcart.getVerifyTotal();
        Assert.assertEquals(actualTotalMessage,"$698.00","error");
        // 2.15 click on checkbox “I agree with the terms of service”
        shoppingcart.clickOnTermsOfServiceCheckBox();
        // 2.16 Click on checkout
        shoppingcart.clickOnCheckOutButton();
        //2.17 Verify the Text “Welcome, Please Sign In!”
        String actualWelcomePageSignInMessage = loginpage.getWelcomePageSignInText();
        Assert.assertEquals(actualWelcomePageSignInMessage,"Welcome, Please Sign In!","error");
        // 2.18 Click on “REGISTER” tab
        loginpage.clickOnRegisterButton();
        //2.19 Verify the text “Register”
        String actualRegisterMessage = registerpage.getVerifyRegisterText();
        Assert.assertEquals(actualRegisterMessage,"Register","error");
        //2.20 Fill the mandatory fields
        registerpage.inputFirstname("Ramesh");
        registerpage.inputLastname("Patel");
        registerpage.inputEmail("PatelRamesh789@gmail.com");
        registerpage.inputPassword("Temp123");
        registerpage.inputConfirmPassword("Temp123");
        //2.21 Click on “REGISTER” Button
        registerpage.clickOnRegisterButton();
        //2.22 Verify the message “Your registration completed”
        String actualRegisterSuccessMessage = registerpage.getRegisterSuccessText();
        Assert.assertEquals(actualRegisterSuccessMessage,"Your registration completed","error");
        //2.23 Click on “CONTINUE” tab
        registerpage.clickOnContinueButton();
        //2.24 Verify the text “Shopping cart”
        shoppingcart.getShoppingCartText();
        //2.25 click on checkbox “I agree with the terms of service”
        shoppingcart.clickOnTermsOfServiceCheckBox();
        //2.26 Click on “CHECKOUT”
        shoppingcart.clickOnCheckOutButton();
        //2.27 Fill the Mandatory fields
        // checkoutpage.inputFirstname("Ramesh");
        //checkoutpage.inputLastname("Patel");
        // checkoutpage.inputEmail("PatelRamesh1234@gmail.com");
        checkoutpage.selectCountry("United Kingdom");
        checkoutpage.inputCity("London");
        checkoutpage.inputAddress1("123 HighStreet");
        checkoutpage.inputPostalCode("EC15YQ");
        checkoutpage.inputPhoneNumber("12345678");
        //2.28 Click on “CONTINUE”
        checkoutpage.clickOnContinueButton();
        //2.29 Click on Radio Button “2nd Day Air ($0.00)”
        checkoutpage.clickOnRadioButton2ndDayAir();
        // 2.30 Click on “CONTINUE”
        checkoutpage.clickOnContinueButton1();
        // 2.31 Select Radio Button “Credit Card”
        checkoutpage.clickOnCreditCard();
        checkoutpage.clickOnPaymentContinueButton();
        // 2.32 Select “Visa” From Select credit card dropdown
        checkoutpage.selectCreditCard("Visa");
        //2.33 Fill all the details
        checkoutpage.inputCardHolderName("Mr Ramesh Patel");
        checkoutpage.inputCardNumber("5356 6548 1418 5420");
        checkoutpage.selectExpireMonth("12");
        checkoutpage.selectExpireYear("2025");
        checkoutpage.inputCardCode("789");
        //2.34 Click on “CONTINUE”CHECKOUT
        checkoutpage.clickOnContinueButton2();
        // 2.35 Verify “Payment Method” is “Credit Card”
        String actualCreditCardMessage = checkoutpage.getCreditCardText();
        Assert.assertEquals(actualCreditCardMessage,"Credit Card","error");
        // 2.36 Verify “Shipping Method” is “2nd Day Air”
        String actual02DayMessage = checkoutpage.get02ndDayText();
        Assert.assertEquals(actual02DayMessage,"2nd Day Air","error");
        // 2.37 Verify Total is “$698.00”
        String actualTotalAmountNokiaMessage = checkoutpage.getTotalAmountNokiaText();
        Assert.assertEquals(actualTotalAmountNokiaMessage,"$698.00","error");
        // 2.38 Click on “CONFIRM”
        checkoutpage.clickOnConfirmButton();
        //2.39 Verify the Text “Thank You”
        String actualThankYouMessage = checkoutpage.getThankYouText();
        Assert.assertEquals(actualThankYouMessage,"Thank you","error");
        //2.40 Verify the message “Your order has been successfully processed!”
        String actualOrderSuccessProcessedMessage = checkoutpage.getOrderSuccessProcessText();
        Assert.assertEquals(actualOrderSuccessProcessedMessage,"Your order has been successfully processed!","error");
        // 2.41 Click on “CONTINUE”
        checkoutpage.clickOnContinueButton3();
        // 2.42 Verify the text “Welcome to our store”
        String actualWelcomeOurStoreMessage = homePage.getWelcomeOurStoreText();
        Assert.assertEquals(actualWelcomeOurStoreMessage,"Welcome to our store","error");
        // 2.43 Click on “Logout” link
        homePage.clickOnLogOutButton();
        // 2.44 Verify the URL is “https://demo.nopcommerce.com/”
        String actualURL = driver.getCurrentUrl();
        // org.junit.Assert.assertEquals(actualURL, "https://demo.nopcommerce.com/" );
        Assert.assertEquals(actualURL,"https://demo.nopcommerce.com/","error");
    }

}