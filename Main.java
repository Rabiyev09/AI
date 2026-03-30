import java.util.Scanner;

public class Main {

    // метод для сложения
    public static int calculateSum(int x, int y) {
        return x + y;
    }

    // метод для вывода результата
    public static void printResult(int a, int b, int result) {
        System.out.println("The sum of " + a + " and " + b + " is: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Simple Sum Program ===");

        // ввод
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // вычисление
        int sum = calculateSum(a, b);

        // вывод
        printResult(a, b, sum);

        System.out.println("Program finished.");

        sc.close();
    }
}