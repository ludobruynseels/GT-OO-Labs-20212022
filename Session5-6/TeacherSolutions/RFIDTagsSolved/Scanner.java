
public class Scanner
{
    private int min;
    private int max;
    private int nrOfProductsScanned;
    private double totalPrice;

    public Scanner(int min, int max)
    {
        if (min > max)
        {
            this.min = max;
            this.max = min;
        }
        else 
        {
            this.min = min;
            this.max = max;
        }
    }

    public int getMin()
    {
        return min;
    }

    public int getMax()
    {
        return max;
    }

    public int getNrOfProductsScanned()
    {
        return nrOfProductsScanned;
    }

    public double getTotalPrice()
    {
        return totalPrice;
    }

    public void scan(Tag tag)
    {
        if(tag.getId() <= max && tag.getId() >= min && !tag.getPayStatus())
        {
            tag.productPaid();
            totalPrice += tag.getPrice();
            nrOfProductsScanned++;
        }     
    }
    
    public void printOverview()
    {
        System.out.println("Total number of tags scanned: " + nrOfProductsScanned);
        System.out.println("Total price: 1.0" + totalPrice);
    }
}
