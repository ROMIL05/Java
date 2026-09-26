public class CommandLineCalculation {
    public static void main(String[] args) {
        try {
            // Check if two arguments are provided
            if (args.length < 2) {
                throw new IllegalArgumentException("Please provide exactly two numbers as command-line arguments.");
            }

            // Parse command-line arguments to integers
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);

            // Calculate sum
            double sum = num1 + num2;

            System.out.println("Sum: " + sum);
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
