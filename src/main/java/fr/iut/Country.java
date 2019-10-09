package fr.iut;

public enum Country {
    France(1.2);

    private final Double taxToApply;

    private Country(double taxToApply) {
        this.taxToApply = taxToApply;
    }

    public Double getTaxToApply() {
        return taxToApply;
    }
}
