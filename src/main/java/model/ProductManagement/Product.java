/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.ProductManagement;

import java.util.ArrayList;
import model.OrderManagement.OrderItem;

/**
 *
 * Modified version of Product class to include methods for adjusting target prices.
 */
public class Product {
    private String name;
    private int floorPrice;
    private int ceilingPrice;
    private int targetPrice;
    ArrayList<OrderItem> orderitems;

    // Constructors
    public Product(int fp, int cp, int tp) {
        floorPrice = fp;
        ceilingPrice = cp;
        targetPrice = tp;
        orderitems = new ArrayList<>();
    }

    public Product(String n, int fp, int cp, int tp) {
        name = n;
        floorPrice = fp;
        ceilingPrice = cp;
        targetPrice = tp;
        orderitems = new ArrayList<>();
    }

    // Method to adjust target price with respect to floor and ceiling limits
    public void adjustTargetPrice(boolean increase) {
        double adjustmentFactor = 0.05; // 5% adjustment factor
        if (increase) {
            int newTargetPrice = (int) (targetPrice * (1 + adjustmentFactor));
            // Ensure the new target price does not exceed the ceiling price
            targetPrice = Math.min(newTargetPrice, ceilingPrice);
        } else {
            int newTargetPrice = (int) (targetPrice * (1 - adjustmentFactor));
            // Ensure the new target price does not fall below the floor price
            targetPrice = Math.max(newTargetPrice, floorPrice);
        }
    }

    // Existing methods
    public Product updateProduct(int fp, int cp, int tp) {
        floorPrice = fp;
        ceilingPrice = cp;
        targetPrice = tp;
        return this; // returns itself
    }

    public int getTargetPrice() {
        return targetPrice;
    }

    public void addOrderItem(OrderItem oi) {
        orderitems.add(oi);
    }

    // Number of item sales above target
    public int getNumberOfProductSalesAboveTarget() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            if (oi.isActualAboveTarget()) sum++;
        }
        return sum;
    }

    public int getNumberOfProductSalesBelowTarget() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            if (oi.isActualBelowTarget()) sum++;
        }
        return sum;
    }

    public boolean isProductAlwaysAboveTarget() {
        for (OrderItem oi : orderitems) {
            if (!oi.isActualAboveTarget()) return false; // Return false if any item is below target
        }
        return true;
    }

    // Calculates the revenues gained or lost in relation to the target
    public int getOrderPricePerformance() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            sum += oi.calculatePricePerformance(); // Positive and negative values       
        }
        return sum;
    }

    public int getSalesVolume() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            sum += oi.getOrderItemTotal(); // Positive and negative values       
        }
        return sum;
    }

    public void setName(String n) {
        name = n;
    }

    @Override
    public String toString() {
        return name;
    }

    public int getFloorPrice() {
        return floorPrice;
    }

    public int getCeilingPrice() {
        return ceilingPrice;
    }

    // Optional utility method to provide a performance summary
    public String getPerformanceSummary() {
        return String.format("Product: %s | Target Price: %d | Floor Price: %d | Ceiling Price: %d | Sales Volume: %d",
                name, targetPrice, floorPrice, ceilingPrice, getSalesVolume());
    }
}