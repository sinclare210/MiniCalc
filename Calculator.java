import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What operation do you want to perform? ");
        System.out.println("1. Addition");
        System.out.println("2. Substract");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is the first number? ");
        double number1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("What is the secondNumber number? ");
        double number2 = scanner.nextDouble();
        scanner.nextLine();

        scanner.close();

        switch (choice) {
            case 1:
                System.out.println("Your answer is "+ (number1 + number2));
                break;
            case 2:
                System.out.println("Your answer is "+ (number1 - number2));
                break;
            case 3:
                System.out.println("Your answer is "+ (number1 * number2));
                break;
            case 4:
                System.out.println("Your answer is "+ (number1 / number2));
                break;            
            default:
                break;
        }
    }
}