package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class HomePage {
    String productName = "iPhone 12 Pro Max";
    public WebDriverWait wait;
    private WebDriver driver;
    private WebElement searchField;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open_home_page() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.navigate().to("https://egypt.souq.com/eg-en/");
        wait.until(ExpectedConditions.titleContains("سوق بقى امازون | اهلا بكم في أمازون مصر | تسوق اون لاين الاجهزة الالكترونية، الملابس، منتجات الجمال، البقالة واكثر فقط على أمازون مصر"));
    }
    public ProductPage search_for_product() {
        searchField = driver.findElement(By.id("twotabsearchtextbox"));

        searchField.sendKeys(productName);
        searchField.submit();
        return new ProductPage(driver);

    }
}
