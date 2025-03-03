package fr.r6a06;

public class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public double getCharge() {
        return this.getMovie().getCharge(this.getDaysRented());
    }

    public int getFrequentRenterPoints() {
        return this.getMovie().getFrequentRenterPoint(this.getDaysRented());
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }
}
