import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.StringReader;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CampingTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /*
     * Check constructor of Place
     */
    @Test
    public void test01() 
    {
        Place acc1 = new Place("P23", 6);
        assertEquals(6, acc1.getMaxNrPersons());
        assertEquals("P23", acc1.getCode());
    }


    /*
     * Check if accomodation is always free after construction
     *
    @Test
    public void test02() 
    {
        Place acc1 = new Place("P23", 6);
        assertEquals(true, acc1.isFree(0, 152));
    }
*/

    /*
     * Check if we can make/cancel a reservation.
     * Check that 'illegal' reservations/cancels cannot be made.
     * Check that reservations cannot overlap.
     *
    @Test
    public void test03() 
    {
        Place acc1 = new Place("P23", 6);
        acc1.makeReservation(13, 27);
        assertEquals(14, acc1.getNrOfDaysOccupied());
        assertEquals(true, acc1.isFree(0, 12));
        assertEquals(false, acc1.isFree(20, 22));
        assertEquals(false, acc1.isFree(0, 14));
        assertEquals(true, acc1.isFree(27, 123));
        acc1.cancelReservation(13, 15);
        assertEquals(true, acc1.isFree(0, 13));
        
        acc1.makeReservation(120, 160);
        assertEquals(12, acc1.getNrOfDaysOccupied());
        acc1.makeReservation(20, 16);
        assertEquals(12, acc1.getNrOfDaysOccupied());
        acc1.cancelReservation(27, 25);
        assertEquals(12, acc1.getNrOfDaysOccupied());
        acc1.makeReservation(25, 36);
        assertEquals(12, acc1.getNrOfDaysOccupied());
    }
*/

    /*
     * Check constructor of Camping
     *
    @Test
    public void test04() 
    {
        Camping cosmos = new Camping("Cosmos", "Zeedijk 1 - Oostende");
        assertEquals("Cosmos", cosmos.getName());
        assertEquals("Zeedijk 1 - Oostende", cosmos.getAddress());
        assertEquals(0, cosmos.getNrOfPlaces());
    }
*/

    /*
     * Check if we can add accomodations, places with same code cannot be added twice
     *
    @Test
    public void test05() 
    {
        Place acc1 = new Place("P23", 6);
        Place acc2 = new Place("T1", 4);
        Camping cosmos = new Camping("Cosmos", "Zeedijk 1 - Oostende");
        cosmos.addPlace(acc2);
        cosmos.addPlace(acc1);
        assertEquals(2, cosmos.getNrOfPlaces());
        Place acc3 = new Place("T1", 12);
        cosmos.addPlace(acc3);
        assertEquals(2, cosmos.getNrOfPlaces());
        acc3.setCode("T2");
        cosmos.addPlace(acc3);
        assertEquals(3, cosmos.getNrOfPlaces());
    }
*/

    /*
     * Check if we find a place with a given code
     *
    @Test
    public void test06() 
    {
        Place acc1 = new Place("P23", 6);
        Place acc2 = new Place("T1", 4);
        Place acc3 = new Place("T2", 12);
        Camping cosmos = new Camping("Cosmos", "Zeedijk 1 - Oostende");
        cosmos.addPlace(acc2);
        cosmos.addPlace(acc1);
        cosmos.addPlace(acc3);
        assertEquals(acc1, cosmos.findPlace("P23"));
        assertNull(cosmos.findPlace("T3"));
    }
*/

    /*
     * Check if we can get a list of all free accomodations in a certain period
     *
    @Test
    public void test07() 
    {
        Place acc1 = new Place("P23", 6);
        Place acc2 = new Place("T1", 4);
        Place acc3 = new Place("T13", 8);
        Camping cosmos = new Camping("Cosmos", "Zeedijk 1 - Oostende");
        cosmos.addPlace(acc2);
        cosmos.addPlace(acc1);
        cosmos.addPlace(acc3);
        acc1.makeReservation(0, 30);
        acc2.makeReservation(31, 60);
        ArrayList<Place> result = cosmos.getListFree(28, 32);
        assertEquals(1, result.size());
        assertEquals(acc3, result.get(0));
        result = cosmos.getListFree(28, 30);
        assertEquals(2, result.size());
        assertEquals(acc2, result.get(0));
    }
*/

    /*
     * Check if we can import reservations already made from a file
     *      valid.txt contains 4 correct reservations
     *      invalid.txt has an error on the 3rd reservation
     *
    @Test
    public void test08() 
    {
        Place acc1 = new Place("P23", 6);
        Place acc2 = new Place("T1", 4);
        Place acc3 = new Place("T13", 8);
        Place acc4 = new Place("T14", 12);
        Place acc5 = new Place("T15", 12);
        Camping cosmos = new Camping("Cosmos", "Zeedijk 1 - Oostende");
        cosmos.addPlace(acc2);
        cosmos.addPlace(acc1);
        cosmos.addPlace(acc3);
        cosmos.addPlace(acc4);
        cosmos.addPlace(acc5);
        assertEquals(4, cosmos.importReservations("valid.txt"));
        assertEquals(28, acc2.getNrOfDaysOccupied());
        assertEquals(-2, cosmos.importReservations("invalid.txt"));
                
    }
*/

    /*
     * Check if we remove can all accomodations where code starts with a given string
     *
    @Test
    public void test09() 
    {
        Place acc1 = new Place("P23", 6);
        Place acc2 = new Place("T2", 4);
        Place acc3 = new Place("T13", 8);
        Place acc4 = new Place("T14", 12);
        Place acc5 = new Place("T15", 12);
        Camping cosmos = new Camping("Cosmos", "Zeedijk 1 - Oostende");
        cosmos.addPlace(acc2);
        cosmos.addPlace(acc1);
        cosmos.addPlace(acc3);
        cosmos.addPlace(acc4);
        cosmos.addPlace(acc5);
        cosmos.removeAllWithCodeStart("T1");
        assertEquals(2, cosmos.getNrOfPlaces());
    }
*/

    /*
     * Check if we can get a list of all places ordered by popularity (=number of days with reservation)
     *      least popular first
     *
    @Test
    public void test10() 
    {
        Place acc1 = new Place("P23", 6);
        Place acc2 = new Place("T2", 4);
        Place acc3 = new Place("T13", 8);
        Place acc4 = new Place("T14", 12);
        Place acc5 = new Place("T15", 12);
        Camping cosmos = new Camping("Cosmos", "Zeedijk 1 - Oostende");
        cosmos.addPlace(acc2);
        cosmos.addPlace(acc1);
        cosmos.addPlace(acc3);
        cosmos.addPlace(acc4);
        cosmos.addPlace(acc5);
        acc1.makeReservation(0, 30);
        acc1.makeReservation(65, 68);
        acc2.makeReservation(100, 120);
        acc2.makeReservation(65, 68);
        acc3.makeReservation(99, 100);
        acc3.makeReservation(105, 108);
        acc3.makeReservation(7, 8);
        acc4.makeReservation(5, 68);
        acc5.makeReservation(0, 0);
        acc5.makeReservation(65, 68);
        acc5.makeReservation(7, 9);
        acc5.makeReservation(65, 68);
        ArrayList<Place> result = cosmos.getPopularyList();
        assertEquals(acc3, result.get(0));
        assertEquals(acc4, result.get(4));
    }
*/
    
    /*
     * Check if we can store a collection with Pitches and Tents
     * Tents should have the possibility to store a list of all "extras" added 
     *
    @Test
    public void test11() 
    {
        Pitch acc1 = new Pitch("P23", 6, true);
        Tent acc2 = new Tent("T1", 4, 2012);
        Camping cosmos = new Camping("Cosmos", "Zeedijk 1 - Oostende");
        cosmos.addPlace(acc2);
        cosmos.addPlace(acc1);
        acc1.makeReservation(0, 30);
        acc2.makeReservation(31, 60);
        acc2.addExtra("microwave");
        acc2.addExtra("barbecue");
        assertEquals(2, cosmos.getNrOfPlaces());
        ArrayList<String> result = acc2.getExtras();
        assertEquals(2, result.size());
        }
*/
        
    /*
     * Check if we can calculate correct prices for Pitches and Tents
     *
    @Test
    public void test12() 
    {
        Place acc1 = new Pitch("P23", 6, true);
        Place acc2 = new Tent("T2", 4, 2012);
        assertEquals(36, acc1.calculatePrice(1, 4));
        assertEquals(150, acc2.calculatePrice(1, 4));
        assertEquals(650, acc2.calculatePrice(10, 25));
    }
*/
    
    /*
     * check if we can make a reservation in multiple places if there is no single place available for
     * a wanted period
     *
    @Test
    public void test13() 
    {
        Place acc1 = new Pitch("P23", 6, true);
        Place acc2 = new Tent("T2", 4, 2012);
        Place acc3 = new Tent("T13", 8, 2010);
        Camping cosmos = new Camping("Cosmos", "Zeedijk 1 - Oostende");
        cosmos.addPlace(acc2);
        cosmos.addPlace(acc1);
        cosmos.addPlace(acc3);
        acc1.makeReservation(0, 10);
        acc2.makeReservation(11, 13);
        acc3.makeReservation(15, 17);
        int result = cosmos.tryReservation(0, 20);
        assertEquals(2, result);
    }
*/
}
