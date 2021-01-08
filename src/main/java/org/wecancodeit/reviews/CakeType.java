package org.wecancodeit.reviews;
import java.util.Collection;

public class CakeType {
    private long id;
    private String name;
    private Collection<ReviewCakeItem> items;


    public CakeType(String name, Collection<ReviewCakeItem> items, long id) {
        this.id = id;
        this.name = name;
        this.items = items;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Collection<ReviewCakeItem> getItems() {
        return items;
    }
}
