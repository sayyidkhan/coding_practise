package com.tim;

public class StockItem implements Comparable<StockItem> {

    private final String name;
    private double price;
    private int quantityinStock = 0;
    private int reserved = 0;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        int quantityStock = 0;
    }

    public StockItem(String name, double price, int quantityinStock) {
        this.name = name;
        this.price = price;
        this.quantityinStock = quantityinStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int availableQuantity() {
        return quantityinStock - reserved;
    }

    public void setPrice(double price) {
        if(price > 0.0){
            this.price = price;
        }
    }

    public void adjustStock(int quantity){
        int newQuantity = this.quantityinStock + quantity;
        if(newQuantity >= 0){
            this.quantityinStock = newQuantity;
        }
    }

    public int reservedStock(int quantity){
        // using the method not the field: refers to the availableQuantity()
        if(quantity <= availableQuantity()) {
            reserved += quantity;
            return quantity;
        }
        return 0;
    }

    public int unreserveStock(int quantity){
        if(quantity <= reserved){
            reserved -= quantity;
            return quantity;
        }
        return 0;
    }

    public int finaliseStock(int quantity){
        if(quantity <= reserved){
            quantityinStock -= quantity;
            reserved -= quantity;
            return quantity;
        }
        return 0;
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
        // System.out.println("Entering StockItem.compareTo");
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
        return this.name + " : price " + this.price + ". Reserved: " + this.reserved ;
    }


}
