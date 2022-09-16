package Instruments;

import Instruments.AbstractInstuments.Woodwind;

public class Oboe extends Woodwind {

    private int sellingPrice;

    public Oboe(int price) {
        super(price);
        this.sellingPrice = calculateMarkup();
    }

    public int calculateMarkup() {
        return this.getPrice() + 100;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }
}
