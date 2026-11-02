public class Calculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.err.println("Error: Provide two numbers and an operator.");
            System.exit(1);
        }

        try {
            double a = Double.parseDouble(args[0]);
            String op = args[1];
            double b = Double.parseDouble(args[2]);
            double result;

            switch (op) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    if (b == 0) {
                        System.err.println("Error: Division by zero.");
                        System.exit(1);
                    }
                    result = a / b;
                    break;
                default:
                    System.err.println("Error: Invalid operator.");
                    System.exit(1);
                    return;
            }

            if (result == (long) result) {
                System.out.println((long) result);
            } else {
                System.out.println(result);
            }
        } catch (NumberFormatException e) {
            System.err.println("Error: Operands must be numeric.");
            System.exit(1);
        }
    }
}
