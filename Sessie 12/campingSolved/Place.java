
public class Place 
{
    private String code;
    private int maxNrPersons;
    private boolean[] reservation;

    public Place(String accCode, int maxCapacity) 
    {
        code = accCode;
        maxNrPersons = maxCapacity;
        reservation = new boolean[152];
    }

    /**
     * @return the code
     */
    public String getCode() 
    {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) 
    {
        this.code = code;
    }

    /**
     * @return the maxNrPersons
     */
    public int getMaxNrPersons() 
    {
        return maxNrPersons;
    }

    /**
     * @param maxNrPersons the maxNrPersons to set
     */
    public void setMaxNrPersons(int maxNrPersons) 
    {
        this.maxNrPersons = maxNrPersons;
    }

    private boolean checkPeriod(int startDay, int endDay)
    {
        boolean result = (startDay >= 0 && startDay < 153);
        result &= (endDay >= 0 && endDay < 153);
        result &= (startDay < endDay);
        return result;
    }

    public boolean isFree(int startDay, int endDay)
    {
        if (checkPeriod(startDay, endDay))
        {
            for (int day = startDay; day < endDay; day++)
            {
                if (reservation[day] == true)
                    return false;
            }
            return true;
        }
        else
        {
            System.out.println("wrong period");
            return false;
        }
    }

    public void makeReservation(int startDay, int endDay)
    {
        if (checkPeriod(startDay, endDay) && isFree(startDay, endDay))
        {
            for (int day = startDay; day < endDay; day++)
            {
                reservation[day] = true;
            }
        }
        else
        {
            System.out.println("wrong period and/or not available any more");
        }
    }

    public void cancelReservation(int startDay, int endDay)
    {
        if (checkPeriod(startDay, endDay))
        {
            for (int day = startDay; day < endDay; day++)
            {
                reservation[day] = false;
            }
        }
        else
        {
            System.out.println("wrong period");
        }
    }

    public int getNrOfDaysOccupied()
    {
        int result = 0;
        for (int day = 0; day < reservation.length; day++)
        {
            if (reservation[day] == true)
                result++;
        }
        return result;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Place other = (Place) obj;
        if (code == null) {
            if (other.code != null)
                return false;
        } else if (!code.equals(other.code))
            return false;
        return true;
    }

    int calculatePrice(int start, int end)
    {
        return 0;
    }
}
