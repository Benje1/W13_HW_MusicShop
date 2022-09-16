import Instruments.AbstractInstuments.ISell;

public class SheetMusic extends MusicItems implements ISell {

    private int sellingPrice;

    public SheetMusic(int price) {
        super(price);
        this.sellingPrice = calculateMarkup();
    }

    public int calculateMarkup() {
        return this.getPrice() + 50;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }
}
