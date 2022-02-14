

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ProgrammerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ProgrammerTest
{
    /**
     * Default constructor for test class ProgrammerTest
     */
    public ProgrammerTest()
    {
    }

    @Test
    public void accessibilityOfFunctions()
    {
      Programmer p1 = new Programmer("Jeroen", "secret");
      Programmer p2 = new Programmer("Gil", "evenMoreSecret");
      System.out.println(p1.getPassword());
      System.out.println(p2.getPassword());
    }
}
