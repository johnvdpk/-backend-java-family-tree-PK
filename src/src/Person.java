import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private String middleName;
    private String lastName;
    private String sex;
    private int age;
    private Person mother;
    private Person father;

    private List<Person> siblings;
    private List<Person> children;
    private List<Person> pets;

    private List<Person> grandChilderen;




    public Person(String name, String middleName, String lastName, String sex, int age) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.siblings = new ArrayList<>();
        this.children = new ArrayList<>();
        this.pets = new ArrayList<>();
        this.grandChilderen = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }

    public List<Person> getSiblings() {
        return siblings;
    }

    public List<Person> getChildren() {
        return children;
    }

    public List<Person> getPets() {
        return pets;
    }

    public List<Person> getGrandChilderen() {
        return grandChilderen;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public List<Person> setSiblings(List<Person> siblings) {
        this.siblings = siblings;
        return siblings;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public void setPets(List<Person> pets) {
        this.pets = pets;
    }

    public List<Person> setGrandChilderen(List<Person> grandChilderen) {
        this.grandChilderen = grandChilderen;
        return grandChilderen;
    }

    public void addChild(Person child) {
        this.children.add(child);
    }
    public void addParents(Person mother, Person father) {
        this.mother = mother;
        this.father = father;
    }

    public void addSibling(Person sibling) {
        this.siblings.add(sibling);
    }


}




