package hw2;

public abstract class Actor implements ActorBehavoir {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public Actor(String name) {
        this.name = name;
    }

    public abstract String getName();

    @Override
    public String toString() {
        return name + " [make_order=" + isMakeOrder + 
               ", take_order=" + isTakeOrder + "]";
    }
    
}
