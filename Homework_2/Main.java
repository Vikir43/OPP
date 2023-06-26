package Homework_2;


import Homework_2.Actor.Human;
import Homework_2.Market.Market;

public class Main {
    public static void main(String[] args) {


        Market market = new Market();

        market.update();

        Human human1 = new Human("Лариса Иванова", 44 , "Ставрополь");
        Human human2 = new Human("Иван Михаленко", 35, "Москва");
        Human human3 = new Human("Виктория Павлова", 22, "Волгоград");
        Human human4 = new Human("Елисей Шлычков", 19, "Самара");
        Human human5 = new Human("Василий Петров", 32, "Санкт-Петербург");

        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.acceptToMarket(human3);
        market.acceptToMarket(human4);
        market.acceptToMarket(human1);
        market.acceptToMarket(human5);

        market.update();

        human1.setMakeOrder();
        human2.setMakeOrder();
        human3.setMakeOrder();
        human4.setMakeOrder();

        market.update();

        human4.setTakeOrder();
        human1.setTakeOrder();

        market.update();

        market.update();

    }
}

    

