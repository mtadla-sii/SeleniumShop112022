package pages.base;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class BasePage {
    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        actions = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public WebDriver driver;
    public Actions actions;
    public WebDriverWait wait;

    public void click(WebElement element){
        System.out.println("Clicking: " + element.getText());
        element.click();
    }
    public void sendKeys(WebElement element, String text){
        System.out.println("Typing: " + text);
        element.sendKeys(text);
    }

    public void sendKeysAndClear(WebElement element, String text){
        element.clear();

        // element.getAttribute("value") -> pobiera tekst wpisany do inputu!
        if(!getValue(element).equals("")){
            element.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
        }

        sendKeys(element, text);
    }

    public String getValue(WebElement element){
        return element.getAttribute("value");
    }

    public WebElement getRandomElement(List<WebElement> elements) {
        return elements.get(new Random().nextInt(elements.size()));
    }
}
