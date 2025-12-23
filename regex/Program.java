import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        Checker checker = new Checker();
        System.out.println("Time of day checker");

        while (true) {
            System.out.print("Enter a string: ");
            String input = reader.nextLine();

            if (input.equals("end")) {
                break;
            }

            System.out.println(checker.timeOfDay(input));
        }

        reader.close();
    }
}
