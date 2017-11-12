public class Student extends Person {

    // Lavet af Erik Ruhmanis

    // Laver et String array med 4 statuser som er constante
    static final String[] STATUS = {"freshman", "sophomore", "junior", "senior"};

    // Constructor der laver en studerende med navn
    public Student(String name) {
        super(name);
    }

    // Klassens toString metode
    @Override
    public String toString() {
        return "Class name: " + this.getClass().getName() + "\nPerson name: " + name + "\n";
    }
}
