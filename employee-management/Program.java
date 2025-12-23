public class Program {
    public static void main(String[] args) {
        Employees university = new Employees();
        university.add(new Person("Petrus", Education.PHD));
        university.add(new Person("Arto", Education.HS));
        university.add(new Person("Elina", Education.PHD));

        System.out.println("All employees");
        university.print();
        university.fire(Education.HS);

        System.out.println();
        System.out.println("After firing high school employees");
        university.print();

    }
}
