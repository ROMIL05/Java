public class WrapperExample {
    public static void main(String[] args) {
        // Boxing (Converting primitive to object)
        Integer intObj = Integer.valueOf(10);
        Double doubleObj = Double.valueOf(20.5);
        Character charObj = Character.valueOf('A');
        Boolean boolObj = Boolean.valueOf(true);

        // Unboxing (Converting object to primitive)
        int intVal = intObj.intValue();
        double doubleVal = doubleObj.doubleValue();
        char charVal = charObj.charValue();
        boolean boolVal = boolObj.booleanValue();

        // Autoboxing (Automatic conversion from primitive to wrapper)
        Integer autoInt = 30;  // Equivalent to Integer.valueOf(30)
        Double autoDouble = 50.5;  // Equivalent to Double.valueOf(50.5)

        // Auto-unboxing (Automatic conversion from wrapper to primitive)
        int autoIntVal = autoInt;  // Equivalent to autoInt.intValue()
        double autoDoubleVal = autoDouble;  // Equivalent to autoDouble.doubleValue()

        // Displaying values
        System.out.println("Boxed Values: ");
        System.out.println("Integer Object: " + intObj);
        System.out.println("Double Object: " + doubleObj);
        System.out.println("Character Object: " + charObj);
        System.out.println("Boolean Object: " + boolObj);

        System.out.println("\nUnboxed Values: ");
        System.out.println("Integer: " + intVal);
        System.out.println("Double: " + doubleVal);
        System.out.println("Character: " + charVal);
        System.out.println("Boolean: " + boolVal);

        System.out.println("\nAutoboxing and Auto-unboxing: ");
        System.out.println("Auto-boxed Integer: " + autoInt);
        System.out.println("Auto-unboxed Integer: " + autoIntVal);
        System.out.println("Auto-boxed Double: " + autoDouble);
        System.out.println("Auto-unboxed Double: " + autoDoubleVal);
    }
}
