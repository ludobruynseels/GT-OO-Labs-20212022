 



public class Teacher extends StaffMember
{
    private int hours;
    
    public Teacher(String newName, int newHours)
    {
        super(newName);
        hours = newHours;
    }

    public int getHours(){
        return hours;
    }
    
    public void setHours(int newHours){
        hours = newHours;
    }
}
