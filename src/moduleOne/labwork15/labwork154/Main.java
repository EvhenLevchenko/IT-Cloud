package moduleOne.labwork15.labwork154;

public class Main {
    public static void main(String[] args) {
<<<<<<< Updated upstream
        int a = 0;
        for (int i = 1; i < 300 && 10; i++) {
            if ((i % 4 == 0 || i % 3 == 0)) {
                System.out.println(i);
       //         a++;
       //         if (a == 10) break;
=======
        int count = 0;
        for (int i = 1; i < 300 && count<10; i++) {
            if ((i % 3 == 0 || i % 4 == 0)) {
                System.out.println(i);
                count++;
                //         a++;
                //         if (a == 10) break;
>>>>>>> Stashed changes
            }
        }
    }
}
