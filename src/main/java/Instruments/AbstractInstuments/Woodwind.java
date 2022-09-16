package Instruments.AbstractInstuments;

public abstract class Woodwind implements IPlay, ISell{

    private int price;

    public Woodwind(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public java.lang.String bePlayed() {
        return "*Musical note*";
    }
}
