
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
    private Circle roof;
    private Circle frontWheel;
    private Circle backWheel;
    private Square body;
    private Square body2;
    private Square body3;

    public Car()
    {
        roof = new Circle();
        frontWheel = new Circle("green", 60, -20, 34    );
        backWheel = new Circle();
        body = new Square();
        body2 = new Square();
        body3 = new Square();
    }
        
    public void drawCar()
    {
       frontWheel.makeVisible();
        /* frontWheel.changeColor("red");
        
        frontWheel.changeSize(34);
        frontWheel.moveDown();
        frontWheel.moveDown();
        frontWheel.moveLeft();
        frontWheel.moveDown(); */
        
        backWheel.changeColor("red");
        backWheel.changeSize(34);
        backWheel.moveRight();
        backWheel.moveRight();
        backWheel.moveDown();
        backWheel.moveDown();
        backWheel.moveDown();
        
        body.changeColor("black");
        body.moveLeft();
        body.moveLeft();
        body.moveLeft();
        body.moveLeft();
        body.moveLeft();
        body.changeSize(30);
        body.changeSize(45);
        body.moveLeft();
        body.moveRight();
        
        body2.changeColor("black");
        body2.changeSize(45);
        body2.moveLeft();
        body2.moveLeft();
        body2.moveLeft();
        
        body3.changeColor("black");
        body3.changeSize(45);
        body3.moveLeft();
        body3.moveLeft();
        
        roof.makeVisible();
        backWheel.makeVisible();
        body.makeVisible();
        body2.makeVisible();
        body3.makeVisible();
    }

}
