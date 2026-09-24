public class typeConversionAndPromotion {
    public static void main(String[] args){
        // 1. Implicit Conversion (byte to int)
        byte b = 24;
        int i;
        i = b;
        System.out.println(i);

        // 2. Explicit Conversion (int to byte)
        int n = 300;
        byte m;
        m = (byte)n;
        System.out.println(m);

        // 3. Truncating conversion (float to int)
        float f = 15.678f;
        int num;
        num = (int)f;
        System.out.println(num);

        // boolean to any data type -> Not possible in java.

        // Automatic Type Promotions
        byte bt = 45;
        char c = 'r';
        short s = 1024;
        int in = 50000;
        float fl = 5.67f;
        double d = 0.1234;

        double res = (fl*bt) + (in/c) - (d*s);
        // fl * bt -> float
        // in / c -> int
        // d * s -> double
        // float + integer -> float + double -> double

        System.out.println((fl*bt) + " + " + (in/c) + " - " + (d*s));
        System.out.println(res);
    }
}