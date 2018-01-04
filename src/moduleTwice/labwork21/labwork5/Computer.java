package moduleTwice.labwork21.labwork5;

public class Computer {
    private String manufacturer;
    private int serialNumber;
    private float price;
    private int quantityCPU;
    private int frequencyCPU;

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantityCPU() {
        return quantityCPU;
    }

    public int getFrequencyCPU() {
        return frequencyCPU;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setQuantityCPU(int quantityCPU) {
        this.quantityCPU = quantityCPU;
    }

    public void setFrequencyCPU(int frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }

    public void view() {
        System.out.format("\tComputer: %s%nserial number: %d%n" +
                        "price: %1.2f%nquantity CPU: %d%nfrequency CPU: %d%n%n",
                manufacturer, serialNumber, price, quantityCPU, frequencyCPU);
    }

}
