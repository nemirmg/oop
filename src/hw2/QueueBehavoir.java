package hw2;

public interface QueueBehavoir {
    void takeInQueue(Actor actor);  // помещение в очередь

    void takeOrders();  // приём заказов

    void giveOrders();  // выдача заказов
    
    void releaseFromQueue();  // освобождение из очереди
}
