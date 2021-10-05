

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CircleTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CircleTest
{
    private Circle circle1;
    private Circle frontWheel;
    private Circle backWheel;
    private Square body;
    private Square body2;
    private Square body3;

    /**
     * Default constructor for test class CircleTest
     */
    public CircleTest()
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
        circle1 = new Circle();
        circle1.makeVisible();
        frontWheel = new Circle();
        frontWheel.changeColor("red");
        frontWheel.makeVisible();
        frontWheel.changeSize(34);
        frontWheel.moveDown();
        frontWheel.moveDown();
        frontWheel.moveLeft();
        frontWheel.moveDown();
        backWheel = new Circle();
        backWheel.changeColor("red");
        backWheel.changeSize(34);
        backWheel.makeVisible();
        backWheel.moveRight();
        backWheel.moveRight();
        backWheel.moveRight();
        backWheel.moveDown();
        backWheel.moveDown();
        backWheel.moveDown();
        body = new Square();
        body.changeColor("black");
        body.makeVisible();
        body.moveLeft();
        body.moveLeft();
        body.moveLeft();
        body.moveLeft();
        body.moveLeft();
        body.changeSize(30);
        body.changeSize(45);
        body.moveLeft();
        body.moveRight();
        body2 = new Square();
        body2.changeColor("black");
        body2.changeSize(45);
        body2.makeVisible();
        body2.moveLeft();
        body2.moveLeft();
        body2.moveLeft();
        body3 = new Square();
        body3.changeColor("black");
        body3.makeVisible();
        body3.changeSize(45);
        body3.moveLeft();
        body3.moveLeft();
        backWheel.moveLeft();
        body3.moveRight();
        body3.moveLeft();
    }

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
