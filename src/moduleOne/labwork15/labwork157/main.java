package moduleOne.labwork15.labwork157;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Please Enter number");
        Scanner sc = new Scanner(System.in);
        int scanner = sc.nextInt();

        int sum = 0;

        for (int number = 2; number < scanner; number += 2) {
            for (int divisor = 1; divisor < number; divisor++) {
                if (number % divisor == 0) sum += divisor;
            }
            if (sum == number) System.out.println(number);
            sum=0;
        }
    }
}