package store;

import store.items.Item;
import store.items.electronic_devices.Laptop;
import store.items.food.Meat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Item meat = new Meat("گوشت", 450_000, 1);
        Item lenovo = new Laptop("Lenovo", 20_000_000, "4 gb", "intel");
        Item[] items = new Item[]{
                lenovo,
                meat,
        };
        Store store = new Store(items);
        store.showItems();

        Scanner sc = new Scanner(System.in);
        int itemId = sc.nextInt();
        store.buy(itemId);
    }
}
