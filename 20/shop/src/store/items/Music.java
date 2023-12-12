package store.items;

public class Music extends Item {
    String downloadUrl;
    // TODO: add artist and ....

    public Music(String name, int price, String downloadUrl) {
        super(name, price);
        this.downloadUrl = downloadUrl;
    }

    @Override
    public String describe() {
        return getName();
    }
}
