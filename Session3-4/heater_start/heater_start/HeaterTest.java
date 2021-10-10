import java.io.ByteArrayOutputStream;
import java.io.BufferedReader;
import java.io.StringReader;
import java.io.PrintStream;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class HeaterTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class HeaterTest
{
    /**
     * Default constructor for test class HeaterTest
     */
    public HeaterTest()
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
     * check constructor with all valid parameters
     *
    @Test
    public void test1()
    {
        Heater heater1 = new Heater(18, 0, 25, 2);
        assertEquals(18, heater1.getTemperature());
    }
*/
    /**
     * check constructor with min and max inverted
     *
    @Test
    public void test2()
    {
        Heater heater1 = new Heater(18, 20, 5, 1);
        assertEquals(18, heater1.getTemperature());
        assertEquals(5, heater1.getMinTemperature());
        assertEquals(20, heater1.getMaxTemperature());
    }
*/
    /**
     * check constructor with min and max inverted and negative increment
     *
    @Test
    public void test3()
    {
        Heater heater1 = new Heater(18, 20, 5, -3);
        assertEquals(18, heater1.getTemperature());
        assertEquals(5, heater1.getMinTemperature());
        assertEquals(20, heater1.getMaxTemperature());
        assertEquals(3, heater1.getIncrement());
    }
*/
    /**
     * check constructor with min and max inverted, negative increment and initial value out of range
     *
    @Test
    public void test4()
    {
        Heater heater1 = new Heater(30, 20, 5, -3);
        assertEquals(12, heater1.getTemperature());
        assertEquals(5, heater1.getMinTemperature());
        assertEquals(20, heater1.getMaxTemperature());
        assertEquals(3, heater1.getIncrement());
    } 
*/
    /**
     * check behaviour of method warmer()
     *
    @Test
    public void test5()
    {
        Heater heater1 = new Heater(18, -2, 28, 2);
        assertEquals(18, heater1.getTemperature());
        heater1.warmer();
        assertEquals(20, heater1.getTemperature());
        heater1.warmer();
        heater1.warmer();
        heater1.warmer();
        heater1.warmer();
        heater1.warmer();
        assertEquals(28, heater1.getTemperature());       
    }    
*/
    /**
     * check behaviour of method cooler()
     *
    @Test
    public void test6()
    {
        Heater heater1 = new Heater(18, 0, 28, 5);
        assertEquals(18, heater1.getTemperature());
        heater1.cooler();
        assertEquals(13, heater1.getTemperature());
        heater1.cooler();
        heater1.cooler();
        heater1.cooler();
        assertEquals(0, heater1.getTemperature());       
    }
*/
    /**
     * check behaviour of method setIncr()
     *
    @Test
    public void test7()
    {
        Heater heater1 = new Heater(18, -2, 28, 2);
        heater1.setIncrement(5);
        heater1.warmer();
        assertEquals(23, heater1.getTemperature());
        heater1.setIncrement(-1);
        //output is now redirected to be able to check it
        //Be sure that your error message is exactly in the same format as expected (see assert on line 149)    
        PrintStream defaultSO = System.out;  
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        String result;
        System.setOut(new PrintStream(baos));
        try
        {
            heater1.setIncrement(-1);
            BufferedReader br = new BufferedReader(new StringReader(baos.toString()));
            result = br.readLine();
            assertEquals("Wrong value for increment", result);
            br.close();
        } catch(Exception e)
        {
            System.setOut(defaultSO);
            System.out.println("Error while redirection System.out");
        }
        System.setOut(defaultSO);
    }
    */
}

