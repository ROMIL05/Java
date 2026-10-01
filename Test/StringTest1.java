public class StringTest1 {
    public static void main(String[] args) {
        String s1 = "Java17";
        String s2 = "Java" + 17;

        final int ver = 17;
        String s3 = "Java" + ver;

        int verVar = 17;
        String s4 = "Java" + verVar;

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
    }
}