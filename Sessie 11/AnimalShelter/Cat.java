public class Cat extends Animal
{
    private int mouseKills = 0;
    
    public Cat(String name, int age) {
        super(name, age);
    }
    
    public boolean isKillerCat() {
        return mouseKills > 0;
    }
    
    public void caughtMice(int amount) {
        mouseKills += amount;
    }
}
