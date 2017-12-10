package moduleTwice.labwork27.labwork271to5;

public class Monitor extends Device {
    private int resolutionX;
    private int ResolutionY;

    public int getResolutionX() {
        return resolutionX;
    }

    public int getResolutionY() {
        return ResolutionY;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public void setResolutionY(int resolutionY) {
        ResolutionY = resolutionY;
    }

    public Monitor(String manufactures, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufactures, price, serialNumber);
        this.resolutionX = resolutionX;
        this.ResolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return "Monitor: manufacturer=" + getManufactures() + ", price = " + getPrice() + ", serialNumber" + getSerialNumber() + "resolutionX=" + resolutionX +
                ", ResolutionY=" + ResolutionY + '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Monitor monitor = (Monitor) o;

        if (resolutionX != monitor.resolutionX) return false;
        return ResolutionY == monitor.ResolutionY;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + resolutionX;
        result = 31 * result + ResolutionY;
        return result;
    }
}