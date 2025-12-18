public class Helper {
    public static int indexOf(int[] array, int item) {
        for (int i = 0; i < array.length; i++) {
            int element = array[i];

            if (element == item) {
                return i;
            }
        }

        return -1;
    }

    public static int smallest(int[] array) {
        // initialize smallest with the first number
        int smallestSofar = array[0];

        for (int number : array) {
            if (number < smallestSofar) {
                smallestSofar = number;
            }
        }

        return smallestSofar;
    }

    public static int indexOfSmallest(int[] array) {
        int smallestItemIndex = 0;

        for (int i = 0; i < array.length; i++) {
            int currentNumber = array[i];
            int smallestNumberSofar = array[smallestItemIndex];

            if (currentNumber < smallestNumberSofar) {
                smallestItemIndex = i;
            }
        }

        return smallestItemIndex;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        // start with the last item
        int smallestItemIndex = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            // skip items that are below the range
            if (i < startIndex) {
                continue;
            }

            int currentNumber = array[i];
            int smallestNumberSofar = array[smallestItemIndex];

            if (currentNumber < smallestNumberSofar) {
                smallestItemIndex = i;
            }
        }

        return smallestItemIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int item1 = array[index1];
        int item2 = array[index2];

        // swap them
        array[index1] = item2;
        array[index2] = item1;
    }
}
