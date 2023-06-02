package Homework_1;

import java.util.ArrayList;
import java.util.List;
    
public abstract class Vending {
    

        private final List<Product> list;
    
        public Vending() {
            list = new ArrayList<>();
        }
    
        void addProduct(Product product) {
            list.add(product);
        }
    
        Product getProduct(String name) {
            for (Product product : list) {
                if (name.equals(product.getName())) {
                    return product;
                }
            }
            return null;
        }
    
        Product getProduct(Long volume) {
            for (Product product : list) {
                if (volume.equals(product.getVolume())) {
                    return product;
                }
            }
            return null;
        }
    
    }  

