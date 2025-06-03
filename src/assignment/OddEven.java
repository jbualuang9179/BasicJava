package assignment;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();
        int number = Integer.parseInt(input);
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        System.out.println("=======================");
        System.out.println("call method printEvenOdd : " + printEvenOdd(number));
        System.out.println("=======================");
        System.out.println("call method solution3 : " + solution3SwitchCase(number));
    }

    public static String printEvenOdd(int number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }

    private static String solution3SwitchCase(int number) {
        return switch (number % 2) {
            case 0 -> "Even";
            case 1 -> "Odd";
            default -> throw new IllegalArgumentException("Invalid number");
        };
    }
}
