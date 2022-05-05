package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BuildYourComputerPage extends Utility {

    By buildYourOwnComputerText = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By processor = By.xpath("//select[@id='product_attribute_1']");
    By ram = By.xpath("//select[@id='product_attribute_2']");
    By hddRadio = By.xpath("//input[@id='product_attribute_3_7']");
    By osRadio = By.xpath("//input[@id='product_attribute_4_9']");
    By msOffice = By.xpath("//input[@id='product_attribute_5_10']");
    By totalCommander = By.xpath("//input[@id='product_attribute_5_12']");
    By priceText = By.xpath("//span[@class='price-value-1']");
    By addToCartButton = By.xpath("//button[@id='add-to-cart-button-1']");
    //By verifyProductPrice = By.xpath("//div[@class='bar-notification success']");
    By closeTheBarMsg = By.xpath("//span[@class='close']");
    By mouseHoverOnShoppingCart1 = By.xpath("//span[contains(text(),'Shopping cart')]");
    By clickOnGoToCartButton1 = By.xpath("//button[contains(text(),'Go to cart')]");
    By productAddedToShoppingCart = By.xpath("//p[@class='content']");


    public String getBuildYourOwnComputerText()
    {
        return getTextFromElement(buildYourOwnComputerText);
    }
    public void selectProcessor2_2GHzIntelPentiumDualCoreE2200() {
        selectByValueFromDropDown(processor, "1");
    }
    public void selectRAM8GB() {
        selectByValueFromDropDown(ram, "5");
    }
    public void selectHDDRadio400GB() {
        clickOnElement(hddRadio);
    }

    public void selectOSRadioVistaPremium() {
        clickOnElement(osRadio);
    }

    public void selectCheckBoxMicrosoftOffice() {
        clickOnElement(msOffice);
    }
    public void selectCheckBoxTotalCommander() {
        clickOnElement(totalCommander);
    }

    public String getPriceText() {
        return getTextFromElement(priceText);
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
    }
    //    public String verifyTheProductHasBeenAddedToYourShoppingCart(){
//        return getTextFromElement(verifyProductPrice);
//    }
    public void closeTheBarByClickingOnTheCrossButton(){
        clickOnElement(closeTheBarMsg);
    }

    public void mouseHoverOnShoppingCartButton(){

        mouseHoverToElement(mouseHoverOnShoppingCart1);
    }
    public void clickOnGoToCartButton(){
        clickOnElement(clickOnGoToCartButton1);
    }

    public String getProductAddedToShoppingCart(){
        return getTextFromElement(productAddedToShoppingCart);
    }


}


