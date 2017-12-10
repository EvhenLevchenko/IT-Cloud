package moduleOne.labwork14.labwork147;

public class Main {
    public static void main(String[] args) {
        int result;
        for (int i = -11; i < 12; i++) {
            result = i != 0 ? 100 / i : 0;//избегаем деления на 0
            if (i != 0)

                System.out.println("100/" + i + "=" + result);
        }
    }
}
