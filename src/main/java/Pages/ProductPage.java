package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage {
    public WebDriverWait wait;
    String productName = "iPhone 12 Pro Max";
    private WebDriver driver;

    private WebElement minField;
    private WebElement maxField;
    private WebElement searchButton;
    private WebElement colorIcon;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void filter_with_specefic_data() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains("Amazon.eg : iPhone 12 Pro Max"));
        js.executeScript("scrollBy(0,800)");
        minField = driver.findElement(By.id("low-price"));
        minField.sendKeys("1");
        maxField = driver.findElement(By.id("high-price"));
        maxField.sendKeys("1000");
        searchButton = driver.findElement(By.id("a-autoid-1-announce"));
        searchButton.submit();
        js.executeScript("scrollBy(0,1000)");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@style,\"background-position: 0px 0px;\")]")));
        colorIcon = driver.findElement(By.xpath("//div[contains(@style,\"background-position: 0px 0px;\")]"));
        colorIcon.click();
    }

}
