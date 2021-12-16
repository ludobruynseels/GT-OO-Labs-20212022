
public class Pitch extends Place 
{
    private boolean electricityAvailable;
    private static int pitchPrice = 12;
    
    public Pitch(String AccCode, int maxCapacity, boolean elec)
    {
        super(AccCode, maxCapacity);
        electricityAvailable = elec;
    }

    int calculatePrice(int start, int end)
    {
        return pitchPrice * (end - start);
    }

}
