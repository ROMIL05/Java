public class primitivesVsReferences {
    public static void main(String[] args){
        // Primitives
        int a = 5;
        int b = a;
        a = 100;
        System.out.println(a + " " + b);

        // References
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;
        arr2[0] = 99;
        System.out.println(arr1[0]);
    }
}

