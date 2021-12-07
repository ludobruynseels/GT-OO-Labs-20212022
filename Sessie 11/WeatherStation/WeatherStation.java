

public class WeatherStation
{
    //private Barometer barometer;
    //private Thermometer thermometer;
    
    public WeatherStation(int height, double precision, boolean mercuryAllowed)
    {
        //barometer = new Barometer(height);
        //thermometer = new Thermometer("°C", mercuryAllowed, precision); // We decide to hard-code to always use °C...
    }

    public void register(double pressure, double temperature){
        //barometer.registerValue(pressure);
        //thermometer.registerValue(temperature);
    }
    
    public void resetAll(){
        //barometer.reset();
        //thermometer.reset();
    }
    
    public void printAll(){
        //barometer.printAllInfo();
        //thermometer.printAllInfo();
    }
}
