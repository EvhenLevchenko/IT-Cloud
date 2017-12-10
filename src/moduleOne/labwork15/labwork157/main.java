package moduleOne.labwork15.labwork157;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;

        // for (int i=0; i < n; i++) {
        for (int j = n; j >= 1; j--) {
            if ((!(j == n) && (n % j == 0))) {
                a += j;
            }
        }
        System.out.println(a);
    }
}