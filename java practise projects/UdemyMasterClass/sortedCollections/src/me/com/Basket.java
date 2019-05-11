package me.com;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Basket {

    private final String name;
    private final Map<StockItem, Integer> list;
    private Map<StockItem, Integer> reservedList;

    public Basket(String name) {
        this.name = name;
        this.list = new TreeMap<>();
        this.reservedList = new TreeMap<>();
    }

//    public void addToBasket(StockList stockList){
//
//        boolean checkOutStatus = false;
//
//        for(Map.Entry<StockItem, Integer> stockItem : reservedList.entrySet() ) {
//
//            StockItem theStockObject = stockItem.getKey();
//            Integer theStockReservedQuantity = stockItem.getValue();
//
////            if(stockList.get(theStockObject.getName()) != null) {
////                System.out.println(true);
////                addIndividualItemToBasket(theStockObject,theStockReservedQuantity);
////                checkOutStatus = true;
////            }
//
//        }
//
////        return checkOutStatus;
//    }

    public void addToBasket(){

        for( Map.Entry<StockItem,Integer> stockItem : reservedList.entrySet() ){

            StockItem theStockObject = stockItem.getKey();
            Integer theStockReservedQuantity = stockItem.getValue();
            System.out.println("thestockobject: " + theStockObject + ", theStockReservedQuantity: " + theStockReservedQuantity );

            // put the item in the basket //

        }

        //            int inBasket  = list.getOrDefault(item,0);
        //            list.put(item,inBasket + quantity);
        //            unreserveFromBasket(item,quantity);
        //            return inBasket;
        //        }
        //        return 0;
    }

    public int reserveToBasket(StockItem item,int quantity){
        int inReservedListBasket  = reservedList.getOrDefault(item,0);
        if((item != null) && (quantity > 0)){
            //System.out.println(inReservedListBasket);
            reservedList.put(item,inReservedListBasket + quantity);
            return inReservedListBasket;
        }
        return 0;
    }

    public int unreserveFromBasket(StockItem item,int quantity){

        int inReservedListBasket  = reservedList.getOrDefault(item,0);
        if((item != null) && (quantity > 0) && (inReservedListBasket > 0)) {
            int reservedItemBalance = inReservedListBasket - quantity;
            reservedList.put(item,reservedItemBalance); // return the balance quantity
            //System.out.println(inReservedListBasket);
             item.unreserveStock(quantity); // unreserve the amount

            if(reservedItemBalance == 0){
                reservedList.keySet().removeIf(key -> key.getName() == item.getName());
            }

            return quantity;
        }
        return 0;

    }

    public Map.Entry<StockItem, Integer> checkItemInReservedList(String item){
        for(Map.Entry<StockItem, Integer> stockItem : this.reservedList.entrySet() ){
            if(stockItem.getKey().getName() == item){
                return stockItem;
            }
        }
        return null;
    }


    public Map<StockItem, Integer> Items(){
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nShopping Basket" + name + " contains " + list.size() + (list.size() == 1 ? " item" : " items") + "\n";
        double totalCost = 0.0;
        for(Map.Entry<StockItem, Integer> item :list.entrySet()){
            s = s + item.getKey() + " . " + item.getValue() + " purchased\n";
            totalCost += item.getKey().getPrice() * item.getValue();
        }
        return s + "Total cost " + totalCost;
    }
}
