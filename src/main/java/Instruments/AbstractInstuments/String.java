package Instruments.AbstractInstuments;

public abstract class String implements IPlay, ISell{

    private int numberOfStrings;
    private int price;

    public String(int numberOfStrings, int price) {
        this.numberOfStrings = numberOfStrings;
        this.price = price;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public int getPrice() {
        return price;
    }

    public java.lang.String bePlayed() {
        return "*Musical note*";
    }
}
