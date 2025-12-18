import java.util.Arrays;

public class Sorter {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            // smallest index from current index
            int smallestIndex = Helper.indexOfSmallestFrom(array, i);

            // change current item with smallest item from that position
            Helper.swap(array, i, smallestIndex);

            // print results for each iteration
            System.out.println(Arrays.toString(array));
        }
    }
}
