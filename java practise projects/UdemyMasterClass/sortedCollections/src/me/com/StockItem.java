package me.com;

public class StockItem implements Comparable<StockItem> {

    private final String name;
    private double price;
    private int quantityStock = 0;
    private int reserved = 0;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        int quantityStock = 0;
    }

    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
    }

    public int getReserved() {
        return reserved;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int QuantityInStock() {
        return quantityStock;
    }

    public void setPrice(double price) {
        if(price > 0.0){
            this.price = price;
        }
    }

    public int reserveStock(int quantity){
        int quantityCheck = this.quantityStock - this.reserved - quantity;
        if((quantity > 0) && (quantityCheck >= 0)) {
            this.reserved += quantity;
            return quantity;
        }
        return 0;
    }

    public void unreserveStock(int quantity) {
        if((this.reserved > 0) && (this.reserved - quantity >= 0)){
            this.reserved -= quantity;
        }
    }

    public void checkOut() {
        if(this.reserved > 0){
            adjustStock(this.reserved);
            this.reserved = 0;
        }
    }

    public void adjustStock(int quantity){
        int newQuantity = this.quantityStock + quantity;
        if(newQuantity >= 0){
            this.quantityStock = newQuantity;
        }
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Entering StockItem.equals");
        if(obj == this){
            return true;
        }

        if(obj == null || (obj.getClass() != this.getClass())){
            return false;
        }

        String objName = ((StockItem) obj).getName();
        return this.name.equals(objName);

    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 31;
    }

    @Override
    public int compareTo(StockItem o) {
        System.out.println("Entering StockItem.compareTo");
        if(this == o){
            return 0; // same object
        }
        if(o != null){
            return this.name.compareTo(o.getName());
        }

        throw new NullPointerException(); //
        // to tell the user to compare something to not compare with null
    }

    @Override
    public String toString() {
        return this.name + " : price " + this.price;
    }
}
