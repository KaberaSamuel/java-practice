import java.text.MessageFormat;

public class Manager extends Employee {
    private String department;

    public Manager(int id, String name, int salary, String department) {
        super(id, name, salary);
        this.department = department;
    }

    @Override
    public double calculateYearlyBonus() {
        return 0.2 * this.salary;
    }

    public void conductMeeting() {
        String template = "Manager {0} is conducting a strategy meeting for the {1} department";
        System.out.println(MessageFormat.format(template, this.name, this.department));
    }
}
