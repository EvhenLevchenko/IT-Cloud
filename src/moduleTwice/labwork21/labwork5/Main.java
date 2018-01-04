package moduleTwice.labwork21.labwork5;

public class Main {
    public static void main(String[] args) {

        Computer[] computers = {
                initComputer("ASUS", 13156546, 1200.65f, 3, 3),
                initComputer("Samsung", 5464888, 1059.67f, 2, 1),
                initComputer("LG", 885556, 1104.87f, 2, 3),
                initComputer("Dell", 5559, 640.99f, 4, 4),
                initComputer("Lenovo", 876, 1110.75f, 2, 1)
        };
        for (Computer computer : computers)
            computer.view();
    }

    public static Computer initComputer(String manufacturer, int serialNumber, float price,
                                        int quantityCPU, int frequencyCPU) {
        Computer computer = new Computer();
        computer.setManufacturer(manufacturer);
        computer.setSerialNumber(serialNumber);
        computer.setPrice(price);
        computer.setQuantityCPU(quantityCPU);
        computer.setFrequencyCPU(frequencyCPU);

        return computer;
    }
}
