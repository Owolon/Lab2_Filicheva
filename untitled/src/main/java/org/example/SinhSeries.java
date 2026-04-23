package org.example;

import java.util.Scanner;

public class SinhSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = readDouble(scanner, "Введите x: ");
        int n = readInt(scanner, 1);
        double e = Double(scanner);

        double sumN = 0.0;
        double sumE = 0.0;
        double sumE10 = 0.0;

        double term = x;

        for (int i = 0; i < n; i++) {

            sumN += term;

            if (Math.abs(term) > e) {
                sumE += term;
            }

            if (Math.abs(term) > e / 10) {
                sumE10 += term;
            }

            int k = i + 1;
            term = term * x * x / ((2 * k) * (2 * k + 1));
        }

        double mathValue = Math.sinh(x);

        System.out.println("\nРезультаты:");
        System.out.println("1) Сумма первых n членов: " + sumN);
        System.out.println("2) Сумма членов ak > e: " + sumE);
        System.out.println("3) Сумма членов ak > e/10: " + sumE10);
        System.out.println("4) Значение Math.sinh(x): " + mathValue);

        scanner.close();
    }

    private static double readDouble(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Ошибка: введите число (например 0,5)");
                scanner.next();
            }
        }
    }

    private static int readInt(Scanner scanner, int min) {
        while (true) {
            System.out.print("Введите n (n > 0): ");
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                if (value >= min) {
                    return value;
                } else {
                    System.out.println("Ошибка: число должно быть >= " + min);
                }
            } else {
                System.out.println("Ошибка: введите целое число");
                scanner.next();
            }
        }
    }

    private static double Double(Scanner scanner) {
        while (true) {
            double value = readDouble(scanner, "Введите e (e > 0): ");
            if (value > 0) {
                return value;
            } else {
                System.out.println("Ошибка: число должно быть > 0");
            }
        }
    }
}
