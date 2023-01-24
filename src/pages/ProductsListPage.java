package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsListPage extends BasePage{
    
    public ProductsListPage(WebDriver driver){
        super(driver);
    }

    By pageTitleBy = By.xpath("//span[@class='title']");
    String pageTitle = "PRODUCTS";
    By menuButtonBy = By.id("react-burger-menu-btn");
    By logoutButtonBy = By.id("logout_sidebar_link");
    By inventoryItemBy = By.xpath("//[@class='inventory_item']");
    By filterBy = By.xpath("//select[@class='product_sort_container']");
    By firstProductNameBy = By.xpath("//div[@class='inventory_item_name']");
    By firstProductPrice = By.xpath("//div[@class='inventory_item_price']");
    By clickImageBy = By.xpath("//img[@alt='Sauce Labs Backpack']");
    By addToCart = By.xpath("//button[@data-test='add-to-cart-sauce-labs-backpack']");
    By cartIconBy = By.className("shopping_cart_link");
    By removeBy = By.xpath("//button[@data-test='remove-sauce-labs-backpack']");
    By backToProcuts = By.id("back-to-products");
    By addToCart2 = By.id("add-to-cart-sauce-labs-backpack");
    By remove2By = By.xpath("//button[@data-test='remove-sauce-labs-backpack']");
    By checkoutBy = By.xpath("//button[@data-test='checkout']");
    By cartButtonBy = By.className("shopping_cart_container");
    By cancelBy = By.id("cancel");
    By continiueShopingBy = By.id("continue-shopping");
    By remove3By = By.id("remove-sauce-labs-backpack");
    
    

    

    public ProductsListPage verifySuccessfulLogin(){
        String actualPageTitle = readText(pageTitleBy);
        assertTextEquals(pageTitle, actualPageTitle);
        return this;
    }

    public ProductsListPage expandMenu(){
        click(menuButtonBy);
        return this;
    }

    public ProductsListPage navigateToLogin(){
        click(logoutButtonBy);
        return this;
    }
    public ProductsListPage verifyNumberOfProducts(int expectedNumber){
        int actualNumber = countItems(inventoryItemBy);
        assertIntegerEquals(expectedNumber,actualNumber);
        

    

    return this;
    

    }
    public ProductsListPage selectFilterOptionByValue(String value){
        selectDropdownOptionByValue(filterBy, value);
        return this;
    }

    public void ProductListPage() {
    }

    public void selectFilter(Object filterBy2, Object value) {
    }
    public ProductsListPage verifyFirstItemName(String expectedText){
        waitVisibility(firstProductNameBy);
        String actualText = readText(firstProductNameBy);
        assertTextEquals(expectedText, actualText);
        return this;
        
    }

    public ProductsListPage verifyFirstItemPrice(String expectedPrice){
        String actualPrice = readText(firstProductPrice);

        assertTextEquals(expectedPrice, actualPrice);
        return this;
    }
    public ProductsListPage navigateToPdP(){
        click(clickImageBy);
        return this;




    }

    public static void addToCart() {
    }
    public ProductsListPage addProductToCart(){
        click(addToCart);
        return this;
    }

    public ProductsListPage removeProductFromCart(){
        click(removeBy);
        return this;
    }


    public ProductsListPage navigateToCart(){
        click(cartIconBy);
        return this;
    }

    public void verifyProductRemoved() {
        assertElementVisible(addToCart);
        
    }
    public ProductsListPage backToProducts(){
        click(backToProcuts);
        return this;
    }
    public ProductsListPage addToCart2(){
        click(addToCart2);
        return this;
    }
    public void verifyRemoveButton(){
        assertElementVisible(remove2By);
    }

    public ProductsListPage removeButton(){
        click(remove2By);
        return this;
    }

    public void verifyAddToCartIsVisible(){
        assertElementVisible(addToCart2);
    }

    public ProductsListPage verifyCheckoutButton(){
        click(checkoutBy);
        return this;

    }


    public ProductsListPage verifyCartButton(){
        click(cartButtonBy);
        return this;
    }

    public void verifyCancelButtonIsVisible(){
        assertElementVisible(cancelBy);
    }

    public ProductsListPage verifyContinueShopingButton(){
        click(continiueShopingBy);
        return this;

    }
    public ProductsListPage verifyRemove3Button(){
        click(remove3By);
        return this;
    }
    
    public BasePage verifyRemoveIsNotVisible(){
        assertElementIsNotVisible(remove3By);
        return this;
        
    }
    
    
}
