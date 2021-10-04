

public class GroupTStudent
{
    private String name;
    private int yearsAtGroupT;
    
    public GroupTStudent(String studentName)
    {
        name = studentName;
        yearsAtGroupT = 0;
    }
    
    public void addYear(){
        yearsAtGroupT++;
    }
    
    public void introduceMyself(){
        System.out.println("My name is " + name + " and I have been studying here for " + yearsAtGroupT + " years.");
    }

    
}
