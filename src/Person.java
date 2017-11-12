public class Person {

    // Lavet af Erik Ruhmanis

    // Deklarerer og initialiserer variablerne
    String name = "";
    String address = "";
    int phoneNumber = 0;
    String e_mail_address = "";

    // Default no-args constructor
    public Person() {
    }

    // Constructor der laver en person med navn
    public Person(String name) {
        this.name = name;
    }

    // Klassens toString metode
    @Override
    public String toString() {
        return "Class name: " + this.getClass().getName() + "\nPerson name: " + name + "\n";
    }
}
