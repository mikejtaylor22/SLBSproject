package org.wecancodeit.reviews;

public class CakeItem {
    private CakeType type;
    private String flavor;
    private String icing;
    private int price;
    private String shape;



    public CakeItem(CakeType type, String flavor, String icing, int price, String shape) {
        this.type = type;
        this.flavor = flavor;
        this.icing = icing;
        this.price = price;
        this.shape = shape;
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

    public int getPrice() {
        return price;
    }

    public String getShape() {
        return shape;
    }
}
