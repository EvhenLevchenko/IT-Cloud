package moduleOne.labwork15.labwork155;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int N = 5;
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum = sum + i;
            //sum+=i

        }
        float average = (float) sum / N;
        System.out.println("The sum is: " + sum);
        //System.out.println("The calculated sum is: "+N*(N+1)/2);
        System.out.println("The Average is: " + average);
    }
}
