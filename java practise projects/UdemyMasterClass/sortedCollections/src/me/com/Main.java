package me.com;

import java.util.Map;

public class Main {

    private static StockList stockList = new StockList();

    public static void main(String[] args) {

        addStock2StockList("bread",0.86,100);
        addStock2StockList("cake",1.10,7);
        addStock2StockList("car",12.50,2);
        addStock2StockList("chair",62.0,10);
        addStock2StockList("cup",0.50,200);
        addStock2StockList("cup",0.45,7);
        addStock2StockList("door", 72.95,4);
        addStock2StockList("juice",2.50,36);
        addStock2StockList("phone",96.99,35);
        addStock2StockList("towel",2.40,80);
        addStock2StockList("vase",8.76,40);


        System.out.println(stockList);
        /*
        for(String s : stockList.items().keySet()){
            System.out.println(s);
        }
        */

        Basket timsBasket = new Basket("Tim");
        reserveItem(timsBasket,"car",1);
        System.out.println(stockList.get("car").getReserved()); // check if the quantity have been reserved
        reserveItem(timsBasket,"car",3);
        System.out.println(stockList.get("car").getReserved()); // check if the quantity have been reserved

        reserveItem(timsBasket,"towel",10);
        reserveItem(timsBasket,"vase",20);

        System.out.println();
        checkOutItem(timsBasket);
        System.out.println();

        System.out.println(timsBasket);

        System.out.println();
        System.out.println(stockList);

        /*
        if(checkOutItem(timsBasket,"car",1) != 1){
            System.out.println("There are no more cars in stock");
        }
        System.out.println(timsBasket);

        checkOutItem(timsBasket,"car",1);
        checkOutItem(timsBasket,"spanner",5);
        System.out.println(timsBasket);

        checkOutItem(timsBasket,"juice",4);
        checkOutItem(timsBasket,"cup",12);
        checkOutItem(timsBasket,"bread",1);
        System.out.println(timsBasket);

        System.out.println(stockList);

//        temp = new StockItem("pen",1.12);
//        stockList.items().put(temp.getName(),temp);

        stockList.items().get("car").adjustStock(2000);
        stockList.get("car").adjustStock(-1000);
        System.out.println(stockList);

        System.out.println();
        for(Map.Entry<String,Double> price : stockList.PriceList().entrySet()){
            System.out.println(price.getKey() + " cost " + price.getValue());
        }
        */

    }

    // need to do validation for the checkout item
    // need to validate if there is any item to checkout, if no item throw error
    public static void checkOutItem(Basket basket) {
        if (true) {
            basket.addToBasket();
            System.out.println("Checkout successfully");
        }
        else{
            System.out.println("Unable to checkout");
        }
    }

    public static int reserveItem(Basket basket, String item, int quantity){
        // retrieve the item from the stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null){
            System.out.println("stock " + item + " does not exist.");
            return 0;
        }

        if(stockItem.reserveStock(quantity) > 0){
            System.out.println("Stock " + item + " reserved successfully.");
            // the stockitem is stored in the basket, with the reserved still monitored
            basket.reserveToBasket(stockItem, quantity);
            return quantity;
        }
        else{
            System.out.println("Unable to reserve Stock " + item);
            System.out.println("You are trying to reserve more than the current available stock");
            System.out.println("Stock current quantity: " + stockItem.getQuantityInStock());
            System.out.println("Available to be reserved quantity: " + (stockItem.getQuantityInStock() - stockItem.getReserved()) );
        }

        return 0;
    }

    public static int unreserveItem(Basket basket, String item, int quantity){
        // retrieve the item from the basket
        Map.Entry<StockItem, Integer> reservedStockItemInBasket = basket.checkItemInReservedList(item);

        if( reservedStockItemInBasket == null || reservedStockItemInBasket.getKey() == null ){
            System.out.println("Unable to unreserve item.");
            System.out.println("stock " + item + " does not exist.");
            return 0;
        }

        if(reservedStockItemInBasket.getValue() > 0){
            System.out.println("Stock " + item + " unreserved successfully.");
            // the stockitem is stored in the basket, with the reserved still monitored
            basket.unreserveFromBasket( reservedStockItemInBasket.getKey() , quantity );
            return quantity;
        }
        else{
            System.out.println("Unable to reserve Stock " + item);
        }

        return 0;
    }


    public static void addStock2StockList(String name,double price,int quantity){
        StockItem temp = new StockItem(name,price,quantity);
        stockList.addStock(temp);

    }

}
