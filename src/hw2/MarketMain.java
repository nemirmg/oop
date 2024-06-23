package hw2;

public class MarketMain {
    public static void main(String[] args) {
        Actor customer1 = new Human("Вася");
        Actor customer2 = new Human("Аня");
        Actor customer3 = new Human("Коля");

        Market market = new Market();
        market.acceptToMarket(customer1);
        market.acceptToMarket(customer2);
        market.acceptToMarket(customer3);
        
        System.out.println("Посетители магазина:");
        for (Actor customer : market.getActors()) {
            System.out.println(customer);
            market.takeInQueue(customer);
        }
        System.out.println();

        System.out.println("Посетители встали в очередь:");
        for (Actor customer : market.getQueue()) {
            System.out.println(customer);
        }
        System.out.println();
        
        while (market.getQueue().size() > 0) {
            market.update();
            System.out.println();
        }
    }
}
