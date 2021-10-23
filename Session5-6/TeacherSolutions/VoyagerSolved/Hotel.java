
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

    public Hotel(String newName, double newPrice)
    {
        name = newName;
        price = newPrice;
    }

    public void setAcceptsCreditCards(boolean newAcceptsCreditCards){
        acceptsCreditCards = newAcceptsCreditCards;
    }

    public boolean getAcceptsCreditCards(){
        return acceptsCreditCards;
    }

    public double getPrice(){
        return price;
    }
    
    public String getName(){
        return name;
    }

    public void writeReview(String newReview, int newRating){
        if (0 <= newRating && newRating <= 5){
            review = newReview;
            rating = newRating;
        }
    }

    public String getReview(){
        return review;
    }
    
    public int getRating(){
        return rating;
    }

}
