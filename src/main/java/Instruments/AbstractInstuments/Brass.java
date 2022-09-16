package Instruments.AbstractInstuments;

public abstract class Brass implements IPlay, ISell{

    private int price;
    private int numberOfValues;

    public Brass(int price, int numberOfValues) {
        this.price = price;
        this.numberOfValues = numberOfValues;
    }

    public int getPrice() {
        return price;
    }

    public int getNumberOfValues() {
        return numberOfValues;
    }

    public java.lang.String bePlayed() {
        return "*Musical note*";
    }
}
