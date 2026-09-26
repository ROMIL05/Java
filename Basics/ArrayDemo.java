public class ArrayDemo {
    public static void main(String[] args) {
        // 1. Array Declaration and Initialization
            // a. Declaration and then Initialization
            int[] arr1; // Declaration
            arr1 = new int[5]; // Initialization with default values (0)
            arr1[0] = 10; // Assigning values individually
            arr1[1] = 20;

            // b. Declaration and Initialization in a single step
            int[] arr2 = {1, 2, 3, 4, 5};

            // c. Using `new` keyword with specified size and values
            int[] arr3 = new int[] {6, 7, 8, 9, 10};

            // d. Multi-dimensional Array
            int[][] multiArr = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

        // 2. Operations on Arrays
            System.out.println("=== Array Operations ===");

        // a. Accessing elements
            System.out.println("First element of arr2: " + arr2[0]);

        // b. Modifying elements
            arr2[0] = 42;
            System.out.println("Modified first element of arr2: " + arr2[0]);

        // c. Iterating over arrays
            System.out.print("Elements of arr1: ");
            for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i] + " ");
            }
            System.out.println();

        // d. Using enhanced for loop
            System.out.print("Elements of arr3: ");
            for (int value : arr3) {
                System.out.print(value + " ");
            }
            System.out.println();

        // e. Finding the length of the array
            System.out.println("Length of arr3: " + arr3.length);

        // f. Multi-dimensional array traversal
            System.out.println("Multi-dimensional Array:");
            for (int i = 0; i < multiArr.length; i++) {
                for (int j = 0; j < multiArr[i].length; j++) {
                    System.out.print(multiArr[i][j] + " ");
                }
                System.out.println();
            }

        // 3. Common Operations
            // a. Finding the sum of array elements
            int sum = 0;
            for (int value : arr2) {
                sum += value;
            }
            System.out.println("Sum of elements in arr2: " + sum);

            // b. Finding the maximum element
            int max = arr2[0];
            for (int value : arr2) {
                if (value > max) {
                    max = value;
                }
            }
            System.out.println("Maximum element in arr2: " + max);

            // c. Copying an array
            int[] arrCopy = arr2.clone();
            System.out.print("Copied array: ");
            for (int value : arrCopy) {
                System.out.print(value + " ");
            }
            System.out.println();

            // d. Sorting an array
            java.util.Arrays.sort(arr3);
            System.out.print("Sorted arr3: ");
            for (int value : arr3) {
                System.out.print(value + " ");
            }
            System.out.println();

            // e. Searching in a sorted array
            int searchKey = 8;
            int index = java.util.Arrays.binarySearch(arr3, searchKey);
            if (index >= 0) {
                System.out.println("Element " + searchKey + " found at index " + index + " in arr3.");
            } else {
                System.out.println("Element " + searchKey + " not found in arr3.");
            }
    }
}
