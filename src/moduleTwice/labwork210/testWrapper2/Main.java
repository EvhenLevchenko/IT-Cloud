package moduleTwice.labwork210.testWrapper2;

public class Main {
    public static void main(String[] args) {
        Long number = compute((byte) 125, (Integer) 45);
        System.out.println(number.getClass() + " : " + number);

    }

    public static Long compute(Byte number1, Integer number2) {
        return (long) (number1 + number2);
    }
}