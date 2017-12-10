package moduleOne.labwork14.labwork146;

public class Main {
    public static void main(String args[]) {
        String binary[] = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101",
                "1110", "1111"};
        int a = 5;   //     4+0+1  или двоичное 0101
        int b = 8;//     8+0+0+0  или двоичное 1000

        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = (~a & b) | (a & ~b);
        int g = ~a & 0x0f;
        System.out.println(" a = " + binary[a]);
        System.out.println(" b = " + binary[b]);
        System.out.println(" ab = " + binary[c]);
        System.out.println(" a&b = " + binary[d]);
        System.out.println(" a^b = " + binary[e]);
        System.out.println("~a&b|а^~Ь = " + binary[f]);
        System.out.println(" ~a = " + binary[g] + "\n");

    }
}