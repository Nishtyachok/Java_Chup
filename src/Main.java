import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задание 1
        System.out.println("Введите два целых числа a и b:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        compareAndOperate(a, b);

        // Задание 2
        System.out.println("Введите две строки a и b:");
        scanner.nextLine(); // Очистка буфера
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        compareStrings(str1, str2);

        // Задание 3
        System.out.println("Четные числа из массива [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]:");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printEvenNumbers(arr);
    }

    // Задание 1
    public static void compareAndOperate(int a, int b) {
        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Арифметические операции
        System.out.println("Сложение: " + (a + b));
        System.out.println("Вычитание: " + (a - b));
        System.out.println("Умножение: " + (a * b));
        if (b != 0) {
            System.out.println("Деление: " + ((double) a / b));
        } else {
            System.out.println("Деление на ноль невозможно");
        }
    }

    // Задание 2
    public static void compareStrings(String str1, String str2) {
        if (str1.equals(str2)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }

    // Задание 3
    public static void printEvenNumbers(int[] arr) {
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
