package org.example;

import java.util.ArrayList;
import java.util.List;

public class BottleOfWaterVendingMachine implements IVendingMachine{
    private List<BottleOfWater> bottleOfWaterList;

    public BottleOfWaterVendingMachine(List<BottleOfWater> bottleOfWaterList) {
        this.bottleOfWaterList = bottleOfWaterList;
    }
    public BottleOfWaterVendingMachine(){
        this.bottleOfWaterList = new ArrayList<>();
    }


    @Override
    public Product getProductByName(String name) {
        for (BottleOfWater bottle: bottleOfWaterList){
            if (bottle.getName().equals(name))
                return bottle;
        }
        return null;
    }

    @Override
    public Product getProductByCost(double cost) {
        for (BottleOfWater bottle: bottleOfWaterList){
            if (bottle.getCost() == cost)
                return bottle;
        }
        return null;
    }

    public List<BottleOfWater> getBottleOfWaterList() {
        return bottleOfWaterList;
    }

    public void setBottleOfWaterList(List<BottleOfWater> bottleOfWaterList) {
        this.bottleOfWaterList = bottleOfWaterList;
    }
    public void addBottleOfWater(BottleOfWater bottleOfWater){
        this.bottleOfWaterList.add(bottleOfWater);
    }
}
