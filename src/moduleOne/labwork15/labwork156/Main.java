package moduleOne.labwork15.labwork156;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
           /* sum += Math.pow(i,2);*/
            sum = sum + i * i;//0+1+4+9+16
        }
        System.out.println(sum);
    }
}