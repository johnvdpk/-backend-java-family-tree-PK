public class Main {
    public static void main(String[] args) {

        Person parend = new Person("Karel", "Adriaan", "Binnesbergen", "male", 25);
        Person child01 = new Person("Mark", "Boaz", "Binnensbergen", "male", 6);
        Person child02 = new Person("Cindy", "Maria", "Binnensbergen", "female", 7);
        Pet cat = new Pet ("Musollini",5,"unkown", parend);

        parend.getChildren().add(child01);
        parend.getChildren().add(child02);



    }


}