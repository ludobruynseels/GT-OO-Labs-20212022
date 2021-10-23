
public class Tag
{
    private int id;
    private double price;
    private boolean payStatus;

    public Tag(int id, double price)
    {
        this.id = id;
        this.price = price;
    }
    
    public int getId()
    {
        return id;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public boolean getPayStatus()
    {
        return payStatus;
    }
    
    public void productPaid()
    {
        payStatus = true;
    }
}
