package com.orhankaya.patikah2.service;

import com.orhankaya.patikah2.housetypes.House;
import com.orhankaya.patikah2.housetypes.SummerHouse;
import com.orhankaya.patikah2.housetypes.Villa;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class HouseService {
    private final List<House> houses;
    private final List<Villa> villas;
    private final List<SummerHouse> summerHouses;

    public double getTotalHousePrice() {
        return houses.stream().mapToDouble(House::getPrice).sum();
    }

    public double getTotalVillaPrice() {
        return villas.stream().mapToDouble(Villa::getPrice).sum();
    }

    public double getTotalSummerHousePrice() {
        return summerHouses.stream().mapToDouble(SummerHouse::getPrice).sum();
    }

    public double getTotalHousePriceAllTypes() {
        return getTotalHousePrice() + getTotalVillaPrice() + getTotalSummerHousePrice();
    }

    public double getAverageHouseSquareMeter() {
        return houses.stream().mapToDouble(House::getSquareMeters).average().orElse(0.0);
    }

    public double getAverageVillaSquareMeter() {
        return villas.stream().mapToDouble(Villa::getSquareMeters).average().orElse(0.0);
    }

    public double getAverageSummerHouseSquareMeter() {
        return summerHouses.stream().mapToDouble(SummerHouse::getSquareMeters).average().orElse(0.0);
    }

    public double getAverageHouseSquareMeterAllTypes() {
        int totalHouses = houses.size() + villas.size() + summerHouses.size();
        if (totalHouses == 0) {
            return 0.0; // Handle division by zero
        }
        return (houses.stream().mapToDouble(House::getSquareMeters).sum() +
                villas.stream().mapToDouble(Villa::getSquareMeters).sum() +
                summerHouses.stream().mapToDouble(SummerHouse::getSquareMeters).sum()) / totalHouses;
    }

    public List<House> getFilteredHouses(int roomCount, int saloonCount) {
        return houses.stream()
                .filter(house -> house.getRoomCount() == roomCount && house.getSaloonCount() == saloonCount)
                .toList(); // Create new, immutable list
    }
}
