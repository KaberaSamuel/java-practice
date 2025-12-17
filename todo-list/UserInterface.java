import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner inputScanner) {
        this.list = list;
        this.scanner = inputScanner;
    }

    public String getInput(String prompt) {
        System.out.print(prompt);
        return this.scanner.nextLine();

    }

    public void start() {
        while (true) {
            // add some spacing between commands
            System.out.println();

            String command = this.getInput("Command: ");

            if (command.equals("stop")) {
                System.out.println("Thanks for using the program, Byee!");
                break;
            } else if (command.equals("add")) {
                String task = this.getInput("To add: ");
                this.list.add(task);
            } else if (command.equals("remove")) {
                String toRemove = getInput("Which one to remove? ");
                this.list.remove(Integer.valueOf(toRemove));
            } else if (command.equals("list")) {
                this.list.print();
            } else {
                System.out.println("Command not identified");
            }

        }
    }
}
