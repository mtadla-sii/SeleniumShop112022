package pages.cart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class CartPopupPage extends BasePage {
    public CartPopupPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#blockcart-modal .btn-primary")
    private WebElement proceedToCheckoutBtn;

    public CartPage goToCart(){
        click(proceedToCheckoutBtn);
        return new CartPage(driver);
    }
}
