package org.wecancodeit.reviews;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class ReviewCakeItem {
   @Id
   @GeneratedValue
    private long id;
   @ManyToOne
    private CakeType type;
    private String flavor;
    private String icing;
    private double price;
    private String shape;
    private String description;

    protected ReviewCakeItem() {

    }

    public ReviewCakeItem(CakeType type, String flavor, String icing, double price, String shape, String description) {
        this.type = type;
        this.flavor = flavor;
        this.icing = icing;
        this.price = price;
        this.shape = shape;
        this.description = description;
    }

    public CakeType getType() {
        return type;
    }

    public String getFlavor() {
        return flavor;
    }

    public String getIcing() {
        return icing;
    }

    public double getPrice() {
        return price;
    }

    public String getShape() {
        return shape;
    }

    public String getDescription() { return description;}

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ReviewCakeItem{" +
                "id=" + id +
                ", type=" + type +
                ", flavor='" + flavor + '\'' +
                ", icing='" + icing + '\'' +
                ", price=" + price +
                ", shape='" + shape + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReviewCakeItem that = (ReviewCakeItem) o;
        return id == that.id && Double.compare(that.price, price) == 0 && Objects.equals(type, that.type) && Objects.equals(flavor, that.flavor) && Objects.equals(icing, that.icing) && Objects.equals(shape, that.shape) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, flavor, icing, price, shape, description);
    }
}
