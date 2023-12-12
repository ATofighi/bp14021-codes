package store;

import store.items.Item;

public class Store {
    private Item[] items;

    public Store(Item[] items) {
        this.items = items;
    }

    public void showItems() {
//        for(int i = 0; i < items.length; i++) {
//            Item item = items[i];
        for(Item item: items) {
            System.out.println(item.getItemId());
            System.out.println(item.getName() + ": " + item.getPrice());
            System.out.println(item.describe());
            System.out.println();
        }
    }

    public void buy(int itemId) {
        for(Item item: items) {
            if (item.getItemId() == itemId) {
                // بخر
                item.purchase();
                return;
            }
        }
        System.out.println("not found! :(");
    }
}
