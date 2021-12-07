import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class AnimalShelter
{
    private ArrayList<Animal> animals = new ArrayList<Animal>();
    public AnimalShelter() {}
    
    public void addAnimal(Animal newAnimal) {
        animals.add(newAnimal);    
    }
    
    public int numberOfAnimals() {
        return animals.size();
    }
    
    public Animal makeAnimal(char animalType, String name, int age) {
        Animal result = null;
        
        switch (animalType) {
        case 'c' :
            result = new Cat(name, age);
            break;
        case 'd' :
            result = new Dog(name, age, false);
            break;
        default :
            result = new Animal(name, age);
            break;
            }
        
        return result;
    }
    
    public Animal getAnimalByName(String name) {
        Animal result = null;
        for (Animal a : animals) {
            if (a.getName().equals(name)) {
                result = a;
                break;
            }
        }
    return result;
    }
    
    public void readAnimalsFromFile(String fileName) {
        try {
            String name = "";
            char type = 'o';
            int age = 0;
            Animal newAnimal;
            Scanner sc = new Scanner(new File(fileName));  
            while (sc.hasNext()) 
            {
            String s = sc.next();  
            if (s.equals("cat"))
                type = 'c';
            if (s.equals("dog"))
                type = 'd';
                
            name = sc.next();
            s = sc.next();
            age = Integer.parseInt(s);

            newAnimal = this.makeAnimal(type, name, age);
            this.animals.add(newAnimal);
            }
            
        sc.close();
        }
        catch (FileNotFoundException fnfe) {
            System.out.println("File not found" + fnfe);
        } 
    }
}
