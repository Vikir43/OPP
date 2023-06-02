package Homework_1;

public class Product {
    private String name;
    private double volume;
    private double temp;

    public Product(String name, double volume, double temp) {
        this.name = name;
        this.volume = volume;
        this.temp = temp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }
}
    

