import java.util.Scanner;

public class SequentialSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the size of the array
        System.out.print("Enter number of elements: ");
        int totalElements = scanner.nextInt();

        // Create the array based on user's input size
        int[] numbers = new int[totalElements];

        System.out.println(); // Space for cleaner output

        // Populate the array with values from the user
        for (int i = 0; i < totalElements; i++) {
            System.out.print("Enter value at index " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println();

        // Ask user for the target number they want to find
        System.out.print("Enter value to search: ");
        int targetValue = scanner.nextInt();

        System.out.println();

        // Search the array sequentially
        int targetIndex = -1; // -1 means "not found yet"
        
        for (int i = 0; i < totalElements; i++) {
            if (numbers[i] == targetValue) {
                targetIndex = i; // Store the index where it was found
                break;           // Stop loop immediately once found
            }
        }

        // Display the outcome
        if (targetIndex != -1) {
            System.out.println(targetValue + " found at index " + targetIndex + ".");
        } else {
            System.out.println(targetValue + " not found in the array.");
        }

        scanner.close();
    }
}
