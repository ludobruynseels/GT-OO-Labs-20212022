
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Calendar;

public class ClubTest {

    private final String FILENAME_MEMBERS = "members.txt";
    private final String FILENAME_CONTRIBUTIONS = "contributions.txt";

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * check constructor of Club, number of members should be 0
     *
    @Test
    public void test01()
    {
    Club team = new Club("The red Devils", 300.0);
    assertEquals(0, team.getNrOfMembers());
    assertEquals("The red Devils", team.getClubName());
    }
     */
    /**
     * add unique members to Club
     *
    @Test
    public void test02()
    {
    Club team = new Club("The red Devils", 300.0);
    Member captain = new Member("Eden", "Hazard", "eden@hazard.com", 2, 2004);
    team.addMember(captain);
    Member keeper = new Member("Thibaut", "Courtois", "numberone@reddevils.be", 11, 2011);
    team.addMember(keeper);
    assertEquals(2, team.getNrOfMembers());
    Member alias1 = new Member("Eden", "Hazard", "eden@hazard.com", 12, 2015);
    team.addMember(alias1); // same surname and firstname
    assertEquals(2, team.getNrOfMembers());
    Member alias2 = new Member("Eden", "Van Asch", "eden@kuleuven.be", 10, 2019);
    team.addMember(alias2); // same firstname
    Member alias3 = new Member("Anna", "Hazard", "anna.haz@gmail.com", 2021, 1);
    team.addMember(alias3); // same surname
    assertEquals(4, team.getNrOfMembers());
    }
     */
    /**
     * populate club with info stored in FILENAME_MEMBERS file
     *
    @Test
    public void test03()
    {
    Club team = new Club("The red Devils", 300.0);
    assertEquals(0, team.getNrOfMembers());
    team.populateFromFile(FILENAME_MEMBERS);
    assertEquals(6, team.getNrOfMembers());
    Club groepT = new Club("Groep T Students", 456.0);
    groepT.populateFromFile(FILENAME_MEMBERS);
    assertEquals(1, groepT.getNrOfMembers());
    }
     */
    /**
     * check showOverview
     *
    @Test
    public void test04()
    {
    Club team = new Club("The red Devils", 300.0);
    team.populateFromFile(FILENAME_MEMBERS);
    team.showOverview();
    PrintStream defaultSO = System.out;
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(baos));
    String result = null;
    try
    {
    team.showOverview();
    BufferedReader br = new BufferedReader(new StringReader(baos.toString()));
    result = br.readLine();
    //use startsWith() because later on we will add info about month name and contribution
    assertTrue(result.startsWith("Overview of all members of club The red Devils"));
    result = br.readLine();
    System.out.println(result);
    assertTrue(result.startsWith("Member: firstName=Dries, lastName=Mertens, eMail=dries@napoli.it joined the club in"));
    }
    catch(Exception e)
    {
    System.setOut(defaultSO);
    System.out.println("Error while redirection System.out");
    }
    System.setOut(defaultSO);
    }
     */
    /**
     * check joined in year
     *
    @Test
    public void test05()
    {
    Club team = new Club("The red Devils", 300.0);
    team.populateFromFile(FILENAME_MEMBERS);
    assertEquals(2, team.joinedInYear(2011));
    assertEquals(2, team.joinedInYear(2004));
    assertEquals(0, team.joinedInYear(2012));
    }
     */
    /**
     * check if there is a member with given last name
     *
    @Test
    public void test06()
    {
    Club team = new Club("The red Devils", 300.0);
    team.populateFromFile(FILENAME_MEMBERS);
    assertEquals(true, team.isMember("Courtois"));
    assertEquals(false, team.isMember("Borre"));
    assertEquals(false, team.isMember(""));
    }
     */
    /**
     * remove members who started in a given year
     *
    @Test
    public void test07()
    {
    Club team = new Club("The red Devils", 300.0);
    team.populateFromFile(FILENAME_MEMBERS);
    ArrayList<Member> gone = team.removeMembersFromYear(2010);
    assertEquals(2, gone.size());
    assertEquals("De Bruyne", gone.get(1).getLastName());
    assertEquals("Lukaku", gone.get(0).getLastName());
    assertEquals(4, team.getNrOfMembers());
    }
     */
    /**
     * check alphabetical overview
     *
    @Test
    public void test08()
    {
    Club team = new Club("The red Devils", 300.0);
    team.populateFromFile(FILENAME_MEMBERS);
    team.showSortedNames();
    PrintStream defaultSO = System.out;
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(baos));
    try
    {
    team.showSortedNames();
    BufferedReader br = new BufferedReader(new StringReader(baos.toString()));
    String result = br.readLine();
    assertEquals("Courtois", result);
    result = br.readLine();
    assertEquals("De Bruyne", result);
    }
    catch(Exception e)
    {
    System.setOut(defaultSO);
    System.out.println("Error while redirection System.out");
    }
    System.setOut(defaultSO);
    }
     */
    /**
     * check showOverviewFull with month names instead of numbers
     *
    @Test
    public void test09()
    {
    Club team = new Club("The red Devils", 300.0);
    Member captain = new Member("Eden", "Hazard", "eden@hazard.com", 2, 2004);
    team.addMember(captain);
    Member keeper = new Member("Thibaut", "Courtois", "numberone@reddevils.be", 11, 2011);
    team.addMember(keeper);
    team.showOverviewFull();
    PrintStream defaultSO = System.out;
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(baos));
    try
    {
    team.showOverviewFull();
    BufferedReader br = new BufferedReader(new StringReader(baos.toString()));
    String result = br.readLine();
    //use contains to see if name of month is written to screen
    assertTrue(result.startsWith("Overview of all members of club The red Devils"));
    result = br.readLine();
    assertTrue(result.contains("February"));
    }
    catch(Exception e)
    {
    System.setOut(defaultSO);
    System.out.println("Error while redirection System.out");
    }
    System.setOut(defaultSO);
    }
     */
    /**
     * check calculation of contributions
     * This test will work as long as you run it in 2020 or 2021
     *
    @Test
    public void test10()
    {
    Club team = new Club("The red Devils", 300.0);
    Member captain = new Member("Eden", "Hazard", "eden@hazard.com", 2, 2004);
    team.addMember(captain);
    Member keeper = new Member("Thibaut", "Courtois", "numberone@reddevils.be", 11, 2013);
    team.addMember(keeper);
    Member back = new Member("Anthony", "Vanden Borre", "tony@reddevils.be", 4, 2004);
    team.addMember(back);
    Member everywhere = new Member("Kevin", "De Bruyne", "thekid@kids.kid", 8, 2010);
    team.addMember(everywhere);
    Member goalgetter = new Member("Romelu", "Lukaku", "bueno@ferrero.com", 8, 2010);
    team.addMember(goalgetter);
    team.assignContributions();
    int yearNow = LocalDate.now().getYear();

    assertEquals(300.0-30.0*(yearNow - keeper.getYear()), keeper.getContribution(), 0.1);

    assertEquals(0.0, captain.getContribution(), 0.1);
    }
     */
    /**
     * check payStatus of contributions
     *
    @Test
    public void test11()
    {
    Club team = new Club("The red Devils", 300.0);
    Member captain = new Member("Eden", "Hazard", "eden@hazard.com", 2, 2004);
    team.addMember(captain);
    Member keeper = new Member("Thibaut", "Courtois", "numberone@reddevils.be", 11, 2020);
    team.addMember(keeper);
    Member back = new Member("Anthony", "Vanden Borre", "tony@reddevils.be", 4, 2004);
    team.addMember(back);
    Member everywhere = new Member("Kevin", "De Bruyne", "thekid@kids.kid", 8, 2010);
    team.addMember(everywhere);
    Member goalgetter = new Member("Romelu", "Lukaku", "bueno@ferrero.com", 8, 2010);
    team.addMember(goalgetter);
    team.assignContributions();
    double toPay = keeper.getContribution();
    assertEquals(false, keeper.getPayStatus());
    keeper.pay(toPay - 10.0);
    assertEquals(false, keeper.getPayStatus());
    keeper.pay(10.0);
    assertEquals(true, keeper.getPayStatus());
    }
     */
    /**
     * generate list with email addresses of everyone who still has to pay
     * 
     *
    @Test
    public void test12()
    {
    Club team = new Club("The red Devils", 300.0);
    Member captain = new Member("Eden", "Hazard", "eden@hazard.com", 2, 2004);
    team.addMember(captain);
    Member keeper = new Member("Thibaut", "Courtois", "numberone@reddevils.be", 11, 2011);
    team.addMember(keeper);
    Member back = new Member("Anthony", "Vanden Borre", "tony@reddevils.be", 4, 2004);
    team.addMember(back);
    Member everywhere = new Member("Kevin", "De Bruyne", "thekid@kids.kid", 8, 2010);
    team.addMember(everywhere);
    Member goalgetter = new Member("Romelu", "Lukaku", "bueno@ferrero.com", 8, 2018);
    team.addMember(goalgetter);
    team.assignContributions();
    keeper.pay(300.0);
    everywhere.pay(300.0);
    ArrayList<String> mailAddresses = team.createEmailListOfNotPaid();
    assertEquals(1, mailAddresses.size());
    assertEquals("bueno@ferrero.com", mailAddresses.get(0));
    goalgetter.pay(300.0);
    mailAddresses = team.createEmailListOfNotPaid();
    assertEquals(0, mailAddresses.size());
    }
     */

