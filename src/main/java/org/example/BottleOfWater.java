package org.example;

public class BottleOfWater extends Product{
    private double volume;
    public BottleOfWater(String name,double cost, double volume){
        super(name, cost);
        this.volume = volume;
    }



    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    @Override
    public String toString() {
        return "BottleOfWater{" +
                "name = " + super.getName() +
                " volume =" + volume +
                " cost = " + super.getCost() +
                '}';
    }
}

