import java.util.HashMap;
import java.util.Map;

public class MotadataString {
    String name;

    public MotadataString(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return System.identityHashCode(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        return false;
    }

    public static void main(String[] args) {
        Map<MotadataString, String> map = new HashMap<>();

        map.put(new MotadataString("Motadata"), "Ahemdabad");
        map.put(new MotadataString("Motadata"), "Surat");
        map.put(new MotadataString("Motadata"), "Gandhinagar");

        map.forEach((key, value) -> {
            if ("Motadata".equals(key.name)) {
                System.out.print(value + " ");
            }
        });
    }
}
