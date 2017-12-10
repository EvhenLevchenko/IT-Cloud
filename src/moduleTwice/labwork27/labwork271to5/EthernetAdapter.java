package moduleTwice.labwork27.labwork271to5;

public class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    public int getSpeed() {
        return speed;
    }

    public String getMac() {
        return mac;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public EthernetAdapter(String manufactures, float price, String serialNumber, int speed, String mac) {
        super(manufactures, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        EthernetAdapter that = (EthernetAdapter) o;

        if (speed != that.speed) return false;
        return mac != null ? mac.equals(that.mac) : that.mac == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + speed;
        result = 31 * result + (mac != null ? mac.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "EthernetAdapter: manufacturer" + getManufactures() + ", price = " + getPrice() + ", serialNumber" + getSerialNumber() +
                "speed=" + speed + ", mac='" + mac + '\'' + '}';
    }
}