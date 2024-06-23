package hw2;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehavoir, MarketBehaviour {
    private List<Actor> actors = new ArrayList<>();
    private List<Actor> queue = new ArrayList<>();

    public List<Actor> getActors() {
        return actors;
    }

    public List<Actor> getQueue() {
        return queue;
    }
    
    @Override
    public void acceptToMarket(Actor actor) {
        actors.add(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        System.out.println(actors.get(0).getName() + " покинул магазин.");
        actors.remove(0);
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
        releaseFromMarket(actors);
    }

    @Override
    public void takeInQueue(Actor actor) {
        queue.add(actor);
    }

    @Override
    public void takeOrders() {
        queue.get(0).setMakeOrder(true);
        System.out.println("Заказ принят: " + queue.get(0));
    }

    @Override
    public void giveOrders() {
        queue.get(0).setTakeOrder(true);
        System.out.println("Заказ выдан: " + queue.get(0));
    }

    @Override
    public void releaseFromQueue() {
        queue.remove(0);
        if (queue.size() == 0)
            System.out.println("Очередь закончилась!");
        else
            System.out.println("В очереди осталось: " + queue.size() + " чел.");
    }
}
