import static org.junit.Assert.*;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.StringReader;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ScannerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ScannerTest
{
    /**
     * Default constructor for test class ScannerTest
     */
    public ScannerTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    /**
     * Method test1: create Scanner object and check min < max
     *
     * remove comment when all necessary code is available*/
    @Test
    public void test1()
    {
        Scanner scanner = new Scanner(5,2);
        assertEquals(true, scanner.getMin() < scanner.getMax());
    }
    
    /**
     * Method test2: scan two tags with ids out of range => not processed
     *
     * remove comment when all necessary code is available*/
    @Test
    public void test2()
    {
        Scanner scanner = new Scanner(0,5);
        Tag tag1 = new Tag(10,1f);
        Tag tag2 = new Tag(-5,1f);
        scanner.scan(tag1);
        scanner.scan(tag2);
        assertEquals(0, scanner.getNrOfProductsScanned());
        assertEquals(0f, scanner.getTotalPrice(),0.1f);  // note that to test floats, you need to provide a tolerance!      
    }
   
    /**
     * Method test3: scan tag that has already been flagged as paid => not processed
     *
     * remove comment when all necessary code is available*/
    @Test
    public void test3()
    {
        Scanner scanner = new Scanner(0,5);
        Tag tag = new Tag(3,1f);
        tag.productPaid();
        scanner.scan(tag);
        assertEquals(0, scanner.getNrOfProductsScanned());
        assertEquals(0f, scanner.getTotalPrice(),0.1f);        
    }
    
    /**
     * Method test4: scan tag and check whether totalPrice and nrOfProducts are updated correctly
     *
     * remove comment when all necessary code is available*/
    @Test
    public void test4()
    {
        Scanner scanner = new Scanner(0,5);
        assertEquals(0, scanner.getNrOfProductsScanned());
        assertEquals(0f, scanner.getTotalPrice(),0.1f);
        Tag tag1 = new Tag(3,1f);
        Tag tag2 = new Tag(2,2.5f);
        scanner.scan(tag1);
        scanner.scan(tag2);
        assertEquals(2, scanner.getNrOfProductsScanned());
        assertEquals(3.5f, scanner.getTotalPrice(),0.1f);
    }
    
    /**
     * Method test5: scan tag twice and check whether processed only once
     *
     * remove comment when all necessary code is available*/
    @Test
    public void test5()
    {
         Scanner scanner = new Scanner(0,5);
        assertEquals(0, scanner.getNrOfProductsScanned());
        assertEquals(0f, scanner.getTotalPrice(),0.1f);
        Tag tag1 = new Tag(3,1f);
        Tag tag2 = new Tag(2,2.5f);
        scanner.scan(tag1);
        scanner.scan(tag2);
        scanner.scan(tag2); 
        assertEquals(2, scanner.getNrOfProductsScanned());
        assertEquals(3.5f, scanner.getTotalPrice(),0.1f);   
    }
    
    /**
     * Method test6: scan tag and print overview
     * Don't worry about the details of this test code!
     * The gist of it is that it checks whether you wrote the correct strings to the console
     *
     * remove comment when all necessary code is available*/
    @Test
    public void test6()
    {
        Scanner scanner = new Scanner(0,5);
        Tag tag = new Tag(3,1f);
        scanner.scan(tag);
        
        PrintStream defaultSO = System.out;  
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        try
        {
            scanner.printOverview();
            BufferedReader br = new BufferedReader(new StringReader(baos.toString()));
            String result = br.readLine();
            assertTrue(result.startsWith("Total number of tags scanned: 1"));
            result = br.readLine();
            assertTrue(result.startsWith("Total price: 1.0"));
        } 
        catch(Exception e)
        {
            System.setOut(defaultSO);
            System.out.println("Error while redirection System.out");
        }
        System.setOut(defaultSO);        
    } 
    
}
