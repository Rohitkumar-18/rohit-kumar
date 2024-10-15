import java.util.Scanner;

public class HeapSortMenu {

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HeapSort heapSort = new HeapSort();
        boolean running = true;

        while (running) {
            System.out.println("HeapSort Menu");
            System.out.println("1. Enter numbers to sort");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number of elements: ");
                    int n = scanner.nextInt();
                    int[] array = new int[n];

                    System.out.println("Enter the numbers:");
                    for (int i = 0; i < n; i++) {
                        array[i] = scanner.nextInt();
                    }

                    System.out.println("Original Array:");
                    printArray(array);

                    heapSort.heapSort(array);

                    System.out.println("Sorted Array:");
                    printArray(array);
                    break;

                case 2:
                    running = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }

    // Method to print array
    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

// HeapSort class
class HeapSort {

    // Main method to sort array using HeapSort
    public void heapSort(int[] array) {
        int n = array.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // Extract elements from heap one by one
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // call max heapify on the reduced heap
            heapify(array, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is an index in array[]
    private void heapify(int[] array, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left = 2*i + 1
        int right = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(array, n, largest);
        }
    }
}
