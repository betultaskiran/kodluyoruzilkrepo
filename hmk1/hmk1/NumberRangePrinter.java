import java.util.Scanner;

public class NumberRangePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        printNumbersInRange(firstNumber, secondNumber);
    }

    private static void printNumbersInRange(int start, int end) {
        for (int i = start + 1; i < end; i++) {
            System.out.print(i + " ");
        }
    }
}
