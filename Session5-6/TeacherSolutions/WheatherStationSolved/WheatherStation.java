
public class WheatherStation
{
    private MeasuringDevice thermo;
    private MeasuringDevice baro;

    public WheatherStation()
    {
        thermo = new MeasuringDevice("°C");
        baro = new MeasuringDevice("hPa");
    }

    public void measureAll(int temperature, int pressure)
    {
        thermo.measure(temperature);
        baro.measure(pressure);
    }

    public void resetAll()
    {
        thermo.reset();
        baro.reset();
    }
    
    public void printAll()
    {
        thermo.printInfo();
        baro.printInfo();
    }
    
    public void printAlternative()
    {
        System.out.println("Max temp is " + thermo.getMax() + thermo.getUnit());
        System.out.println("Min temp is " + thermo.getMin() + thermo.getUnit());
        System.out.println("Max druk is " + baro.getMax() + baro.getUnit());
        System.out.println("Max druk is " + baro.getMin() + baro.getUnit());
    }
}
