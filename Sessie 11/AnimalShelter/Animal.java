
public class Animal
{
    private int age;
    private String name;
    
    public Animal(String newName, int newAge) {
    age = newAge;
    name = newName;
    }
    
    public void celebrateBirthday() {
        age++;
    }
    
    public int getAge() {
    return age;
    }
    
    public String getName() {
    return name;
    }
}
