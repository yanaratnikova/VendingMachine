package org.example;

public interface  IVendingMachine {
    public Product getProductByName(String name);
    public Product getProductByCost(double cost);
}
