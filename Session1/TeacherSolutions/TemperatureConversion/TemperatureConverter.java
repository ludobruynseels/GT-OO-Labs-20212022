
public class TemperatureConverter
{
    // instance variables - replace the example below with your own
    private char convertsTo;

    
    public TemperatureConverter(char unit)
    {
        convertsTo = 'C';
        if(unit == 'F')
            convertsTo = 'F';
    }
    
    public void convert(float temperature) {
        if(convertsTo == 'F'){
            float converted = 9*temperature/5+32;
            System.out.println("blabla " + converted);
        } 
        else {
            float converted = 5*(temperature-32)/9;
            System.out.println("blabla " + converted);
        }
        
    }

    
}
