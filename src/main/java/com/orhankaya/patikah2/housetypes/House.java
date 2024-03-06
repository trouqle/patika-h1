package com.orhankaya.patikah2.housetypes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class House {
    private String houseType;
    private double price;
    private double squareMeters;
    private int roomCount;
    private int saloonCount;


    @Override
    public String toString() {
        return "House Type: " + houseType + "\n" +
                "Price: " + price + "\n" +
                "Square Meters: " + squareMeters + "\n" +
                "Room Count: " + roomCount + "\n" +
                "Saloon Count: " + saloonCount + "\n";
    }
}
