import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearch {

    public static int getElement(int[] array, int element) {
        // sort array in ascending order
        Sorter.sort(array);
        System.out.println(Arrays.toString((array)));

        ArrayList<Integer> numbers = getListFromArray(array);

        while (true) {
            int middleIndex = getMiddleIndex(numbers);
            int middleElement = numbers.get(middleIndex);
            System.out.println(numbers);
            System.out.println("Index: " + middleIndex + ", Element: " + middleElement);

            if (middleElement == element) {
                return middleIndex;
            }

            // check if there are not more items
            if (numbers.size() < 2) {
                return -1;
            }

            if (middleElement < element) {
                numbers = getUpperSublist(numbers, middleIndex);
            } else {
                numbers = getLowerSublist(numbers, middleIndex);
            }
        }

    }

    public static int getMiddleIndex(ArrayList<Integer> list) {
        int len = list.size();

        if (len < 2) {
            return 0;
        }

        if (isEven((len))) {
            return (len / 2) - 1;
        }

        return (len - 1) / 2;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static ArrayList<Integer> getLowerSublist(ArrayList<Integer> list, int middleIndex) {
        return new ArrayList<>(list.subList(0, middleIndex));
    }

    public static ArrayList<Integer> getUpperSublist(ArrayList<Integer> list, int middleIndex) {
        return new ArrayList<>(list.subList(middleIndex + 1, list.size()));
    }

    public static ArrayList<Integer> getListFromArray(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int item : array) {
            list.add(item);
        }

        return list;
    }
}
