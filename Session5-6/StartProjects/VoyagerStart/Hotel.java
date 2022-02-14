
/**
 * Write a description of class Hotel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hotel
{
    private String name;
    private boolean acceptsCreditCards;
    private double price;
    private String review;
    private int rating;
    
    public Hotel(String newName, double newPrice) {
        name = newName;
        price = newPrice;
    }

    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public boolean getAcceptsCreditCards() {
        return acceptsCreditCards;
    }
    
    public void setAcceptsCreditCards(boolean value) {
        acceptsCreditCards = value;
    }
    
    public void writeReview(String newReview, int newRating) {
        if (newRating > 1 && newRating <= 5) {
        review = newReview;
        rating = newRating;
        }
    }
    
    public String getReview() {
        return review;
    }
    
    public int getRating(){
        return rating;
    }
}
