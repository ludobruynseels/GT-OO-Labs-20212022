import java.util.ArrayList;
import java.sql.*;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<Product>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        // to be updated in question f
        stock.add(item);
    }

    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    {
        return null;
    }

    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int id)
    {
        return 0;
    }

    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void delivery(int id, int amount)
    {

    }

    /**
     * Print details of all the products.
     */
    public void printProductDetails()
    {
        
    }

    /**
     * Check for low stock of products
     * @param threshold the threshold to use
     * @return ArrayList of products with low stock
     */
    public ArrayList<Product> lowStockProducts(int threshold)
    {
        return null;
    }
    
    /**
     * Returns the total number of items (= sum of all product items) in stock
     * @return the total number of items
     * 
     */
    public int totalItemsInStock()
    {
        return 0;
    }
}

