public class Program {
    public static void main(String[] args) {
        Employee john = new Employee(101, "John", 900);
        Manager emily = new Manager(111, "Emily", 900, "marketing");

        System.out.println(john);
        System.out.println(emily);

        System.out.println("\nyear bonus for john: " + john.calculateYearlyBonus());
        System.out.println("year bonus for emily: " + emily.calculateYearlyBonus() + "\n");

        john.processFeedback("improve time management skills");
        emily.conductMeeting();
    }
}