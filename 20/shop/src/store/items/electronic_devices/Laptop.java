package store.items.electronic_devices;

import store.items.Returnable;

public class Laptop extends Electronic implements Returnable {
    private String ram;
    private String cpu;

    public Laptop(String name, int price, String ram, String cpu) {
        super(name, price);
        this.ram = ram;
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public String describe() {
        return "Laptop, ram:" + ram + ", cpu: " + cpu;
    }

    @Override
    public int getGuaranteeDays() {
        return 365;
    }
}
