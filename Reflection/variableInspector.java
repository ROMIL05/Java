import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class variableInspector {
    public static void checkClassVariables(String className) {
        try {
            // 1. Load the class dynamically by its fully qualified name
            Class<?> targetClass = Class.forName(className);

            // 2. Retrieve all fields declared in this class (private, public, protected, static)
            Field[] fields = targetClass.getDeclaredFields();

            if (fields.length == 0) {
                System.out.println("No variables declared in this class.");
                return;
            }

            // 3. Iterate through fields and extract details
            for (Field field : fields) {
                String modifier = Modifier.toString(field.getModifiers());
                String type = field.getType().getSimpleName();
                String name = field.getName();

                System.out.printf("%s %s %s;%n", modifier, type, name);
            }

        } catch (ClassNotFoundException e) {
            System.err.println("Error: The class '" + className + "' not found.");
        }
    }

    public static void main(String[] args) {
        checkClassVariables("staticKeyword");
    }
}
