public class Voyager
{
    private String name;
    private double budget;
    private Hotel hotel;
    
    public Voyager(String newName, double newBudget) {
        name = newName;
        budget = newBudget;
    }
    
    public String getName() {
        return name;
    }
    
    public double getBudget() {
        return budget;
    }
    
    public Hotel getHotel() {
        return hotel;
    }
    
    public void book(Hotel newHotel) {
        if (newHotel.getPrice() <= budget || newHotel.getAcceptsCreditCards()) {
        hotel = newHotel;
        }
    }
    
    public void review(String newReview, int newRating) {
        if (hotel != null) {
        hotel.writeReview(newReview, newRating);
        }
    }
    
    public void stayWithAFriend(String nameOfFriend) {
        hotel = new Hotel(nameOfFriend, 5);
    }
}
