
/**
 * Sample class to show basic BlueJ functionality.
 */
public class MyFirstExample
{
    // Instance variables
    private String textToPrint;

    /**
     * Constructor for objects of class MyFirstExample
     */
    public MyFirstExample()
    {
        // Initialise instance variables
        textToPrint = "This is my first Java class.";
    }
    
    // Change textToPrint
    public void setTextToPrint(String newText)
    {
        textToPrint = newText;
    }
    
    // Print textToPrint to console.
    public void printText()
    {
        System.out.println(textToPrint);
    }
}
