package moduleOne.labwork16.labwork161;

public class Main {
    public static void main(String[] args) {
        int i;
        int aray[] = new int[30];
        for (i = 0; i < 30; i += 2)
            aray[i] = i;
        for (i = 0; i < 30; i += 2)
            System.out.print(aray[i] + " ");
    }
}