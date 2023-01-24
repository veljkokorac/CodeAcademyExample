package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{
    public CartPage(WebDriver driver){
        super(driver);
    }

    By cartItemBy = By.xpath("//div[@class='cart_item']");
    public CartPage validateProductAdded(){
        assertElementVisible(cartItemBy);
        return this;

    }
    
}
