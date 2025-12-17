import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] numbers = { 8, 3, 7, 9, 1, 2, 4 };
        System.out.println("Sorting algorithm");
        System.out.println("Original array: \n" + Arrays.toString(numbers));

        System.out.println();
        System.out.println("Iterations");
        Sorter.sort(numbers);
    }

}
