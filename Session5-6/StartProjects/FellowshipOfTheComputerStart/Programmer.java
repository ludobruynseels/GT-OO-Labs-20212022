
/**
 * Write a description of class Programmer here.
 *
 * @author Karsten
 * @version 1.0
 */
public class Programmer
{
    // instance variables - replace the example below with your own
    private String name;
    private Computer myComputer;
    private String password;

    /**
     * Constructor for objects of class Programmer
     */
    public Programmer(String myName, String myPass)

    {
        // initialise instance variables
        name=myName;
        password=myPass;
        myComputer= null; //We set the value of the computer to null here. Null is the equivalent of "nothing" in programming. 
        // Calling functions on objects that are null can cause the famous nullPointerException. An error that shuts down your program and you'll surely encounter multiple times during this course.
    }

    public void brag()
    {
        int i=0;
        if (myComputer == null) {
            System.out.println("I don't have a computer yet.");
        }
        else if (myComputer.getRam()>4) {
            System.out.println("I have a "+myComputer.getBrand()); 
        }
    }
    

    public void buildComputer()
    {
        myComputer = new Computer("Dell", 8, 512);  //This line creates a new object of the Computer Class with the parameters given. 
        // This is similar as you would make one yourself in BlueJ by right clicking the class. 
    }

    public void makeJavaProgram(int amount)
    {
        if(myComputer == null) //Check whether we have a computer. This part protects us from creating nullpointerexceptions
        {
            System.out.println("I don't have a computer yet."); 
        }
        else
        {
            for(int i = 0; i<=amount; i++) 
            {
                //This is a for loop, a for loop consists of three parts.
                // 1. Initialization: int i=0. This part define what has to be done before starting the loop. In this case, we make an int i and set it to 0.
                // 2. Condition: i<= amount. This part defines how long the loop executes. In this case, as long as i is smaller or equal to amount.
                // 3. Iteration: i++. This part defines what has to be done at the end of each loop. In this case, we increment (add 1) to i.

                System.out.println("Currently making program number "+i);
                myComputer.program();
            }
        }
    }

    public String getPassword()
    {
        return password;
    }

    public void turnOnComputer()
    {
        if(myComputer != null)
        {
            if(myComputer.getPower() == false)
            {
                myComputer.pressPowerSwitch();
            }
            else
            {
                System.out.println("The computer was already turned on you dummy");
            }

        }
    }

        public void turnOffComputer()
    {
        if(myComputer != null)
        {
            if(myComputer.getPower() == true)
            {
                myComputer.pressPowerSwitch();
            }
            else
            {
                System.out.println("The computer was already turned off.");
            }

        }
    }
    
    public void setComputer(Computer computer)
    {
        myComputer = computer;   
    }

    public Computer getComputer()
    {
        return myComputer;   
    }
}
