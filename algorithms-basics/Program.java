import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] numbers = { 3, 2, 5, 4, 8 };

        System.out.println(Arrays.toString(numbers));

        Helper.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbers));

        Helper.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers));
    }

}
