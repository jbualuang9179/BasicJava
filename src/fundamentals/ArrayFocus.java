package fundamentals;

public class ArrayFocus {

    /*
     Array
        - Group of the same types of element
        - Reserve memory in sequence
        - Store element on same use-case together
        - Array in Java is reference
     */

    public static void main(String[] args) {
        // If you want to declare like below example - Reserve the number of slots
        // Initialized with size
        // 0-9 = size 10

        int[] numbers = new int[10];
        numbers[5] = 10; // Assign value to index
        System.out.println(numbers[5]);
    }
}
