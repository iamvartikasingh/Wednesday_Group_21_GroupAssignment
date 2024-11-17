/*
 * Supplier class with integrated price adjustments, simulations, and browsing functionalities.
 */
package model.Supplier;

import java.util.ArrayList;
import model.ProductManagement.Product;
import model.ProductManagement.ProductCatalog;
import model.ProductManagement.ProductSummary;
import model.ProductManagement.ProductsReport;

public class Supplier {
    String name;
    ProductCatalog productCatalog;
    ProductsReport productsReport;

    // Constructor
    public Supplier(String n) {
        name = n;
        productCatalog = new ProductCatalog("software");
    }

    // Prepare a report for product performance
    public ProductsReport prepareProductsReport() {
        productsReport = productCatalog.generatProductPerformanceReport();
        return productsReport;
    }

    // Get products that are always above the target
    public ArrayList<ProductSummary> getProductsAlwaysAboveTarget() {
        if (productsReport == null) productsReport = prepareProductsReport();
        return productsReport.getProductsAlwaysAboveTarget();
    }

    public String getName() {
        return name;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    // Method to browse and analyze product performance
    public void browseProductPerformance() {
        System.out.println("Browsing Product Performance for Supplier: " + name);
        for (Product product : productCatalog.getProducts()) {
            System.out.printf("Product: %s | Target Price: %d | Sales Volume: %d | Sales Above Target: %d | Sales Below Target: %d%n",
                product.toString(),
                product.getTargetPrice(),
                product.getSalesVolume(),
                product.getNumberOfProductSalesAboveTarget(),
                product.getNumberOfProductSalesBelowTarget()
            );
        }
    }

    // Method to browse and adjust product prices based on their performance
    public void browseAndAdjustPrices() {
        for (Product product : productCatalog.getProducts()) {
            if (product.getNumberOfProductSalesBelowTarget() > product.getNumberOfProductSalesAboveTarget()) {
                product.adjustTargetPrice(false); // Lower the target price
                System.out.printf("Lowered target price for %s to %d%n", product.toString(), product.getTargetPrice());
            } else if (product.getNumberOfProductSalesAboveTarget() > product.getNumberOfProductSalesBelowTarget()) {
                product.adjustTargetPrice(true); // Raise the target price
                System.out.printf("Increased target price for %s to %d%n", product.toString(), product.getTargetPrice());
            }
        }
    }

    // Method to calculate total revenue
    public double calculateTotalRevenue() {
        double totalRevenue = 0;
        for (Product product : productCatalog.getProducts()) {
            totalRevenue += product.getSalesVolume() * product.getTargetPrice();
        }
        return totalRevenue;
    }

    // Method to run a price simulation
    public void runPriceSimulation() {
        double previousRevenue = calculateTotalRevenue();
        double currentRevenue = previousRevenue;

        do {
            previousRevenue = currentRevenue;
            browseAndAdjustPrices(); // Adjust prices based on performance
            currentRevenue = calculateTotalRevenue();
            System.out.printf("New total revenue after adjustment: %.2f%n", currentRevenue);
        } while (currentRevenue > previousRevenue);

        System.out.println("Profit margins optimized for supplier: " + name);
    }

    @Override
    public String toString() {
        return name;
    }
}