    /**
     * update contributions of the members of the club with info stored in a textfile in format
     * firstname(String);lastname(String);date(yyyy-mm-dd); contribution(double);
     * use "contributions.txt"
     *
    @Test
    public void test13()
    {
    Club team = new Club("The red Devils", 300.0);
    assertEquals(0, team.getNrOfMembers());
    Member captain = new Member("Eden", "Hazard", "eden@hazard.com", 2, 2020);
    team.addMember(captain);
    Member forward = new Member("Dries", "Mertens", "driesje@reddevils.be", 4, 2010);
    team.addMember(forward);
    Member everywhere = new Member("Kevin", "De Bruyne", "thekid@kids.kid", 8, 2010);
    team.addMember(everywhere);
    team.assignContributions();
    double contribCaptain = captain.getContribution();
    double contribEverywhere = everywhere.getContribution();
    double contribForward = forward.getContribution();
    team.processContributionsFromFile(FILENAME_CONTRIBUTIONS);
    contribCaptain = assignContrib(contribCaptain-15.5); // eliminate value < 0
    contribEverywhere = assignContrib(contribEverywhere-46);
    assertEquals(contribCaptain, captain.getContribution(), 0.1);
    assertEquals(contribEverywhere, everywhere.getContribution(), 0.1);
    assertEquals(contribForward, forward.getContribution(), 0.1);
    }
     */
    /**
     * Method to check for negative contributions (should become 0)
     * @param contribution the contribution to be payed (can be < 0)
     * @return the contribution or 0.0
     */
    private double assignContrib(double contribution)
    {
        return contribution < 0.0 ? 0.0 : contribution;
    }

