import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.BufferedReader;
import java.io.StringReader;
import java.io.PrintStream;

/**
 * The test class BarrelTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BarrelTest
{
    /**
     * Default constructor for test class BarrelTest
     */
    public BarrelTest()
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
     * check constructor with normal conditions
     * */
    @Test
    public void test1()
    {
        Barrel barrel1 = new Barrel("wine", 20.0, 5.2);
        assertEquals("wine", barrel1.getLiquidType());
        assertEquals(5.2, barrel1.getContent(), 0.1);
        assertEquals(20.0, barrel1.getCapacity(), 0.1);
    }

    /**
     * check constructor where content > capacity
     */
    @Test
    public void test2()
    {
        Barrel barrel1 = new Barrel("wine", 25.2, 20.0);
        assertEquals("wine", barrel1.getLiquidType());
        assertEquals(20.0, barrel1.getContent(), 0.1);
        assertEquals(25.2, barrel1.getCapacity(), 0.1);
    }

    /**
     * check constructor with only capacity (content is set to zero in this case)
     */
    @Test
    public void test3()
    {
        Barrel barrel1 = new Barrel("wine", 20.0);
        assertEquals("wine", barrel1.getLiquidType());
        assertEquals(2.5, barrel1.getContent(), 0.1);
        assertEquals(20.0, barrel1.getCapacity(), 0.1);
    }
   
    /**
     * Check setter for liquid type
     */
    @Test
    public void test4()
    {
        Barrel barrel1 = new Barrel("wine", 20.0);
        assertEquals("wine", barrel1.getLiquidType());
        barrel1.setLiquidType( "oil" );
        assertEquals("oil", barrel1.getLiquidType());
    }

    /**
     * check fill with normal conditions
     
    @Test
    public void test5()
    {
        Barrel barrel1 = new Barrel("wine", 20.0, 5.2);
        assertEquals(5.2, barrel1.getContent(), 0.1);
        assertEquals(20.0, barrel1.getCapacity(), 0.1);
        barrel1.fill(3.8);
        assertEquals(9.0, barrel1.getContent(), 0.1);
    }
*/
    /**
     * check fill with negative values (positive is used)
     *
    @Test
    public void test6()
    {
        Barrel barrel1 = new Barrel("wine", 20.0, 5.2);
        assertEquals(5.2, barrel1.getContent(), 0.1);
        assertEquals(20.0, barrel1.getCapacity(), 0.1);
        barrel1.fill(-3.8);
        assertEquals(9.0, barrel1.getContent(), 0.1);
    }
*/
    /**
     * check fill with overflow of capacity
     *
    @Test
    public void test7()
    {
        Barrel barrel1 = new Barrel("wine", 20.0, 5.2);
        assertEquals(5.2, barrel1.getContent(), 0.1);
        assertEquals(20.0, barrel1.getCapacity(), 0.1);
        barrel1.fill(23.8);
        assertEquals(20.0, barrel1.getContent(), 0.1);
    }
*/    
    /**
     * check consume with normal conditions
     *
    @Test
    public void test8()
    {
        Barrel barrel1 = new Barrel("wine", 20.0, 5.2);
        assertEquals(2.5, barrel1.consume(2.5), 0.1);
        assertEquals(2.7, barrel1.getContent(), 0.1);
    }
*/
    /**
     * check consume with not enough available
     *
    @Test
    public void test9()
    {
        Barrel barrel1 = new Barrel("wine", 20.0, 5.2);
        assertEquals(5.2, barrel1.consume(7.5), 0.1);
        assertEquals(0.0, barrel1.getContent(), 0.1);
    }
*/
    /**
     * check behaviour of method showInfo()
     *
    @Test
    public void test10()
    {
        Barrel barrel1 = new Barrel("wine", 20.0, 5.2);
        barrel1.showInfo();
        //output is now redirected to be able to check it
        //Be sure that your error message is exactly in the same format as expected (see assert on line 146)    
        PrintStream defaultSO = System.out;  
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        String result;
        System.setOut(new PrintStream(baos));
        try
        {
            barrel1.showInfo();
            BufferedReader br = new BufferedReader(new StringReader(baos.toString()));
            result = br.readLine();
            assertEquals( "Liquid type of the barrel = wine", result );
            result = br.readLine();
            assertEquals("Capacity of the barrel = 20.0", result);
            result = br.readLine();
            assertEquals("Current content = 5.2", result);
            br.close();
        } catch(Exception e)
        {
            System.setOut(defaultSO);
            System.out.println("Error while redirection System.out");
        }
        System.setOut(defaultSO);
    }
*/
    /**
     * check transfer with normal conditions
     *
    @Test
    public void test11()
    {
        Barrel barrel1 = new Barrel("wine", 20.0, 5.2);
        Barrel barrel2 = new Barrel("wine", 10.0);
        barrel1.transferLiquid(3.2, barrel2);
        assertEquals(2.0, barrel1.getContent(), 0.1);
        assertEquals(3.2, barrel2.getContent(), 0.1);
    }
*/
    /**
     * check transfer where you ask more than available
     *
    @Test
    public void test12()
    {
        Barrel barrel1 = new Barrel("wine", 20.0, 5.2);
        Barrel barrel2 = new Barrel("wine", 10.0);
        barrel1.transferLiquid(8.7, barrel2);
        assertEquals(0.0, barrel1.getContent(), 0.1);
        assertEquals(5.2, barrel2.getContent(), 0.1);
    }
*/
    /**
     * check transfer where you transfer more than capacity
     *
    @Test
    public void test13()
    {
        Barrel barrel1 = new Barrel("wine", 20.0, 15.2);
        Barrel barrel2 = new Barrel("wine", 10.0);
        barrel1.transferLiquid(13.2, barrel2);
        assertEquals(2.0, barrel1.getContent(), 0.1);
        assertEquals(10.0, barrel2.getContent(), 0.1);
    }
*/
}

