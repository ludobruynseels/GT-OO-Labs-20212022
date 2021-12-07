

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class AnimalShelterTest
{
    
    public AnimalShelterTest()
    {
    }

        @BeforeEach
    public void setUp()
    {
    }

        @AfterEach
    public void tearDown()
    {
    }
    
    /**
     * Test Animal class
     *  
    @Test
    public void test01()
    {
        Animal a = new Animal("AdelineTheAnaspeptic", 5);
        assertEquals(5, a.getAge());
        a.celebrateBirthday();
        assertEquals(6, a.getAge());
        assertEquals("AdelineTheAnaspeptic", a.getName());
    }
    */
    
    /**
     * Test AnimalShelter class basic functionality
     *  
    @Test
    public void test02()
    {
        AnimalShelter aS = new AnimalShelter();
        Animal a = new Animal("AdelineTheAnaspeptic", 5);
        aS.addAnimal(a);
        assertEquals(1, aS.numberOfAnimals());
    }
    */
    
    /**
     * Test Cat class
     *  
    @Test
    public void test03()
    {
        Cat c = new Cat("FridaTheFeline", 10);
        assertEquals(10, c.getAge());
        assertFalse(c.isKillerCat());
        c.caughtMice(3);
        c.caughtMice(2);
        assertTrue(c.isKillerCat());
        AnimalShelter aS = new AnimalShelter();
        aS.addAnimal(c);
        assertEquals(1, aS.numberOfAnimals());
    }
    */
    
    /**
     * Test Dog class
     *  
    @Test
    public void test04()
    {
        Dog d = new Dog("HelmutTheHound", 6, false);
        assertEquals(6, d.getAge());
        assertFalse(d.isWelltrained());
        d.train();
        assertTrue(d.isWelltrained());
        AnimalShelter aS = new AnimalShelter();
        aS.addAnimal(d);
        assertEquals(1, aS.numberOfAnimals());
    }
    */
    
    /**
     * Test looking up Animal by name
     *  
    @Test
    public void test05()
    {
        AnimalShelter aS = new AnimalShelter();
        
        Animal a1 = new Cat("FridaTheFeline", 10);        
        Animal a2 = new Dog("HelmutTheHound", 6, true);
        Animal a3 = new Animal("JohnTheParrot", 66);
        aS.addAnimal(a1);
        aS.addAnimal(a2);
        aS.addAnimal(a3);
        assertEquals(a2, aS.getAnimalByName("HelmutTheHound"));
        assertNull(aS.getAnimalByName("ShellyTheStarfish"));
    }
    */
    
    /**
     * Test makeAnimal method in AnimalShelter
     *  
    @Test
    public void test06()
    {
        AnimalShelter aS = new AnimalShelter();
        
        Animal a1 = aS.makeAnimal('c', "FridaTheFeline", 10);
        assertFalse(((Cat)a1).isKillerCat());
        
        Animal a2 = aS.makeAnimal('d', "HelmutTheHound", 6);
        assertFalse(((Dog)a2).isWelltrained());
        
        Animal a3 = aS.makeAnimal('o', "JohnTheParrot", 66);
        assertEquals(66, a3.getAge());
        
        aS.addAnimal(a1);
        aS.addAnimal(a2);
        aS.addAnimal(a3);
        assertEquals(3, aS.numberOfAnimals());
        assertEquals(a2, aS.getAnimalByName("HelmutTheHound"));
    }
    */
    
    /**
     * Test reading from file
     *  
    @Test
    public void test07()
    {
        AnimalShelter aS1 = new AnimalShelter();
        
        aS1.readAnimalsFromFile("animals.txt");
        assertEquals(4, aS1.numberOfAnimals());
        assertNull(aS1.getAnimalByName("ShellyTheStarfish"));
        assertEquals(5, aS1.getAnimalByName("SashaTheSluggish").getAge());
        assertFalse(((Cat)aS1.getAnimalByName("GeorgeTheGlorious")).isKillerCat());
        
        AnimalShelter aS2 = new AnimalShelter();
        aS2.readAnimalsFromFile("nonexistingfile");
        assertEquals(0, aS2.numberOfAnimals());
    }
    */
 
    
}
