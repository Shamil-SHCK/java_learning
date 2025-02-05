import java.util.Arrays;

public class sample2 {
    public static void main(String[] args) {
        // Declare and initialize an integer array with 5 elements
        //int[] marks = new int[3];

        // Assign values to specific array indices
        ///marks[0] = 56; marks[1] = 45; marks[2] = 52;

        // Declaration and assigning of value s at a time
        int[] marks = {556,45,78}; 
        // Print the array length
        System.out.println("Array length: " + marks.length);

        // Print the value at index 0
        System.out.println("Value at index 0: " + marks[0]);

        // Sort the array in ascending order
        Arrays.sort(marks);

        // Print the value at index 1 after sorting
        System.out.println("Value at index 1 after sorting: " + marks[0]);
    }
}
