package store.items;

public abstract class Item {
    private static int nextItemId = 1;

    private int itemId;
    private String name;
    private int price;

    public Item(String name, int price) {
        itemId = nextItemId;
        nextItemId++;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract String describe();

    public int getItemId() {
        return itemId;
    }

    public void purchase() {
        System.out.println("You bought item " + getItemId());
    }
}
