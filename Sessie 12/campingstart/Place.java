public class Place 
{
    private int maxNrPersons;
    private String code;
    
    public Place(String myCode, int myMaxNrPersons) {
    code =myCode;
    maxNrPersons = myMaxNrPersons;
    }   
    
    public int getMaxNrPersons() {
        return maxNrPersons;
    }
    public String getCode() {
        return code;
    }
}
