
/**
 * class Barrel - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class Barrel
{
    // instance variables - vervang deze door jouw variabelen
    private String liquor = "beer";
    private double content = 2.5;
    private double capacity = 10;

    /**
     * Constructor voor objects van class Barrel
     */
    public Barrel()
    {
      }
      
    public Barrel(String myLiquor, double myCapacity, double myContent) {
        liquor = myLiquor;
        capacity = myCapacity;
        content = myContent;
        }      
              
    public Barrel(String myLiquor, double myCapacity) {
        liquor = myLiquor;
        capacity = myCapacity;
        } 
        
    public String getLiquidType() {
        return liquor;
    }
    
    public void setLiquidType(String value) {
        liquor = value;
    }
    
    public double getContent() {
        return content;
    }
    
    public double getCapacity() {
        return capacity;
    }
}
