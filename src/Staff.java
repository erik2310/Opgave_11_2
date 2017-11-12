public class Staff extends Employee {

    // Lavet af Erik Ruhmanis

    // Deklarerer og initialiserer variablerne
    String title = "";

    // Constructor der laver en staff med navn
    public Staff(String name) {
        super(name);
    }

    // Klassens toString metode
    @Override
    public String toString() {
        return "Class name: " + this.getClass().getName() + "\nPerson name: " + name + "\n";
    }
}
