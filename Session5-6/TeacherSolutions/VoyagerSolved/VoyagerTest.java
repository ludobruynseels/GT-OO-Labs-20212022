import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.BufferedReader;
import java.io.StringReader;
import java.io.PrintStream;

/**
 * The test class VoyagerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class VoyagerTest
{
    /**
     * Default constructor for test class VoyagerTest
     */
    public VoyagerTest()
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
     * Method test01: create voyager object and check getters
     *
     * remove comment when all necessary code is available */
    @Test
    public void test01()
    {
        Voyager voyager1 = new Voyager("Felix", 100);
        assertEquals("Felix", voyager1.getName());
        assertEquals(100, voyager1.getBudget(), 0.1);
    }

    /**
     * Method test02: create Voyager object and check if Hotel attribute is set to null;
     *
     * remove comment when all necessary code is available */
    @Test
    public void test02()
    {
        Voyager voyager1 = new Voyager("Felix", 100);
        assertEquals(null, voyager1.getHotel());
    }

    /**
     * Method test03: test constructor and basic getters of Hotel class
     *
     * remove comment when all necessary code is available */
    @Test
    public void test03()
    {
        Hotel hotel1 = new Hotel("Métropole", 50);
        assertEquals("Métropole", hotel1.getName());
        assertEquals(50, hotel1.getPrice(), 0.1);
        assertFalse(hotel1.getAcceptsCreditCards());
    }

    /**
     * Method test04: test whether Hotels can accept credit cards
     *
     * remove comment when all necessary code is available */
    @Test
    public void test04()
    {
        Hotel hotel1 = new Hotel("Métropole", 50);
        hotel1.setAcceptsCreditCards(true);
        assertTrue(hotel1.getAcceptsCreditCards());
    }

    /**
     * Method test05: check if hotel is correctly set if budget large enough 
     * (note: accepting credit cards or not doesn't matter in this case!)
     * also checks whether you can change hotel correctly
     *
     * remove comment when all necessary code is available */
    @Test
    public void test05()
    {
        Voyager voyager1 = new Voyager("Felix", 100);
        Hotel hotel1 = new Hotel("Métropole", 50);
        hotel1.setAcceptsCreditCards(true);
        voyager1.book(hotel1);
        assertEquals("Métropole", voyager1.getHotel().getName());  
        
        Hotel hotel2 = new Hotel("Hilton", 80);
        voyager1.book(hotel2);
        assertEquals(80, voyager1.getHotel().getPrice(), 0.1);
    }

    /**
     * Method test06: check if hotel is refused if budget too small
     *
     * remove comment when all necessary code is available */
    @Test
    public void test06()
    {
        Voyager voyager1 = new Voyager("Felix", 10);
        Hotel hotel1 = new Hotel("Métropole", 50);
        voyager1.book(hotel1);
        assertEquals(null, voyager1.getHotel());     
    }

    /**
     * Method test07: check if hotel is correctely set if budget too small but the hotel accepts credit cards
     *
     * remove comment when all necessary code is available */
    @Test
    public void test07()
    {
        Voyager voyager1 = new Voyager("Felix", 10);
        Hotel hotel1 = new Hotel("Métropole", 50);
        hotel1.setAcceptsCreditCards(true);
        voyager1.book(hotel1);
        assertEquals("Métropole", voyager1.getHotel().getName());     
    }

    /**
     * Method test08: Test if review of hotel is correctly processed (ignoring review if rating is < 0 or > 5)
     *
     * remove comment when all necessary code is available */
    @Test
    public void test08()
    {
        Hotel hotel1 = new Hotel("Métropole", 50);
        hotel1.writeReview("It was nice!", 6);
        assertEquals(null, hotel1.getReview());
        assertEquals(0, hotel1.getRating());
        hotel1.writeReview("It was nice!", 5);
        assertEquals("It was nice!", hotel1.getReview());
        assertEquals(5, hotel1.getRating());
    }

    /**
     * Method test09: Test if voyager can correctly review hotel if set
     *
     * remove comment when all necessary code is available */
    @Test
    public void test09()
    {
        Hotel hotel1 = new Hotel("Métropole", 50);
        Voyager voyager1 = new Voyager("Felix", 100);
        voyager1.book(hotel1);
        voyager1.review("Meh", 3);
        assertEquals("Meh", hotel1.getReview());
        assertEquals(3, hotel1.getRating());
    }

    /**
     * Method test10: Test if reviewing is nullpointer safe
     *
     * remove comment when all necessary code is available */
    @Test
    public void test10()
    {
        Hotel hotel1 = new Hotel("Métropole", 50);
        Voyager voyager1 = new Voyager("Felix", 10);
        voyager1.book(hotel1);
        voyager1.review("Meh", 3);
        assertEquals(null, hotel1.getReview());
        assertEquals(0, hotel1.getRating());
        
        hotel1.setAcceptsCreditCards(true);
        voyager1.book(hotel1);
        voyager1.review("Meh", 3);
        assertEquals("Meh", hotel1.getReview());
        assertEquals(3, hotel1.getRating());
    }
    
    /**
     * Method test11: Test if reviewing is nullpointer safe
     *
     * remove comment when all necessary code is available */
    @Test
    public void test11()
    {
        Voyager voyager1 = new Voyager("Felix", 100);
        voyager1.stayWithAFriend("Anna");
        assertEquals("Anna", voyager1.getHotel().getName());
        assertEquals(5, voyager1.getHotel().getPrice(), 0.1);
    }
}


