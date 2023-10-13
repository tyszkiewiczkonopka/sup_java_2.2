package org.example;

public class Dimensions {
    private int heightCm;
    private int widthCm;
    private int trunkCapacityLiter;


    public Dimensions(int heightCm, int widthCm, int trunkCapacityLiter) {
        this.heightCm = heightCm;
        this.widthCm = widthCm;
        this.trunkCapacityLiter = trunkCapacityLiter;
    }

    public int getHeightCm() {
        return heightCm;
    }

    public void setHeightCm(int heightCm) {
        this.heightCm = heightCm;
    }

    public int getWidthCm() {
        return widthCm;
    }

    public void setWidthCm(int widthCm) {
        this.widthCm = widthCm;
    }

    public int getTrunkCapacityLiter() {
        return trunkCapacityLiter;
    }

    public void setTrunkCapacityLiter(int trunkCapacityLiter) {
        this.trunkCapacityLiter = trunkCapacityLiter;
    }

    @Override
    public String toString() {
        return "Car dimensions: " + heightCm + " cm high, " + widthCm + " cm wide, " +
                trunkCapacityLiter + " liters of trunk capacity.";
    }

}
