package cart;

import base.Pages;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;


public class CartTest extends Pages {

    @Test
    public void screenshotShotDemo() {
        productGridPage.openProductWithName("HUMMINGBIRD T-SHIRT");
        // force test to fail -> TestBase has mechanism to take screenshot on fail
        Assertions.assertThat(1).isEqualTo(2);
    }

    @Test
    public void shouldVerifyCartCalculationsPartialFluentPOP() {
        productGridPage.openProductWithName("HUMMINGBIRD T-SHIRT");

        productDetailsPage.setQuantity(5)
                .addToCart();

        cartPopupPage.goToCart();

        softAssertions.assertThat(cartPage.getProductName()).isEqualTo("HUMMINGBIRD T-SHIRT");
        softAssertions.assertThat(cartPage.getProductQuantity()).isEqualTo("5");
        softAssertions.assertThat(cartPage.getProductPrice()).isEqualTo("$19.12");
        softAssertions.assertThat(cartPage.getProductTotalPrice()).isEqualTo("$95.60");
        softAssertions.assertAll();
    }

    @Test
    public void shouldVerifyCartCalculationsFullFluentPOP() {
        productGridPage
                .openProductWithName("HUMMINGBIRD T-SHIRT")
                .setQuantity(5)
                .addToCart()
                .goToCart();

        softAssertions.assertThat(cartPage.getProductName()).isEqualTo("HUMMINGBIRD T-SHIRT");
        softAssertions.assertThat(cartPage.getProductQuantity()).isEqualTo("5");
        softAssertions.assertThat(cartPage.getProductPrice()).isEqualTo("$19.12");
        softAssertions.assertThat(cartPage.getProductTotalPrice()).isEqualTo("$95.60");
        softAssertions.assertAll();
    }
}
