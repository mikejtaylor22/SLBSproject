package org.wecancodeit.reviews;
import javax.persistence.*;
import java.util.Collection;

@Entity
public class CakeType {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @OneToMany(mappedBy = "type")
    private Collection<ReviewCakeItem> items;


    public CakeType(String name) { this.name = name; }

    public CakeType() {

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
