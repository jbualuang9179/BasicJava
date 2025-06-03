package assignment;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String input = scanner.nextLine();
        // Assume input positive integer
        int number = Integer.parseInt(input);
        // 5! = 5 * 4 * 3 * 2 * 1 = 120
        // 1! = 1, 0! = 1

        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println("Factorial of " + number + " is " + result);
    }
}
