public class Program {
    public static void main(String[] args) {
        int[] numbers = { 6, 5, 8, 7, 11 };
        System.out.println(indexOfSmallest(numbers));
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
}