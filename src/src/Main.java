public class Main {
    public static void main(String[] args) {

        Person person = new Person("Kris", "Lotty", "Kraslot", "male",20 );
        Person child01 = new Person("Karel", "Adriaan", "Binnesbergen", "male", 8);
        Person child02 = new Person("Mark", "Boaz", "Binnensbergen", "male", 6);
        Person child03 = new Person("Cindy", "Maria", "Binnensbergen", "female", 7);
        Person mother = new Person("Hennie", "Maria", "Kerstens", "female", 56);
        Person father = new Person("Sjaak", "Johannes", "Binnensbergen", "male", 65);

        Pet pet = new Pet("Klaas", 5, "cat", person);


        child01.getChildren().add(child01);
        child02.getChildren().add(child02);
        child03.getChildren().add(child03);

        child01.addParents(mother,father);
        child02.addParents(mother, father);
        child03.addParents(mother,father);

        System.out.println("The mother of child01 is: " + child01.getMother().getName());
        System.out.println("The father of child01 is: " + child01.getFather().getName());






    }


}