package my.room;

public class Furniture {

    public Furniture(String furnitureType, String Brand, Dimensions tableDimensions, String color) {
        this.furnitureType = furnitureType;
        this.Brand = Brand;
        this.tableDimensions = tableDimensions;
        this.color = color;
    }

    private String furnitureType;
    private String Brand;
    private Dimensions tableDimensions;
    private String color;



    public String getFurnitureType() {
        return furnitureType;
    }

    public String getBrand() {
        return Brand;
    }

    public Dimensions getTableDimensions() {
        return tableDimensions;
    }

    public String getColor() {
        return color;
    }
}
