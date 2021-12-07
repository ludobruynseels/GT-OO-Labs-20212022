public class Dog extends Animal
{
        private boolean isWellTrained;
        
        public Dog(String name, int age, boolean newWellTrained) {
        super(name, age);
        isWellTrained = newWellTrained;
    }
    
    public boolean isWelltrained() {
        return isWellTrained;
    }
    
    public void train() {
        isWellTrained = true;
    }
}
