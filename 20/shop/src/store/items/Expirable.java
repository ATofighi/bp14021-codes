package store.items;

public interface Expirable {
    boolean isExpired();

    int getExpirationDays();
}
