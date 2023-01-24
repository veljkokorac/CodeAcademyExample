package tests;

import org.junit.Test;

import pages.CartPage;
import pages.LoginPage;
import pages.ProductsListPage;

public class LoginTests extends BaseTest{
    String expectedErrorEmptyUsername = "Epic sadface: Username is required";
    String verifyInvalidUsernameLoginAttempt = "Epic sadface: Sorry, this user has been locked out";
    String expectedErrorEmptyPassword = "Epic sadface: Password is required";

    @Test
    public void verifySuccessfulLogin(){
        LoginPage loginPage = new LoginPage(driver);
        ProductsListPage productsListPage = new ProductsListPage(driver);

        loginPage.goToBaseUrl();
        loginPage.login(validUsername, validPassword);
        productsListPage.verifySuccessfulLogin();
    }
    @Test
    public void verifyEmptyUsernameLoginAttempt(){
        LoginPage loginPage = new LoginPage(driver);

        loginPage.goToBaseUrl();
        loginPage.login("", validPassword);
        loginPage.verifyUnsuccessfulLogin(expectedErrorEmptyUsername);
        

    }
    @Test
    public void verifyInvalidUsernameLoginAttempt(){
        LoginPage loginPage = new LoginPage(driver);

        loginPage.goToBaseUrl();
        loginPage.login(invalidUsername,validPassword);
        loginPage.verifyInvalidUsernameLoginAttempt("Epic sadface: Sorry, this user has been locked out");

    }
    @Test
    public void verifyEmptyPasswordLoginAttempt(){
        LoginPage loginPage = new LoginPage(driver);

        loginPage.goToBaseUrl();
        loginPage.login(validUsername,"");
        loginPage.verifyUnsuccessfulLogin("Epic sadface: Password is required");
    }
    
    
    @Test
    public void verifyUserLogout(){
        LoginPage loginPage = new LoginPage(driver);
        ProductsListPage productsPage = new ProductsListPage(driver);
        CartPage cartPage = new CartPage(driver);

        loginPage.goToBaseUrl();
        loginPage.login(validUsername,validPassword);
        productsPage.addProductToCart();
        productsPage.navigateToCart();
        cartPage.validateProductAdded();

    }
    
}
