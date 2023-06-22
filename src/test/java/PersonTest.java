import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

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
    public void testList<Person>childeren() {

    }



}

