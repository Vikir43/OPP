package Homework_1;

public class Main {
public static void main(String[] args) {

        Vending vending = new HotDrinksVending();
        

        Product hotTea = new HotTea("Ahmad", 180, 80);
        Product hotCoffe = new HotCoffe("Paulin", 250, 75);
        Product hotChocolat = new HotChocolat("Choco", 380, 70);
        
        
        
        vending.addProduct(hotTea);
        vending.addProduct(hotCoffe);
        vending.addProduct(hotChocolat);
        
        System.out.println(vending.getProduct("Paulin"));
        System.out.println(vending.getProduct("Choco"));
        
    }
}

