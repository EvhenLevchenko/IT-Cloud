package moduleTwice.labwork217.labwork6;

public class DiningHall implements Runnable {
    static int pizzaNum;
    static int studentID = 1;

    public synchronized void makePizza() {
        pizzaNum++;
    }

    public void servePizza() {
        String result;
        if (pizzaNum > 0) {
            result = "Served ";
            pizzaNum--;
        } else result = "Starved ";
        System.out.println(result + studentID);
        studentID++;
    }

    @Override
    public void run() {
this.servePizza();
    }
}
