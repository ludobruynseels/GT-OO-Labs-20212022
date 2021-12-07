
/**
 * class Barometer - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class Barometer  extends Device
{
    private int height;
    /**
     * Constructor voor objects van class Barometer
     */
    public Barometer(int newHeight)
    {
        super("hPa");
        height = newHeight;
    }

}
