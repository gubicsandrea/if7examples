package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Item> items = new ArrayList<>();

    public Library(List<Item> items) {
        if (items == null) {
            throw new IllegalArgumentException("...");
        }
        this.items = new ArrayList<>(items);
    }

    public List<Item> getItems() {
        return new ArrayList<>(items);
    }

    public void addItem(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("...");
        }
        items.add(item);
    }

    public boolean removeItem(Item item) {
        return items.remove(item);
    }
}
