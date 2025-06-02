package assignment;

import java.util.Scanner;

public class AverageOfTenNumbers {

    /*
        Write a program that takes 10 Numbers as input from ther user
        -- Condition - Input one at a time.
        Calculate add display the average of these numbers.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;
        int count = 10;
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number: ");
            double input = Double.parseDouble(scanner.nextLine());
            sum += input;
        }
        System.out.println("Average: " + sum / count);
    }
}
