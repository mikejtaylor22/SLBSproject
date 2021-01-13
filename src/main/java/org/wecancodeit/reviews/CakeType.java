package org.wecancodeit.reviews;
import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

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

    @Override
    public String toString() {
        return "CakeType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", items=" + items +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CakeType cakeType = (CakeType) o;
        return id == cakeType.id && Objects.equals(name, cakeType.name) && Objects.equals(items, cakeType.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, items);
    }
}
