import java.util.ArrayList;


public class Tent extends Place 
{
    private int yearOfConstruction;
    private ArrayList<String> extras;
    private static int tentPrice = 50;

    public Tent(String AccCode, int maxCapacity, int year) 
    {
        super(AccCode, maxCapacity);
        yearOfConstruction = year;
        extras = new ArrayList<String>();
    }

    /**
     * @return the yearOfConstruction
     */
    public int getYearOfConstruction() 
    {
        return yearOfConstruction;
    }

    /**
     * @param yearOfConstruction the yearOfConstruction to set
     */
    public void setYearOfConstruction(int yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public void addExtra(String newExtra)
    {
        extras.add(newExtra);
    }

    public ArrayList<String> getExtras()
    {
        return extras;
    }
    
    int calculatePrice(int start, int end)
    {
        int temp = tentPrice * (end - start);
        if (end - start >= 7)
            temp -= tentPrice * ((end - start)/7);
        return temp;
    }

}
