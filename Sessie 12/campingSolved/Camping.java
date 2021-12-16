import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Camping 
{
    private String name;
    private String address;
    private ArrayList<Place> places;

    public Camping(String campName, String campAddress) 
    {
        name = campName;
        address = campAddress;
        places = new ArrayList<Place>();
    }

    /**
     * @return the name
     */
    public String getName() 
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) 
    {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() 
    {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public void addPlace(Place newAcc)
    {
        if (!places.contains(newAcc))
            places.add(newAcc);
    }

    public int getNrOfPlaces()
    {
        return places.size();
    }

    public Place findPlace(String code)
    {
        for (Place place : places)
        {
            if (place.getCode().equals(code))
                return place;
        }
        return null;
    }

    public ArrayList<Place> getListFree(int startDay, int endDay)
    {
        ArrayList<Place> result = new ArrayList<Place>();
        for (Place place : places)
        {
            if (place.isFree(startDay, endDay))
            {
                result.add(place);
            }
        }
        return result;
    }

    public void removeAllWithCodeStart(String start)
    {
        Iterator<Place> it = places.iterator();
        while (it.hasNext())
        {
            Place place = it.next();
            if (place.getCode().startsWith(start))
            {
                it.remove();
            }
        }
    }

    public ArrayList<Place> getPopularyList()
    {
        ArrayList<Place> result = new ArrayList<Place>();
        for (int nrofReservations = 0; nrofReservations < 153; nrofReservations++)
        {
            for (Place place : places)
            {
                if(place.getNrOfDaysOccupied() == nrofReservations)
                {
                    result.add(place);
                }
            }
        }
        return result;
    }

    public int importReservations(String fileName)
    {
        int counter = 0;
        try
        {
            Scanner sc = new Scanner(new File(fileName));
            while (sc.hasNext()) 
            {    
                String placeCode = sc.next(); 
                int start = sc.nextInt();
                int end =  sc.nextInt();
                Place place = findPlace(placeCode);
                if (place != null)
                {
                    place.makeReservation(start, end);
                    counter++;
                }
                else
                    return -counter;
            }
            sc.close();
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("File " + fileName + " not found");
        }
        return counter;
    }

    public int tryReservation(int startDay, int endDay)
    {
        int counter = 1;
        //try to find combination with least number of places
        //but sequential, start from first day, find longest available period...
        int finalDay = endDay;
        while (endDay >= startDay)
        {
            for (Place place : places)
            {
                if (place.isFree(startDay, endDay))
                {
                    place.makeReservation(startDay, endDay);
                    if (endDay == finalDay)
                    {
                        return counter;
                    }
                    counter++;
                    startDay = endDay+1;
                    endDay = finalDay+1;//compensate, because outer loop still does endDay--
                    break;
                }
            }
            endDay--;
        }
        return -1;
    }
}
