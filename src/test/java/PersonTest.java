import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    //@BeforeEach


    @Test
    public void testSetName() {

        //arrange:
        Person person = new Person("Kris", "Lotty", "Kraslot", "male", 20);
        String expectedName = "Kris";
        //act:
        person.setName(expectedName);
        String actualName = person.getName();
        //assert:
        assertEquals(expectedName, actualName);

    }
    @Test
    public void testSetMiddleName() {

        //arrange:
        Person person = new Person("Kris", "Lotty", "Kraslot", "male", 20);
        String expectedMiddleName = "Lotty";
        //act:
        person.setMiddleName(expectedMiddleName);
        String actualMiddleName = person.getMiddleName();
        //assert:
        assertEquals(expectedMiddleName, actualMiddleName);

    }

    @Test
    public void testSetLastName() {

        //arrange:
        Person person = new Person("Kris", "Lotty", "Kraslot", "male", 20);
        String expectedLastName = "Kraslot";
        //act:
        person.setLastName(expectedLastName);
        String actualLastName = person.getLastName();
        //assert:
        assertEquals(expectedLastName, actualLastName);

    }

    @Test
    public void testGetSex() {

        //arrange:
        Person person = new Person("Kris", "Lotty", "Kraslot", "male", 20);
        String expectedGetSex = "male";
        //act:
        person.setSex(expectedGetSex);
        String actualSex = person.getSex();
        //assert:
        assertEquals(expectedGetSex, actualSex);

    }

    @Test
    public void testGetAge() {

        //arrange:
        Person person = new Person("Kris", "Lotty", "Kraslot", "male", 20);
        int expectedGetAge = 20;
        //act:
        person.setAge(expectedGetAge);
        int actualAge = person.getAge();
        //assert:
        assertEquals(expectedGetAge, actualAge);

    }

    @Test
    public void testSetMother() {
        // Arrange:
        Person person = new Person("Kris", "Lotty", "Kraslot", "male", 20);
        Person mother = new Person("Sarah", "Emma", "Kraslot", "female", 50);

        // Act:
        person.setMother(mother);

        // Assert:
        assertEquals(mother, person.getMother());
    }

    @Test
    public void testSetFather() {
        // Arrange:
        Person person = new Person("Kris", "Lotty", "Kraslot", "male", 20);
        Person father = new Person("John", "Martin", "Kraslot", "male", 55);

        // Act:
        person.setFather(father);

        // Assert:
        assertEquals(father, person.getFather());
    }


    @Test
    public void testListchilderen() {
        //arrange
        Person child = new Person("Cindy", "Maria", "Bakker", "female", 6);
        Person child2 = new Person("Cindy2", "Maria", "Bakker", "female", 6);
        Person mother = new Person("Beb", "maria", "Bakker", "female", 40);

        List<Person> childeren = new ArrayList<>();
        childeren.add(child);
        childeren.add(child2);
        mother.setChildren(childeren);


        //act

        List<Person> expectedChilderen = mother.getChildren();

        //assert

        assertEquals(expectedChilderen, childeren);
    }

    @Test
    public void testListSiblings() {
        //arrange
        Person person = new Person("Kris", "Lotty", "Kraslot", "male", 20);
        Person sibling01 = new Person("Cindy", "Maria", "Bakker", "female", 6);
        Person sibling02 = new Person("Cindy2", "Maria", "Bakker", "female", 6);

        List<Person>siblings = new ArrayList<>();
        siblings.add(sibling01);
        siblings.add(sibling02);
        person.setSiblings(siblings);

        // act
        List<Person> expectedSiblings = person.setSiblings(siblings);

        //assert

        assertEquals(expectedSiblings, siblings);

    }

    @Test
    public void testListGrandChilderen() {
        //arrange
        Person person = new Person("Kris", "Lotty", "Kraslot", "male", 20);
        Person grandChild01 = new Person("Butterfly", "Maria", "Bakker", "female", 6);
        Person grandChild02 = new Person("Maven", "Maria", "Bakker", "female", 6);

        List<Person>grandChilderen = new ArrayList<>();
        grandChilderen.add(grandChild01);
        grandChilderen.add(grandChild02);
        person.setSiblings(grandChilderen);

        // act
        List<Person> expectedGrandChilderen = person.setGrandChilderen(grandChilderen);

        //assert

        assertEquals(expectedGrandChilderen, grandChilderen);

    }

}

