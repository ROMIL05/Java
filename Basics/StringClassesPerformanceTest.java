public class StringClassesPerformanceTest {
    public static void main(String[] args) {
        long startTime, endTime;

        // String Performance Test - Immutable - Create New Objects
        startTime = System.currentTimeMillis();
        String s = "Java";
        for (int i = 0; i < 10000; i++) {
            s = s + " Programming";
        }
        endTime = System.currentTimeMillis();
        System.out.println("String Time: " + (endTime - startTime) + "ms");

        // StringBuffer Performance Test - Mutable - Thread Safe
        startTime = System.nanoTime();
        StringBuffer sb = new StringBuffer("Java");
        for (int i = 0; i < 10000; i++) {
            sb.append(" Programming");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endTime - startTime) + "ns");

        // StringBuilder Performance Test - Mutable - Non Thread Safe
        startTime = System.nanoTime();
        StringBuilder sbuilder = new StringBuilder("Java");
        for (int i = 0; i < 10000; i++) {
            sbuilder.append(" Programming");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endTime - startTime) + "ns");
    }
}
