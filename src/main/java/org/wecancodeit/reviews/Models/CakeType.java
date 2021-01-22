package org.wecancodeit.reviews.Models;

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

    @Override
    public String toString() {
        return "CakeType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CakeType cakeType = (CakeType) o;

        if (id != cakeType.id) return false;
        return name != null ? name.equals(cakeType.name) : cakeType.name == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
