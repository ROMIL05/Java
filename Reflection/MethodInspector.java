import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class MethodInspector {
    public static void checkClassMethods(String className) {
        try {
            // 1. Load the class dynamically by its fully qualified name
            Class<?> targetClass = Class.forName(className);

            // 2. Retrieve all methods declared in this class
            Method[] methods = targetClass.getDeclaredMethods();

            if (methods.length == 0) {
                System.out.println("No methods declared in this class.");
                return;
            }

            // 3. Iterate through methods and extract details
            for (Method method : methods) {
                String modifier = Modifier.toString(method.getModifiers());
                String returnType = method.getReturnType().getSimpleName();
                String methodName = method.getName();

                // Build the parameter list string (e.g., "String arg0, int arg1")
                StringBuilder parameters = new StringBuilder();
                Parameter[] params = method.getParameters();
                for (int i = 0; i < params.length; i++) {
                    parameters.append(params[i].getType().getSimpleName())
                            .append(" ")
                            .append(params[i].getName());
                    if (i < params.length - 1) {
                        parameters.append(", ");
                    }
                }

                System.out.printf("%s %s %s(%s);%n", modifier, returnType, methodName, parameters);
            }

        } catch (ClassNotFoundException e) {
            System.err.println("Error: Class '" + className + "' not found.");
        }
    }

    public static void main(String[] args) {
        checkClassMethods("staticKeyword");
    }
}
