public class NestedClassInspector {
    public static void checkRelatedClasses(String className) {
        try {
            Class<?> targetClass = Class.forName(className);

            // 1. Check if this class is inside an Outer class (nested in the same file)
            Class<?> outerClass = targetClass.getDeclaringClass();
            if (outerClass != null) {
                System.out.println("Enclosing Outer Class: " + outerClass.getName());
            }

            // 2. Find all inner/nested classes declared INSIDE this class
            Class<?>[] nestedClasses = targetClass.getDeclaredClasses();

            if (nestedClasses.length == 0 && outerClass == null) {
                System.out.println("No other nested or inner classes found tied to this class.");
                return;
            }

            if (nestedClasses.length > 0) {
                System.out.println("Nested/Inner Classes found inside:");
                for (Class<?> nested : nestedClasses) {
                    System.out.println(" - " + nested.getName());
                }
            }

        } catch (ClassNotFoundException e) {
            System.err.println("Error: Class '" + className + "' not found.");
        }
    }

    public static void main(String[] args) {
        checkRelatedClasses("finalKeyword");
    }
}
