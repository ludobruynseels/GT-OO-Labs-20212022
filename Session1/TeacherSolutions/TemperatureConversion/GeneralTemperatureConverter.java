

public class GeneralTemperatureConverter
{
    
    public GeneralTemperatureConverter()
    {
        
    }

    public void convert(float temperature, char unit) {
        if(unit == 'F'){
            float converted = 9*temperature/5+32;
            System.out.println("blabla " + converted);
        } 
        else if (unit == 'C') {
            float converted = 5*(temperature-32)/9;
            System.out.println("blabla " + converted);
        }
        else {
            System.out.println("ERROR: wrong unit");
        }
        
    }
}
