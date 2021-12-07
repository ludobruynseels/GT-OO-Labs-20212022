public class StaffMember
{
    private String name;
    private boolean indefiniteTermContract = false;
    
    public StaffMember(String newName)
    {
        name = newName ;
    }

    public void presentYourself(){
        System.out.print("Hello, my name is " + name);
        if(!indefiniteTermContract){
            System.out.print(" and I work here temporarily.\n");
        }
    }
    
    public String getName(){
        return name;
    }
    
    public void keep(){
        indefiniteTermContract = true;
    }
    
    public boolean hasIndefiniteTermContract(){
        return indefiniteTermContract;
    }
}
