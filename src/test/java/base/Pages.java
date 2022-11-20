package base;

import org.testng.annotations.BeforeMethod;
import pages.cart.CartPage;
import pages.cart.CartPopupPage;
import pages.commons.MenuPage;
import pages.product.ProductDetailsPage;
import pages.product.ProductGridPage;
import pages.user.LoginPage;
import pages.user.SignUpPage;

public class Pages extends TestBase {
    public CartPage cartPage;
    public CartPopupPage cartPopupPage;
    public MenuPage menuPage;
    public ProductDetailsPage productDetailsPage;
    public ProductGridPage productGridPage;
    public LoginPage loginPage;
    public SignUpPage signUpPage;

    @BeforeMethod
    public void initPages() {
        cartPage = new CartPage(driver);
        cartPopupPage = new CartPopupPage(driver);
        menuPage = new MenuPage(driver);
        productDetailsPage = new ProductDetailsPage(driver);
        productGridPage = new ProductGridPage(driver);
        loginPage = new LoginPage(driver);
        signUpPage = new SignUpPage(driver);
    }
}
