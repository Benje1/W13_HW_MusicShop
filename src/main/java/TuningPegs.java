import Instruments.AbstractInstuments.ISell;

public class TuningPegs extends MusicItems implements ISell {

    private int sellingPrice;

    public TuningPegs(int price) {
        super(price);
        this.sellingPrice = calculateMarkup();
    }

    public int calculateMarkup() {
        return this.getPrice() + 30;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }
}
