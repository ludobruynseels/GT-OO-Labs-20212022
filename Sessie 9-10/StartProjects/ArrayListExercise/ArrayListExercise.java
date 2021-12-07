import java.util.ArrayList;

/**
 * Write a description of class ArrayListExercise here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayListExercise
{
    // instance variable myFriends, should be an ArrayList that can contain String objects
    private ArrayList<String> myFriends = new ArrayList<String>();

    /**
     * Constructor for objects of class ArrayListExercise
     */
    public ArrayListExercise()
    {
        // initialise myFriends

    }

    /**
     * Method to add the names of three friends at the end of the list in the order of the arguments
     *
     * @param friend1  name of friend 1
     * @param friend2   name of friend 2
     * @param friend3   name of friend 3
     * 
     */
    public void addFriends(String friend1, String friend2, String friend3)
    {
        myFriends.add(friend1);
        myFriends.add(friend2);
        myFriends.add(friend3);
    }

    /**
     * Method to print the content of myList, each element on a new line
     */

    public void printFriends() 
    {
        for (String f : myFriends) 
        {
            System.out.println(f);
        }

    }

    /**
     * Getter for myFriends
     */

    public ArrayList<String> getMyFriends() {
        return myFriends;
    }
    
    
    /**
     * Getter for size of MyFriends
     */

    public int getNrOfFriends()
    {
        // put your code here  
        return myFriends.size();
    }
    
    
    /**
     * Method to add an unique friend to myFriends
     */
    
    public void addUniqueFriend(String newFriend) 
    {
      if (!myFriends.contains(newFriend))
          myFriends.add(newFriend);
    } 
}
