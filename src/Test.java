public class Test {

    public static void main(String[] args) {

        // Laver objekterne af klasserne
        Person person = new Person("Erik");
        Student student = new Student("Niels");
        Employee employee = new Employee("Mads");
        Faculty faculty = new Faculty("Bob");
        Staff staff = new Staff("Jens");

        // Kalder på deres toString metoder
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());

    }
}
