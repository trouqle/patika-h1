package com.orhankaya.patikah2;

import com.orhankaya.patikah2.housetypes.House;
import com.orhankaya.patikah2.housetypes.SummerHouse;
import com.orhankaya.patikah2.housetypes.Villa;
import com.orhankaya.patikah2.service.HouseService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class PatikaH2Application {

    public static void main(String[] args) {
        House house1 = new House("House", 1000000, 100, 3, 1);
        House house2 = new House("House", 1500000, 120, 4, 2);
        House house3 = new House("House", 2000000, 150, 5, 3);

        Villa villa1 = new Villa(3000000, 200, 5, 3, true);
        Villa villa2 = new Villa(4000000, 250, 6, 4, true);
        Villa villa3 = new Villa(5000000, 300, 7, 5, true);


        SummerHouse summerHouse1 = new SummerHouse(500000, 50, 2, 1, true);
        SummerHouse summerHouse2 = new SummerHouse(750000, 75, 3, 2, true);
        SummerHouse summerHouse3 = new SummerHouse(1000000, 100, 4, 3, true);


        List<House> houses = List.of(house1, house2, house3);
        List<Villa> villas = List.of(villa1, villa2, villa3);
        List<SummerHouse> summerHouses = List.of(summerHouse1,summerHouse2, summerHouse3);
        HouseService service = new HouseService(houses, villas, summerHouses);

        SpringApplication.run(PatikaH2Application.class, args
        );
    }

}
