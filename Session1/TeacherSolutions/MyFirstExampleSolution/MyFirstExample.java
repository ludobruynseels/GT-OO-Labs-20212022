
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
    
    public void printSum(int a, int b){
        System.out.println(a+b);
        // or: define int sum = a+b, print sum
    }
    
    public void prettyPrintSubstraction(int a, int b){
        System.out.println(a +" minus " + b + " equals " + (a-b));
        // or: define int difference = a-b etc.
    }
    
}
