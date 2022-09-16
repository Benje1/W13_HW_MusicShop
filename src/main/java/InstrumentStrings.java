import Instruments.AbstractInstuments.ISell;

public class InstrumentStrings extends MusicItems implements ISell {

    private char string;
    private int sellingPrice;

    public InstrumentStrings(int price, char string) {
        super(price);
        this.string = string;
        this.sellingPrice = calculateMarkup();
    }

    public char getString() {
        return string;
    }

    public int calculateMarkup() {
        return this.getPrice() + 20;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }
}
