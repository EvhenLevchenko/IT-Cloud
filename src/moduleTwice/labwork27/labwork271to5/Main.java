package moduleTwice.labwork27.labwork271to5;

public class Main {
    public static void main(String[] args) {
        Device[] equipment = new Device[2];

        equipment[0] = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024);
        equipment[1] = new EthernetAdapter("Samsung", 120, "Avbdfb2", 4000, "No");

        for (int i = 0; i < equipment.length; i++) equipment[i].printFields();

    }
}