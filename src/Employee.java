public class Employee extends Person {

    // Deklarerer og initialiserer variablerne
    String office = "";
    double salary = 0.0;

    // Laver et MyDate objekt af klassen MyDate
    MyDate dateHired = new MyDate();

    // Default no-args constructor
    public Employee() {

    }

    // Constructor der laver en medarbejder med navn
    public Employee(String name) {
        super(name);
    }

    // Klassens toString metode
    @Override
    public String toString() {
        return "Class name: " + this.getClass().getName() + "\nPerson name: " + name + "\n";
    }
}
