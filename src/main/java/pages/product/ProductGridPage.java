package pages.product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

import java.util.List;

public class ProductGridPage extends BasePage {
    public ProductGridPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".product-title")
    List<WebElement> productsNames;

    public ProductDetailsPage openProductWithName(String productName) {
        click(driver.findElement(By.xpath("//a[.='" + productName + "']")));
        return new ProductDetailsPage(driver);
    }
}
