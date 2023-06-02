package Homework_1;

public class HotCoffe extends Product {
    public HotCoffe(String name, double volume, double temp) {
        super(name, volume, temp);
    }

    @Override
    public String toString() {
        return String.format("У горячего кофе: %s, %s, %s", getName(), getVolume(), getTemp());
    }
}