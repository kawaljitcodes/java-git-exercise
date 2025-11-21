import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Sortable sorter = new Sortable();
        // --- Feature 1 Test ---
        int[] myInts = {9, 1, 8, 2, 7};
        System.out.println("Feature 1 Test: Integer Sorting");
        System.out.println("Input: " + Arrays.toString(myInts));
        sorter.sortInts(myInts);
        System.out.println("Output: " + Arrays.toString(myInts));
        System.out.println("Expected: [1, 2, 7, 8, 9]\n"); // Added newline

        // --- Feature 2 Test ---
        String[] myStrings = {"Dog", "Cat", "Bird", "Apple"};
        System.out.println("Feature 2 Test: String Sorting");
        System.out.println("Input: " + Arrays.toString(myStrings));
        sorter.sortStrings(myStrings);
        System.out.println("Output: " + Arrays.toString(myStrings));
        System.out.println("Expected: [Apple, Bird, Cat, Dog]");
    }
}// update
