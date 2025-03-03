package fr.r6a06;

public class NewReleasePrice extends Price{

    @Override
    public double getCharge(int daysRented) {
        return daysRented * 3;
    }

    @Override
    public int getPriceCode() {
        return 1;
    }
}
