package Homework_1;

public class HotTea extends Product {
    public HotTea(String name, double volume, double temp) {
        super(name, volume, temp);
    }

    @Override
    public String toString() {
        return String.format("У горячего чая: %s, %s, %s", getName(), getVolume(), getTemp());
    }
}