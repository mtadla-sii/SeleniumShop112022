package pages.product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.base.BasePage;
import pages.cart.CartPopupPage;

public class ProductDetailsPage extends BasePage {
    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".add-to-cart")
    private WebElement addToCartBtn;

    @FindBy(css = "#quantity_wanted")
    private WebElement quantityInput;


    public CartPopupPage addToCart(){
        click(addToCartBtn);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("blockcart-modal")));
        return new CartPopupPage(driver);
    }

    public ProductDetailsPage setQuantity(int quantity){
        sendKeysAndClear(quantityInput, String.valueOf(quantity));
        return this;
    }
}
