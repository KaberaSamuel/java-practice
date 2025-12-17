import java.text.MessageFormat;

public class Employee {

    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // getter methods
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getSalary() {
        return this.salary;
    }

    public double calculateYearlyBonus() {
        return this.salary * 0.1;
    }

    public void processFeedback(String feedback) {
        String template = "Employee {0} recieved feedback: {1}";
        System.out.println(MessageFormat.format(template, this.name, feedback));
    }

    public String toString() {
        String template = "WorkId: {0}, Employee: {1}, Salary: {2}";
        return MessageFormat.format(template, this.id, this.name, this.salary);
    }
}
