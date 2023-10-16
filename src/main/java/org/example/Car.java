package org.example;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private Producer producer;
    private boolean isAutomaticGear;
    private Market market;
    private CarSegment segment;
    private List<Dimensions> dimensionsList;


    public Car(Producer producer, boolean isAutomaticGear, Market market, CarSegment segment, ArrayList<Dimensions> dimensionsList) {
        this.producer = producer;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.segment = segment;
        this.dimensionsList = dimensionsList;
    }


    public CarSegment getSegment() {
        return segment;
    }

    public void setSegment(CarSegment segment) {
        this.segment = segment;
    }

    public boolean isAutomaticGear() {
        return isAutomaticGear;
    }

    public void setAutomaticGear(boolean automaticGear) {
        isAutomaticGear = automaticGear;
    }

    public void printCountryAutomaticBMWOver300() {
        if (producer.getModel().equals("BMW") && isAutomaticGear) {
            for (Dimensions dimensions : dimensionsList) {
                if (dimensions.getTrunkCapacityLiter() > 300) {
                    for (Country country : market.getCountries()) {
                        System.out.println(country);
                    }
                }
            }
        }
    }
}
