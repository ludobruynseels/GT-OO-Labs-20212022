import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

/**
 * The test class StockManagerTest.
 *
 * @author  KP
 * @version 2021-2022
 */
public class StockManagerTest
{
    private StockManager manager;

    /**
     * Default constructor for test class StockManagerTest
     */
    public StockManagerTest()
    {

    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        manager = new StockManager();
        manager.addProduct(new Product(132, "Clock Radio"));
        manager.addProduct(new Product(37,  "Mobile Phone"));
        manager.addProduct(new Product(23,  "Microwave Oven"));

    }

    /**
     * Test for findProduct based on ID
     *
    @Test
    public void testFindProduct()
    {
    Product product = manager.findProduct(1111);
    assertNull(product);
    product = manager.findProduct(37);
    assertNotNull(product);
    assertEquals("Mobile Phone", product.getName());
    }
     */

    /**
     * Test for numberInStock based on ID
     *
    @Test
    public void testNumberInStock()
    {
    assertEquals(0, manager.numberInStock(1111));
    assertEquals(0, manager.numberInStock(37));
    Product product = manager.findProduct(37);
    product.increaseQuantity(5);
    assertEquals(5, manager.numberInStock(37));
    }
     */

    /**
     * Test for delivery method
     *
    @Test
    public void testDelivery()
    {
    Product product = manager.findProduct(37);
    manager.delivery(37,50);
    assertEquals(50, manager.numberInStock(37));
    manager.delivery(37,50);
    assertEquals(100, manager.numberInStock(37));
    }
     */

    /**
     * test for lowStockProducts
     *
    @Test
    public void testLowStockProducts()
    {
        manager.delivery(37,50);
        manager.delivery(37, 20);
        manager.delivery(132, 3);
        manager.delivery(132, 47);
        ArrayList<Product> lowstockProducts = manager.lowStockProducts(51);
        assertEquals(2, lowstockProducts.size());
        lowstockProducts = manager.lowStockProducts(2);
        assertEquals(1, lowstockProducts.size());
        lowstockProducts = manager.lowStockProducts(0);
        assertEquals(0, lowstockProducts.size());
    }
*/
    /**
     * test for totalItemsInStock
     *
    @Test
    public void testTotalItemsInStock() 
    {
        assertEquals(0, manager.totalItemsInStock());
        manager.delivery(37,50);
        assertEquals(50, manager.totalItemsInStock());
        manager.delivery(37,50);
        assertEquals(100, manager.totalItemsInStock());
        manager.delivery(132,5);
        assertEquals(105, manager.totalItemsInStock());
    }
*/
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
