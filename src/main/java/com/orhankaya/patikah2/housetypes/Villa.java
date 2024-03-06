package com.orhankaya.patikah2.housetypes;

public class Villa extends House{

    private boolean hasPool;

    public Villa(double price, double squareMeters, int roomCount, int saloonCount, boolean hasPool) {
        super("Villa", price, squareMeters, roomCount, saloonCount);
        this.hasPool = hasPool;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Has Pool: " + (hasPool ? "Yes" : "No") + "\n";
    }
}
