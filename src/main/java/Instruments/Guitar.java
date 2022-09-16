package Instruments;

import Instruments.AbstractInstuments.String;

public class Guitar extends String {

    private int sellingPrice;
    public Guitar(int numberOfStrings, int price) {
        super(numberOfStrings, price);
        this.sellingPrice = calculateMarkup();
    }

    public int calculateMarkup() {
        return getPrice() + 75;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }
}
