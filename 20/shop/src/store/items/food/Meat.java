package store.items.food;

import store.items.Expirable;
import store.items.Item;
import store.items.Transportable;

public class Meat extends Item implements Transportable, Expirable {
    private int weight;

    public Meat(String name, int price, int weight) {
        super(name, price);
        this.weight = weight;
    }

    @Override
    public String describe() {
        return "Meat with weight " + weight + "kg";
    }

    @Override
    public boolean isExpired() {
        return false; // TODO: fix it
    }

    @Override
    public int getExpirationDays() {
        return 3;
    }
}
