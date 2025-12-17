import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<String> todos = new ArrayList<>();

    public void add(String task) {
        this.todos.add(task);
    }

    public void remove(int number) {
        if (this.todos.size() == 0) {
            System.out.println("list is already empty");
            return;
        }

        // safe range for removing task
        if (number > 0 && number <= this.todos.size()) {
            this.todos.remove(number - 1);
            return;
        }

        System.out.println("invalid task number");
    }

    public void print() {
        for (int i = 0; i < this.todos.size(); i++) {
            System.out.println(i + 1 + ": " + this.todos.get(i));
        }
    }
}