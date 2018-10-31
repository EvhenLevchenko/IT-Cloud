package moduleTwice.labwork21.labwork1_2;

public class Main {
    public static void main(String[] args) {
        final int COMPUTERS = 5;

        Computer[] computers = new Computer[COMPUTERS];
        for (int i = 0; i < COMPUTERS; i++) {
            computers[i] = new Computer();
        }

        for (Computer computer : computers) {
            computer.setPrice((float) (computer.getPrice() + 0.1 * computer.getPrice()));
        }

        for (Computer computer : computers) {
            computers.toString();
        }
    }
}

class Computer {
    private String manufacture;
    private int serialNumber;
    private float price;
    private int quantityCPU;
    private int frequencyCPU;


    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantityCPU() {
        return quantityCPU;
    }

    public void setQuantityCPU(int quantityCPU) {
        this.quantityCPU = quantityCPU;
    }

    public int getFrequencyCPU() {
        return frequencyCPU;
    }

    public void setFrequencyCPU(int frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "manufacture='" + manufacture + '\'' +
                ", serialNumber=" + serialNumber +
                ", price=" + price +
                ", quantityCPU=" + quantityCPU +
                ", frequencyCPU=" + frequencyCPU +
                '}';
    }
}
