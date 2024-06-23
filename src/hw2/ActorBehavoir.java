package hw2;

public interface ActorBehavoir {
    public abstract void setMakeOrder(boolean value);
    public abstract void setTakeOrder(boolean value);
    public abstract boolean isMakeOrder();
    public abstract boolean isTakeOrder();
}
