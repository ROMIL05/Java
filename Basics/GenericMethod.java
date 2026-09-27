public class GenericMethod {
    // Generic method that accepts an array of any object type 'E'
    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create different types of arrays
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Java", "Python", "C++"};
        Boolean[] boolArray = {true, false, true};

        // Call same method passing different types
        System.out.print("Integer Array: ");
        printArray(intArray);

        System.out.print("String Array: ");
        printArray(stringArray);

        System.out.print("Boolean Array: ");
        printArray(boolArray);
    }
}
