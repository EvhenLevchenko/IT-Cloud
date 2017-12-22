package moduleTwice.labwork217.labwork3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] myArray=new int[1000];

        MySumCount sumCount = new MySumCount(10, 15);
        MySumCount sumCount1 = new MySumCount(150, 190);

        Random random =new Random(1000);
        for (int i = 0; i <1000 ; i++) {
            int temp=random.nextInt();
            myArray[i]=temp;

            sumCount.setArray(myArray);
            sumCount1.setArray(myArray);

            Thread thread=new Thread(sumCount);
            Thread thread1=new Thread(sumCount1);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            thread1.start();
            try {
                thread1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("The sum of 1st array" + sumCount.getResultSum());
            System.out.println("The sum of 2nd array" + sumCount1.getResultSum());
        }
    }
}
