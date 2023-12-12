package store.items.food;

public class Apple extends Fruit{
    String color;

    public Apple(String name, int price, String color) {
        super(name, price);
        this.color = color;
    }

    @Override
    public String describe() {
        return color + " apple";
    }
}
