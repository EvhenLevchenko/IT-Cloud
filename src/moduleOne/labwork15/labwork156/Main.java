package moduleOne.labwork15.labwork156;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;

        while (number != 0) {
            sum = sum + (number % 10) * (number % 10);
            number /= 10;
        }
        System.out.println("The sum of squares of digits of number is: " + sum);
    }
}