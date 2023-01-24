package tests;

import org.junit.Test;


import pages.CartPage;
import pages.LoginPage;
import pages.ProductsListPage;

public class ProductListPageTest extends BaseTest {
    int expectedNumberOfProducts = 6;
    String sortAtoZ = "az";
    String sortAtoZfistItemName = "Sauce Labs Backpack";
    String sortZtoA = "za";
    String sortZtoAfirstItemName = "Test.allTheThings() T-Shirt (Red)";
    String sortLtoH = "lohi";
    String sortLtoHfirstItemName = "Sauce Labs Onesie";
    String sortHtoL = "hilo";
    String sortHtoLfirstItemName = "Sauce Labs Fleece Jacket";


    @Test
    public void verifyNumberOfProducts(){
        LoginPage loginPage = new LoginPage(driver);
        ProductsListPage productPage = new ProductsListPage(driver);

        loginPage.goToBaseUrl();
        loginPage.login(validUsername, validPassword);
        productPage.verifyNumberOfProducts(expectedNumberOfProducts);
    }

    @Test
    public void selectFilter(){
        LoginPage loginPage = new LoginPage(driver);
        ProductsListPage productPage = new ProductsListPage(driver);

        loginPage.goToBaseUrl();
        loginPage.login(validUsername, validPassword);
        productPage.selectFilterOptionByValue(sortAtoZ);
        productPage.verifyFirstItemName(sortAtoZfistItemName);



    }
    @Test
    public void selectFilterZtoA(){
        LoginPage loginPage = new LoginPage(driver);
        ProductsListPage productPage = new ProductsListPage(driver);

        loginPage.goToBaseUrl();
        loginPage.login(validUsername, validPassword);
        productPage.selectFilterOptionByValue(sortZtoA);
        productPage.verifyFirstItemName(sortZtoAfirstItemName);
    }
    @Test
    public void selectFilterLtoH(){
        LoginPage loginPage = new LoginPage(driver);
        ProductsListPage productPage = new ProductsListPage(driver);

        loginPage.goToBaseUrl();
        loginPage.login(validUsername, validPassword);
        productPage.selectFilterOptionByValue(sortLtoH);
        productPage.verifyFirstItemName(sortLtoHfirstItemName);
    }
    @Test
    public void selectFilterHtoL(){
        LoginPage loginPage = new LoginPage(driver);
        ProductsListPage productPage = new ProductsListPage(driver);

        loginPage.goToBaseUrl();
        loginPage.login(validUsername, validPassword);
        productPage.selectFilterOptionByValue(sortHtoL);
        productPage.verifyFirstItemName(sortHtoLfirstItemName);

    }

    @Test

    public void navigateToPdp(){
        LoginPage loginPage = new LoginPage(driver);
        ProductsListPage productPage = new ProductsListPage(driver);


        loginPage.goToBaseUrl();
        loginPage.login(validUsername, validPassword);
        productPage.navigateToPdP();
    }


    @Test

    public void addToCart(){
        LoginPage loginPage = new LoginPage(driver);
        ProductsListPage productsPage = new ProductsListPage(driver);
        CartPage cartPage = new CartPage(driver);


        loginPage.goToBaseUrl();
        loginPage.login(validUsername, validPassword);
        productsPage.addProductToCart();
        productsPage.navigateToCart();
        cartPage.validateProductAdded();
        
        
    }

    @Test
    public void verifyProductCanBeRemovedFromCartOnPLP(){
        LoginPage loginPage = new LoginPage(driver);
        ProductsListPage productsPage = new ProductsListPage(driver);
        


        loginPage.goToBaseUrl();
        loginPage.login(validUsername, validPassword);
        productsPage.addProductToCart();
        productsPage.removeProductFromCart();
        productsPage.verifyProductRemoved();

        


    }
    @Test
    public void VerifyBackToProducts(){
        LoginPage loginPage = new LoginPage(driver);
        ProductsListPage productsPage = new ProductsListPage(driver);
        


        loginPage.goToBaseUrl();
        loginPage.login(validUsername, validPassword);
        productsPage.navigateToPdP();
        productsPage.backToProducts();
        productsPage.verifySuccessfulLogin();


    }
    @Test
    public void VerifyAddToCart(){
        LoginPage loginPage = new LoginPage(driver);
        ProductsListPage productsPage = new ProductsListPage(driver);
        


        loginPage.goToBaseUrl();
        loginPage.login(validUsername, validPassword);
        productsPage.navigateToPdP();
        productsPage.addToCart2();
        productsPage.verifyRemoveButton();

}
@Test
    public void VerifyRemoveButton(){
        LoginPage loginPage = new LoginPage(driver);
        ProductsListPage productsPage = new ProductsListPage(driver);
        


        loginPage.goToBaseUrl();
        loginPage.login(validUsername, validPassword);
        productsPage.navigateToPdP();
        productsPage.addToCart2();
        productsPage.removeButton();
        productsPage.verifyAddToCartIsVisible();


    }


    @Test
    public void verifyCheckoutButton(){
        LoginPage loginPage = new LoginPage(driver);
        ProductsListPage productsPage = new ProductsListPage(driver);
        


        loginPage.goToBaseUrl();
        loginPage.login(validUsername, validPassword);
        productsPage.verifyCartButton();
        productsPage.verifyCheckoutButton();
        productsPage.verifyCancelButtonIsVisible();


    }

    @Test
    public void verifyContinueShopingButton(){
        LoginPage loginPage = new LoginPage(driver);
        ProductsListPage productsPage = new ProductsListPage(driver);
        


        loginPage.goToBaseUrl();
        loginPage.login(validUsername, validPassword);
        productsPage.verifyCartButton();
        productsPage.verifyContinueShopingButton();
        productsPage.verifySuccessfulLogin();



    }

    @Test
    public void verifyRemoveButton(){
        LoginPage loginPage = new LoginPage(driver);
        ProductsListPage productsPage = new ProductsListPage(driver);
        
        


        loginPage.goToBaseUrl();
        loginPage.login(validUsername, validPassword);
        productsPage.addProductToCart();
        productsPage.verifyCartButton();
        productsPage.verifyRemove3Button();
        productsPage.verifyRemoveIsNotVisible();
        

    }


}

        
    
    

