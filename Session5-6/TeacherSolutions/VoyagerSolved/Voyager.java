public class Voyager
{

    private String name;
    private double budget;
    private Hotel hotel;

    public Voyager(String voyagerName, double voyagerBudget){

        name = voyagerName;
        budget = voyagerBudget;
    }

    public String getName(){
        return name;
    }

    public double getBudget(){
        return budget;
    }

    public Hotel getHotel(){
        return hotel;
    }

    public void book(Hotel newHotel){
        if(newHotel.getPrice() <= budget || newHotel.getAcceptsCreditCards())
            hotel = newHotel;
    }
    
    public void review(String reviewText, int score){
        if(hotel != null)
            hotel.writeReview(reviewText, score);
    }

    
    public void stayWithAFriend(String nameOfFriend){
        Hotel friendHotel = new Hotel(nameOfFriend, 5);
        book(friendHotel);
    }
    
}
