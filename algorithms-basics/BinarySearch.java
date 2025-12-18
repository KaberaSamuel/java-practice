public class BinarySearch {
    public static int getElement(int[] array, int element) {
        // sort array in ascending order
        Sorter.sort(array);

        int left = 0; // Start of search range
        int right = array.length - 1; // End of search range

        while (left <= right) {
            int middle = left + (right - left) / 2;
            int middleElement = array[middle];

            System.out.println("Searching between index " + left + " and " + right);
            System.out.println("Middle index: " + middle + ", Element: " + middleElement);

            if (middleElement == element) {
                return middle; // Return actual index
            }

            if (middleElement < element) {
                left = middle + 1; // Search right half
                System.out.println("Going right, new left = " + left);
            } else {
                right = middle - 1; // Search left half
                System.out.println("Going left, new right = " + right);
            }
            System.out.println();
        }

        return -1; // Not found
    }
}