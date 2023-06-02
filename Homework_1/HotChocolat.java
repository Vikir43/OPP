package Homework_1;

public class HotChocolat extends Product {
    public HotChocolat(String name, double volume, double temp) {
        super(name, volume, temp);
    }

    @Override
    public String toString() {
        return String.format("У горячего шоколада: %s, %s, %s", getName(), getVolume(), getTemp());
    }

}
