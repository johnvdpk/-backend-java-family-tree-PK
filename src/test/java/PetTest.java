import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetTest {


    @Test
    public void testSetName() {

        //arrange:
        Person owner = new Person("Kris", "Maria", "Kraslot", "male", 23);
        Pet pet = new Pet("Klaas", 6, "Cat", owner);
        String expectedName = "Klaas";
        //act:
        pet.setName(expectedName);
        String actualName = pet.getName();
        //assert:
        assertEquals(expectedName, actualName);

    }
    @Test
    public void testSetAge() {
        //arrange:
        Person owner = new Person("Kris", "Maria", "Kraslot", "male", 23);
        Pet pet = new Pet("Klaas", 6, "Cat", owner);
        int expectedAge = 6;
        //act:
        pet.setAge(expectedAge);
        int actualAge = pet.getAge();
        //Assert:
        assertEquals(expectedAge, actualAge );
    }
    @Test
    public void testSetSpecies() {

        //arrange:
        Person owner = new Person("Kris", "Maria", "Kraslot", "male", 23);
        Pet pet = new Pet("Klaas", 6, "Cat", owner);
        String expectedSpecies = "Cat";
        //act:
        pet.setSpecies(expectedSpecies);
        String actualSpecies = pet.getSpecies();
        //assert:
        assertEquals(expectedSpecies, actualSpecies);

    }


    @Test
    public void testSetOwner() {

        //arrange:
        Person owner = new Person("Kris", "Maria", "Kraslot", "male", 23);
        Pet pet = new Pet("Klaas", 6, "Cat", owner);
        Person expectedOwner = owner;
        //act:
        pet.setOwner(expectedOwner);
        Person actualOwner = pet.getOwner();
        //assert:
        assertEquals(expectedOwner, actualOwner);

    }


}
