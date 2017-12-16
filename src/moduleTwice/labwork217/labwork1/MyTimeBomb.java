package moduleTwice.labwork217.labwork1;


public class MyTimeBomb extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is started");
        for (int i = 10; i > 0; i--) {
            System.out.println(Thread.currentThread().getName() + "- count " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Booooooooom!!!!!!!");
    }
}
