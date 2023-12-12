package store.items.electronic_devices;

import store.items.Item;
import store.items.Transportable;

public abstract class Electronic extends Item implements Transportable {
    public Electronic(String name, int price) {
        super(name, price);
    }
}
