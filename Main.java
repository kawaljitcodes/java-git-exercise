import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Sortable sorter = new Sortable();
        int[] myInts = {9, 1, 8, 2, 7};
        System.out.println("Feature 1 Test: Integer Sorting");
        System.out.println("Input: " + Arrays.toString(myInts));
        sorter.sortInts(myInts); // Run the feature
        System.out.println("Output: " + Arrays.toString(myInts));
        System.out.println("Expected: [1, 2, 7, 8, 9]");
    }
}