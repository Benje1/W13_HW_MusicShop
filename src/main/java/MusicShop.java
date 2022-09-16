import Instruments.AbstractInstuments.ISell;

import java.util.ArrayList;

public class MusicShop {

    private ArrayList<ISell> stock;
    private String name;
    private int till;

    public MusicShop(String name) {
        this.stock = new ArrayList<ISell>();
        this.name = name;
        this.till = 50000;
    }

    public int getStock() {
        return stock.size();
    }

    public String getName() {
        return name;
    }

    public int getTill() {
        return till;
    }

    private void sellTill(int price) {
        this.till += price;
    }

    private void buyTill(int price){
        this.till -= price;
    }

    public ISell sellStock(ISell item){
        sellTill(item.getSellingPrice());
        return this.stock.remove(stock.indexOf(item));
    }

    public void addStock(ISell item){
        buyTill(item.getPrice());
        this.stock.add(item);
    }

    public int calculateTotalValueInShop(){
        int total = 0;
        for (ISell iSell : stock) {
            total += iSell.getSellingPrice();
        }
        return total;
    }
}
