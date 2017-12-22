package moduleTwice.labwork217.labwork1;

public class Main {
    public static void main(String[] args) {
         MyTimeBomb bomb=new MyTimeBomb();
       //  bomb.start();

         MySecondTimeBomb bomb1= new MySecondTimeBomb();
         Thread thread=new Thread(bomb1);
         thread.start();
         try {
             thread.join();
         }catch (InterruptedException e){
             e.printStackTrace();
         }
    }
}
