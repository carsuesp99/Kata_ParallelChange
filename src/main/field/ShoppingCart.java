package main.field;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Integer> prices = new ArrayList<>();

    public void add(int price){
        this.prices.add(price);
    }
    public int calculateTotalPrice() {
        int totalPrice = 0;
        for(int price: this.prices){
            totalPrice += price;
        }
        return totalPrice;
    }

    public boolean hasDiscount() {
        for(int price: this.prices){
            if(price >= 100){
                return true;
            }
        }
        return false;
    }

    public int numberOfProducts(){
        return prices.size();
    }
}
