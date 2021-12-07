
public class Device
{
    private double value;
    private double min;
    private double max;
    private boolean hasJustBeenReset;
    private String unit;

    public Device(String newUnit)
    {
        hasJustBeenReset = true;
        unit = newUnit;
    }

    public void registerValue(double newValue){
        value = newValue;

        if(hasJustBeenReset){           
            min = newValue;
            max = newValue;
            hasJustBeenReset = false;
        }
        else {
            if(newValue < min){
                min = newValue;
            }
            if(newValue > max){
                max = newValue;
            }
        }       
    }

    public void reset(){
        hasJustBeenReset = true;
    }

    public void printGeneralInfo(){
        if (hasJustBeenReset){
            System.out.print("device does not contain meaningful measurements.\n");
        }
        else {
            System.out.print(value + unit + ", minimum was: " + min + unit + ", maximum was: " + max + unit + ".\n");
        }
    }
}
