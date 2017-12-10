package moduleTwice.labwork22.labwork211;

public class Main {
    public static void main(String[] args) {

        final int numberOfcomputers = 5;

        Computer[] computers = new Computer[numberOfcomputers];
        for (int i = 0; i < numberOfcomputers; i++) {
            computers[i] = new Computer();
        }

        for (Computer computer : computers) {
            computer.setPrice((float) (computer.getPrice() + 0.1 * computer.getPrice()));
        }

        for (Computer computer : computers) {
            computer.view();
        }
    }
}

class Computer {
    private String maker;
    private int series;
    private float price;
    private int cores;
    private int frequency;


    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getSeries() {
        return series;
    }

    ;

    public void setSeries(int series) {
        this.series = series;
    }

    public int getCores() {
        return cores;
    }

    ;

    public void setCores(int cores) {
        this.cores = cores;
    }

    public int getFrequency() {
        return frequency;
    }

    ;

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public float getPrice() {
        return price;
    }

    ;

    public void setPrice(float price) {
        this.price = price;
    }

    void view() {
        System.out.println(this.getMaker() + this.getSeries() + this.getCores() + this.frequency + this.getPrice());
    }
}