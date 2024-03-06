package com.orhankaya.patikah2.housetypes;

public class SummerHouse extends House{
    private boolean hasGarden;

    public SummerHouse(double price, double squareMeters, int roomCount, int saloonCount, boolean hasGarden) {
        super("Summer House", price, squareMeters, roomCount, saloonCount);
        this.hasGarden = hasGarden;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Has Garden: " + (hasGarden ? "Yes" : "No") + "\n";
    }
}
