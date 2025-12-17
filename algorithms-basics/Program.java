public class Program {
    public static void main(String[] args) {
        int[] numbers = { -1, 6, 9, 8, 12 };
        System.out.println(indexOfSmallestFrom(numbers, 0));
        System.out.println(indexOfSmallestFrom(numbers, 1));
        System.out.println(indexOfSmallestFrom(numbers, 2));
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
}