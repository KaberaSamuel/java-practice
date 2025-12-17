import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        TodoList todo = new TodoList();
        Scanner inputReader = new Scanner(System.in);
        UserInterface ui = new UserInterface(todo, inputReader);

        // start program
        ui.start();
    }
}