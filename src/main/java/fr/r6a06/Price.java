package fr.r6a06;

public abstract class Price {

    public abstract int getPriceCode();

    public abstract double getCharge(int daysRented);

    public static class PriceBuilder {
        private int priceCode;

        public PriceBuilder withPriceCode(int priceCode) {
            this.priceCode = priceCode;
            return this;
        }
        public Price build() {
            if (priceCode == 0) { return new RegularPrice(); }
            if (priceCode == 1) { return new NewReleasePrice(); }
            return new ChildrensPrice();
        }
    }
}
