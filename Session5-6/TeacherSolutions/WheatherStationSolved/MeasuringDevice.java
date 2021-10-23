
public class MeasuringDevice
{
    private int currentMeasurment;
    private int max;
    private int min;
    private String unit;
    private Boolean isFirstMeasurement;

    public MeasuringDevice(String unit)
    {
        this.unit = unit;
        isFirstMeasurement = true;
    }

    public void measure(int value)
    {
        currentMeasurment = value;

        if (isFirstMeasurement)
        {
            max = value;
            min = value;
            isFirstMeasurement = false;
        } 
        else 
        {
            if (value > max)
            {
                max = value;
            }
            if (value < min)
            {
                min = value;
            }
        }
    }

    public void reset()
    {
        currentMeasurment = 0;
        max = 0;
        min = 0;
        isFirstMeasurement = true;
    }
    
    public void printInfo()
    {
        System.out.println("Max is " + max + unit + " min is " + min + unit );
    }
    
    public int getMax() 
    {
        return max; 
    }
    
    public int getMin() 
    {
        return min; 
    }
    
    public String getUnit()
    {
        return unit;
    }
}
