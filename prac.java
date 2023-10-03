import java.util.Scanner;

public class prac {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the array of positive numbers separated by space: ");
            String input = scanner.nextLine();
            scanner.close();

            // Split the input string into an array of strings representing numbers
            String[] numbers = input.split(" ");

            // Convert the array of strings to an array of integers
            int[] arr = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                arr[i] = Integer.parseInt(numbers[i]);
            }

            int maxDifference = findMaxDifference(arr);
            System.out.println("The maximum difference between two numbers in the array is: " + maxDifference);
        }

        private static int findMaxDifference(int[] arr) {
            if (arr == null || arr.length < 2) {
                return -1; // Return -1 if the array has fewer than two elements.
            }

            int minElement = arr[0];
            int maxDifference = arr[1] - arr[0];

            for (int i = 1; i < arr.length; i++) {
                // Update the minimum element found so far
                if (arr[i] < minElement) {
                    minElement = arr[i];
                }

                // Update the maximum difference found so far
                int currentDifference = arr[i] - minElement;
                if (currentDifference > maxDifference) {
                    maxDifference = currentDifference;
                }
            }

            return maxDifference;
        }

}
