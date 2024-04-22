import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        
        System.out.println("Enter first number:");
        num1 = scanner.nextDouble();
        
        System.out.println("Enter second number:");
        num2 = scanner.nextDouble();
        
        System.out.println("Select operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exponentiation");
        
        int operation = scanner.nextInt();
        
        switch (operation) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Error: Division by zero");
                } else {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                }
                break;
            case 5:
                result = Math.pow(num1, num2);
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Invalid operation");
        }
        
        scanner.close();
    }
}


