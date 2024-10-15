import java.util.Scanner;
import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input array size
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        
        // Initialize the array
        int[] array = new int[size];
        
        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        int choice;
        do {
            // Display menu
            System.out.println("\nArray Operations Menu:");
            System.out.println("1. Traverse Array");
            System.out.println("2. Insert Element");
            System.out.println("3. Delete Element");
            System.out.println("4. Swap Elements");
            System.out.println("5. Sort Array");
            System.out.println("6. Merge Arrays");
            System.out.println("7. Exit");
            System.out.println("Enter your choice:");
            
            choice = scanner.nextInt();
            
            switch(choice) {
                case 1:
                    traverseArray(array);
                    break;
                case 2:
                    array = insertElement(array);
                    break;
                case 3:
                    array = deleteElement(array);
                    break;
                case 4:
                    swapElements(array);
                    break;
                case 5:
                    sortArray(array);
                    break;
                case 6:
                    mergeArrays(array);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        } while(choice != 7);
        
        scanner.close();
    }
    
    // Method to traverse array
    public static void traverseArray(int[] arr) {
        System.out.println("Array elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    // Method to insert element into array
    public static int[] insertElement(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element to insert:");
        int element = scanner.nextInt();
        System.out.println("Enter the index to insert:");
        int index = scanner.nextInt();
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        newArr[index] = element;
        for (int i = index + 1; i < newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }
        System.out.println("Array after insertion:");
        traverseArray(newArr);
        return newArr;
    }
    
    // Method to delete element from array
    public static int[] deleteElement(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the index to delete:");
        int index = scanner.nextInt();
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        for (int i = index + 1; i < arr.length; i++) {
            newArr[i - 1] = arr[i];
        }
        System.out.println("Array after deletion:");
        traverseArray(newArr);
        return newArr;
    }
    
    // Method to swap elements in array
    public static void swapElements(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the indices to swap:");
        int index1 = scanner.nextInt();
        int index2 = scanner.nextInt();
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        System.out.println("Array after swapping:");
        traverseArray(arr);
    }
    
    // Method to sort array
    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Array after sorting:");
        traverseArray(arr);
    }
    
    // Method to merge arrays
    public static void mergeArrays(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the second array:");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }
        int[] mergedArray = new int[arr.length + array2.length];
        System.arraycopy(arr, 0, mergedArray, 0, arr.length);
        System.arraycopy(array2, 0, mergedArray, arr.length, array2.length);
        System.out.println("Merged Array:");
        traverseArray(mergedArray);
}
}