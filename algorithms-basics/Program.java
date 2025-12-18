public class Program {
    public static void main(String[] args) {
        System.out.println("Binary search algorithm");
        int[] numbers = { 16, -3, 45, 0, 71, 9, -22, 31, 5, 62, -9, 11, 22, 1, 44, 7 };
        int index = BinarySearch.getElement(numbers, 44);
        System.out.println("Index of " + 44 + " in the array is: " + index);
    }

}
