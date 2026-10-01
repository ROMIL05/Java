public class WrapperTest {
    public static void main(String[] args) {
        Integer num = 50;
        increment(num);
        System.out.println(num);
    }

    static void increment(Integer x) {
        x = x + 1; // ⚠️ Attempting to increment Wrapper object!
    }
}