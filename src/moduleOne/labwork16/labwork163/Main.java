package moduleOne.labwork16.labwork163;

public class Main {
    public static void main(String[] args) {
        int t, i;
        int[][] table = new int[4][4];

        for (i = 0; i < 4; ++i) {
            for (t = 0; t < 4; ++t) {
                table[t][i] = (t * 4) + i + 1;
                System.out.print(table[t][i] + "\t");
            }
            System.out.println();
        }
    }
}