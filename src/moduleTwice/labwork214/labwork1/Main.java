package moduleTwice.labwork214.labwork1;

public class Main {
    public static void main(String[] args) {

        MyTuple<String, Integer, Long> myTuple1 = new MyTuple<>("Buzma", 9, 4578789L);
        MyTuple<Double, String, String> myTuple2 = new MyTuple<>(2.45646, "Buzma", "O");

        System.out.printf("%s : %d : %d%n", myTuple1.getA(), myTuple1.getB(), myTuple1.getC());
        System.out.printf("%s : %s : %s%n", myTuple2.getA(), myTuple2.getB(), myTuple2.getC());


    }
}