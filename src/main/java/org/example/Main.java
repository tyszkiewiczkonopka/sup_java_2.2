package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Country poland = new Country("Poland", 'P');
        Country italy = new Country("Italy", 'I');
        Country france = new Country("France", 'F');
        Country spain = new Country("Spain", 'S');
        Country norway = new Country("Norway", 'N');

        List<Country> countryList = new ArrayList<>();
        countryList.add(poland);
        countryList.add(italy);
        countryList.add(france);
        countryList.add(spain);
        countryList.add(norway);

        Market businessNorth = new Market("business", countryList);
        Market cargoNorth = new Market("cargo", countryList);
        Market transportSouth = new Market("transport", countryList);
        Market taxiSouth = new Market("taxi", countryList);
        Market busNorth = new Market("bus", countryList);

        Dimensions dimensions1 = new Dimensions(15435351, 157687681, 121);
        Dimensions dimensions2 = new Dimensions(12322, 2544452, 212);
        Dimensions dimensions3 = new Dimensions(46543, 36463, 43);
        Dimensions dimensions4 = new Dimensions(4444, 44211, 453);
        Dimensions dimensions5 = new Dimensions(535, 535, 551);
        Dimensions dimensions6 = new Dimensions(6546, 646, 66);
        Dimensions dimensions7 = new Dimensions(72527, 557, 3577);
        Dimensions dimensions8 = new Dimensions(8338, 88, 858);
        Dimensions dimensions9 = new Dimensions(994, 929, 339);
        Dimensions dimensions10 = new Dimensions(1300, 1060, 140);

        ArrayList<Dimensions> dimensionsArrayList = new ArrayList<>();
        dimensionsArrayList.add(dimensions2);
        dimensionsArrayList.add(dimensions1);
        dimensionsArrayList.add(dimensions3);
        dimensionsArrayList.add(dimensions4);
        dimensionsArrayList.add(dimensions5);
        dimensionsArrayList.add(dimensions6);
        dimensionsArrayList.add(dimensions7);
        dimensionsArrayList.add(dimensions8);
        dimensionsArrayList.add(dimensions9);
        dimensionsArrayList.add(dimensions10);

        Producer producer1 = new Producer("Tesla", "Model Y");
        Producer producer2 = new Producer("Dacia", "Sandero");
        Producer producer3 = new Producer("Renault", "Clio");
        Producer producer4 = new Producer("Volkswagen ", "T-Roc");
        Producer producer5 = new Producer("BMW", "X5");
        Producer producer6 = new Producer("Opel", "Corsa");
        Producer producer7 = new Producer("Peugeot ", "208");
        Producer producer8 = new Producer("Toyota", "Yaris");
        Producer producer9 = new Producer("BMW", "i8");
        Producer producer10 = new Producer("BMW", "3 series");

        Car car1 = new Car(producer2, true, businessNorth, CarSegment.MEDIUM, dimensionsArrayList);
        Car car2 = new Car(producer4, false, cargoNorth, CarSegment.STANDARD, dimensionsArrayList);
        Car car3 = new Car(producer10, true, transportSouth, CarSegment.PREMIUM, dimensionsArrayList);
        Car car4 = new Car(producer5, false, taxiSouth, CarSegment.STANDARD, dimensionsArrayList);
        Car car5 = new Car(producer8, true, busNorth, CarSegment.STANDARD, dimensionsArrayList);
        Car car6 = new Car(producer7, false, businessNorth, CarSegment.PREMIUM, dimensionsArrayList);
        Car car7 = new Car(producer2, true, cargoNorth, CarSegment.MEDIUM, dimensionsArrayList);
        Car car8 = new Car(producer1, false, taxiSouth, CarSegment.PREMIUM, dimensionsArrayList);
        Car car9 = new Car(producer3, true, taxiSouth, CarSegment.MEDIUM, dimensionsArrayList);
        Car car10 = new Car(producer6, false, transportSouth, CarSegment.STANDARD, dimensionsArrayList);
        Car car11 = new Car(producer9, true, cargoNorth, CarSegment.PREMIUM, dimensionsArrayList);
        Car car12 = new Car(producer5, false, businessNorth, CarSegment.STANDARD, dimensionsArrayList);
        Car car13 = new Car(producer9, true, busNorth, CarSegment.PREMIUM, dimensionsArrayList);
        Car car14 = new Car(producer10, false, businessNorth, CarSegment.PREMIUM, dimensionsArrayList);
        Car car15 = new Car(producer1, true, busNorth, CarSegment.STANDARD, dimensionsArrayList);

        List<Car> carsList = new ArrayList<>();
        carsList.add(car1);
        carsList.add(car2);
        carsList.add(car3);
        carsList.add(car4);
        carsList.add(car5);
        carsList.add(car6);
        carsList.add(car7);
        carsList.add(car8);
        carsList.add(car9);
        carsList.add(car10);
        carsList.add(car11);
        carsList.add(car12);
        carsList.add(car13);
        carsList.add(car14);
        carsList.add(car15);

        for (Car c : carsList) {
            c.printCountryAutomaticBMWOver300();
        }

    }
}