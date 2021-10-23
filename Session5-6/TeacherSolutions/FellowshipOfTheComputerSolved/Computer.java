
/**
 * Write a description of class Computer here.
 *
 * @author Karsten
 * @version 1.0
 */
public class Computer
{
    // instance variables - replace the example below with your own
    private String brand;
    private int ram;
    private int storage;
    private boolean power;

    /**
     * Constructor for objects of class Computer
     */
    public Computer(String myBrand, int myRam, int storage)
    {
        // initialise instance variables
        brand=myBrand;
        ram = myRam;
        power = false;
        this.storage = storage; //remember, constructor parameters can have the same name as instance variables. But we have to specify which is which by putting this. before the instane variable.
    }

    public void program()
    {
      System.out.println("Beep boop beep");   
    }
    
    public void pressPowerSwitch()
    {
        if(power == false) //If else statement to toggle the power boolean
        {
            power = true;
            System.out.println("Turning on");
        }
        else
        {
            power = false;
            System.out.println("Powering Down");
        }
    }
    
    public boolean getPower()
    {
         return power;
    }
    
    public String getBrand()
    {
      return brand;   
    }
    
    public int getRam()
    {
      return ram;   
    }
    
    public int getStorage()
    {
      return storage;   
    }
    
    
}
