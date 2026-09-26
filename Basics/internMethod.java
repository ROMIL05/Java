public class internMethod {
    public static void main(String[] args) {
        // S1 refers to object in the Heap Area
        String s1 = new String("GFG");

        // S2 refers to object in the SCP Area
        String s2 = s1.intern();

        // Comparing memory locations
        System.out.println(s1 == s2);

        // Comparing values
        System.out.println(s1.equals(s2));

        // S3 refers to object in the SCP Area
        String s3 = "GFG";

        // Comparing s2 and s3 in SCP
        System.out.println(s2 == s3);
    }
}
