package part2.saucedemo.tests.products;

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import part2.saucedemo.base.BaseTest;
import com.sauceDemo.pages.ProductsPage;

public class ProductsTest extends BaseTest {
    @Test
    public void testProductsHeaderIsDisplayed(){
        ProductsPage productsPage = loginPage.loginIntoApplication("standard_user", "secret_sauce");

        assertTrue(productsPage.isProductHeaderDisplayed(), "\n Products header is not displayed \n");
    }
}
