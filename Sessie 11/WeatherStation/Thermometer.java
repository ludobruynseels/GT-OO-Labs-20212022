
/**
 * class Thermometer - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class Thermometer extends Device
{
    private boolean mercuryAllowed;
    private double precision;
    /**
     * Constructor voor objects van class Thermometer
     */
    public Thermometer(String newUnit, boolean newMercuryAllowed, double newPrecision)
    {
        super(newUnit);
        mercuryAllowed = newMercuryAllowed;
        precision = newPrecision;
        // geef de instance variables een beginwaarde
    }

}
