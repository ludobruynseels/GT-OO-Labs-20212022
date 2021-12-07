 



public class Desk
{
    private int deskNumber;
    private StaffMember staffMemberSittingHere;
    
    public Desk(int newDeskNumber)
    {
        deskNumber = newDeskNumber;
    }

    public void setStaffMemberSittingHere(StaffMember newSM){
        staffMemberSittingHere = newSM;
    }
    
    public boolean hasOccupant(){
        return (staffMemberSittingHere != null);
    }
    
    public String nameOfOccupant(){
        if (hasOccupant()){
            return staffMemberSittingHere.getName();
        }
        else {
            return "error - no one sitting here";
        }
    }
}
