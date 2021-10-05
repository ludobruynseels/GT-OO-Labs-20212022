

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * test class CircleTest - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class CircleTest
{
    private Circle circle1;
    private Square square1;
    private Triangle triangle1;
    private Person person1;

    
    
    
    

    /**
     * Constructor voor test class CircleTest
     */
    public CircleTest()
    {
    }

    /**
     * Opzetten van de test fixture.
     *
     * Aanroep voor elke test case method.
     */
    @BeforeEach
    public void setUp()
    {
        circle1 = new Circle();
        square1 = new Square();
        triangle1 = new Triangle();
        person1 = new Person();
        circle1.makeVisible();
        square1.makeVisible();
        triangle1.makeVisible();
        person1.makeVisible();
        circle1.moveRight();
        circle1.moveHorizontal(100);
    }

    /**
     * Verwijderen van de test fixture.
     *
     * Aanroep na elke test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
