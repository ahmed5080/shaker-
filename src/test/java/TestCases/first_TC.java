package TestCases;

import Pages.HomePage;
import Pages.ProductPage;
import TestBase.TestBase;
import org.testng.annotations.Test;

public class first_TC extends TestBase {
    private HomePage homePageObject ;
    private ProductPage productPageObject ;
    @Test(priority = 1)
    public void open_homepage() {
        homePageObject = new HomePage(driver);
        homePageObject.open_home_page();
        productPageObject = homePageObject.search_for_product();
        productPageObject.filter_with_specefic_data();

    }
}
