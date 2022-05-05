package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {


    By computerTab = By.xpath("//h1[contains(text(),'Computers')]");
    By electronicsTab = By.xpath("//h1[contains(text(),'Electronics')]");
    By apparelTab = By.xpath("//h1[contains(text(),'Apparel')]");
    By digitalDownloadsTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Digital downloads']");
    By BooksTab = By.xpath("//h1[contains(text(),'Books')]");
    By jewelryTab = By.xpath("//h1[contains(text(),'Jewelry')]");
    By giftCardsTab = By.xpath("//h1[contains(text(),'Gift Cards')]");
    By computersLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    By welcomeOurStoreText = By.xpath("//h2[contains(text(),'Welcome to our store')]");

    By electronicsLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    By cellPhoneLink = By.xpath("//ul[@class='top-menu notmobile']//a[text()='Cell phones ']");
    By logOutButton = By.xpath("//a[contains(text(),'Log out')]");

    public void selectMenu(String menu){
        List<WebElement> topMenuNames = driver.findElements(By.xpath("//div[@class='header-menu']//li"));
        for (WebElement names : topMenuNames) {
            if (names.getText().equalsIgnoreCase(menu)) {
                names.click();
                break;
            }
        }
    }
    public String getTextFromComputers()
    {
        return getTextFromElement(computerTab);
    }
    public String getTextFromElectronics()
    {
        return getTextFromElement(electronicsTab);
    }
    public String getTextFromApparel()
    {
        return getTextFromElement(apparelTab);
    }
    public String getTextFromDigitalDownloads()
    {
        return getTextFromElement(digitalDownloadsTab);
    }
    public String getTextFromBooks()
    {
        return getTextFromElement(BooksTab);
    }
    public String getTextFromJewelry()
    {
        return getTextFromElement(jewelryTab);
    }
    public String getTextFromGiftCards()
    {
        return getTextFromElement(giftCardsTab);
    }
    public void clickOnComputersLink(){
        clickOnElement(computersLink);
    }
    public String getWelcomeOurStoreText(){
        return getTextFromElement(welcomeOurStoreText);
    }
    public void mouseHoverOnElectronicsTab(){
        mouseHoverToElement(electronicsLink);
    }
    public void clickOnCellPhoneLink(){
        mouseHoverToElementAndClick(cellPhoneLink);
    }

    public void clickOnLogOutButton(){
        clickOnElement(logOutButton);
    }
}