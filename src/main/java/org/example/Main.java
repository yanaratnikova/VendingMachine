package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        BottleOfWater b1 = new BottleOfWater("1", 20, 1);
        BottleOfWater b2 = new BottleOfWater("2", 25, 1.5);
        BottleOfWater b3 = new BottleOfWater("3", 30, 2);
        BottleOfWater b4 = new BottleOfWater("4", 12, 1);
        BottleOfWater b5 = new BottleOfWater("5", 35, 1.5);

        BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine();
        vendingMachine.addBottleOfWater(b1);
        vendingMachine.addBottleOfWater(b2);
        vendingMachine.addBottleOfWater(b3);
        vendingMachine.addBottleOfWater(b4);
        vendingMachine.addBottleOfWater(b5);
       // System.out.println(vendingMachine.getProductByName("5"));
        for (BottleOfWater b: vendingMachine.getBottleOfWaterList()){
            System.out.println(b);
        }
    }

}
