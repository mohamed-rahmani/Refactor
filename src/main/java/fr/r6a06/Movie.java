package fr.r6a06;

public class Movie {
    public static final int  CHILDRENS = 2;
    public static final int  REGULAR = 0;
    public static final int  NEW_RELEASE = 1;

    private String _title;
    private Price _price;

    public Movie(String title, int priceCode) {
        _title = title;
        this.setPriceCode(priceCode);
    }
    public int getPriceCode() {
        return _price.getPriceCode();
    }
    public void setPriceCode(int priceCode) {
        if(priceCode == REGULAR){
            this._price = new RegularPrice();
        }
        else if (priceCode == NEW_RELEASE){
            this._price = new NewReleasePrice();
        }
        else if (priceCode == CHILDRENS) {
            this._price = new ChildrensPrice();
        }
    }
    public String getTitle (){
        return _title;
    };

    public double getCharge(int daysRented){
        return _price.getCharge(daysRented);
    }

    public int getFrequentRenterPoint(int daysRented) {
        if ((this.getPriceCode() == Movie.NEW_RELEASE) &&
                daysRented > 1)
            return 2;
        else
            return 1;
    }
}