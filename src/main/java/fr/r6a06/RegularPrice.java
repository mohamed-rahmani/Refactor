package fr.r6a06;

public class RegularPrice extends Price {

    @Override
    public double getCharge(int daysRented){
        return (daysRented > 2) ? (daysRented - 2) * 1.5 + 2 : 2;
    }
    @Override
    public int getPriceCode() {
        return 0;
    }
}
