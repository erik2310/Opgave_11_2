public class Faculty extends Employee {

    // Deklarerer og initialiserer variablerne
    int officeHours = 0;
    String rank = "";

    // Constructor der laver en faculty med person navn
    public Faculty(String name) {
        super(name);
    }

    // Klassens toString metode
    @Override
    public String toString() {
        return "Class name: " + this.getClass().getName() + "\nPerson name: " + name + "\n";
    }

}
