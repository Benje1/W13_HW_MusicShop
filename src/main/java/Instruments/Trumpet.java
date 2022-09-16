package Instruments;

import Instruments.AbstractInstuments.Brass;

public class Trumpet extends Brass {

    private int sellingPrice;
    public Trumpet(int price, int numberOfValues) {
        super(price, numberOfValues);
        this.sellingPrice = calculateMarkup();
    }

    public int calculateMarkup() {
        return this.getPrice() + 120;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }
}
