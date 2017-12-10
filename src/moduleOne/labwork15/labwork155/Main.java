package moduleOne.labwork15.labwork155;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Enter n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {

            System.out.println("Enter n" + i);
            arr1[i] = sc.nextInt();
            ;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr1[i];
        }
        sum = sum * sum;
        System.out.println(sum);
    }
}
