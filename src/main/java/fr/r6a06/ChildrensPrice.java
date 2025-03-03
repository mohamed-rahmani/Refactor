package fr.r6a06;

public class ChildrensPrice extends Price{

    @Override
    public double getCharge(int daysRented) {
        return (daysRented > 3) ? (daysRented - 3) * 1.5 + 1.5 : 1.5;
    }

    @Override
    public int getPriceCode() {
        return 2;
    }
}