    /**
     * overload constructor of Member without month and year, use current date (from java.util.LocalDate)
     *
    @Test
    public void test14()
    {
    Club team = new Club("The red Devils", 300.0);
    Member latest = new Member("De Ketelaere", "Charles", "charles.deketelaere@fcb.be");
    // old style Calendar is used, so we do not give away the (better) solution with LocalDate
    Calendar today = Calendar.getInstance();
    System.out.println(today);
    System.out.println(today.get(Calendar.MONTH));
    assertEquals(today.get(Calendar.YEAR), latest.getYear());
    assertEquals(today.get(Calendar.MONTH) + 1, latest.getMonth());
    team.addMember(latest);
    assertEquals(1, team.getNrOfMembers());
    }
     */

    /**
     * Test for ArrayList of long life club members
     *
    @Test
    public void test15()
    {
    Club team = new Club("The darts club", 250.0);
    assertNull(team.longLifeMembers());
    team.addMember(new Member("Rob", "Cross", "rob@cross.be", 1, 2000));
    team.addMember(new Member("Michael", "Van Gerwen", "mvg@pdc.com", 1, 2001));
    assertEquals(1, team.longLifeMembers().size());
    assertEquals("Cross", team.longLifeMembers().get(0).getLastName());
    team.addMember(new Member("Dimitri", "Vanden Bergh", "dancingdimi@gmail.com", 5, 1999));
    assertEquals(1, team.longLifeMembers().size());
    assertEquals("Vanden Bergh", team.longLifeMembers().get(0).getLastName());
    team.addMember(new Member("Jeff", "Nobody", "jeff@nobody.be", 1, 1900));
    team.addMember(new Member("Jose", "de Sousa", "jose@portugal.po", 1, 2000));
    assertEquals(1, team.longLifeMembers().size());
    assertEquals("Nobody", team.longLifeMembers().get(0).getLastName());
    team.addMember(new Member("Jeff", "Bobdy", "jeff@bobdy.be", 1, 1900));
    assertEquals(2, team.longLifeMembers().size());
    assertEquals("Nobody", team.longLifeMembers().get(0).getLastName());
    assertEquals("Bobdy", team.longLifeMembers().get(1).getLastName());
    team.addMember(new Member("Jeff", "Nobdy", "jeff@nobdy.be", 1, 1900));
    assertEquals(3, team.longLifeMembers().size());
    }
     */
}
