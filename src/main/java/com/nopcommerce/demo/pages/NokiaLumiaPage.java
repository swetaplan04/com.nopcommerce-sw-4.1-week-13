package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class NokiaLumiaPage extends Utility {

    By NokiaLumia1020Text = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
    By priceText = By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[6]/div[1]/span[1]");
    By cartBox = By.id("product_enteredQuantity_20");
    By cartQuantityBox = By.id("product_enteredQuantity_20");
    By addToCartButton = By.id("add-to-cart-button-20");
    By productMessText = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By greenButton = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    By shoppingCartLink = By.xpath("//span[contains(text(),'Shopping cart')]");
    By goToCartButton = By.xpath("//button[contains(text(),'Go to cart')]");

    public String getNokiaLumia1020Text() {
        return getTextFromElement(NokiaLumia1020Text);

    }

    public String getPriceText() {
        return getTextFromElement(priceText);
    }

    public void updateCartBox() {
        sendTextToElement(cartBox, Keys.BACK_SPACE + "2");
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
    }

    public String getproductMessText() {
        return getTextFromElement(productMessText);
    }

    public void updateQuantityBox(){
        sendTextToElement(cartQuantityBox,Keys.BACK_SPACE + "2");
    }
    public void clickGreenButton() {
        clickOnElement(greenButton);
    }

    public void mouserHoverOnShoppingCart() {
        mouseHoverToElement(shoppingCartLink);
    }

    public void clickOnGoToCartButton() {
        clickOnElement(goToCartButton);
    }
}

