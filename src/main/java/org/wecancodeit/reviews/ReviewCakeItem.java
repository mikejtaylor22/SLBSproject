package org.wecancodeit.reviews;

public class ReviewCakeItem {
    private CakeType type;
    private String flavor;
    private String icing;
    private double price;
    private String shape;
    private String description;



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
}
