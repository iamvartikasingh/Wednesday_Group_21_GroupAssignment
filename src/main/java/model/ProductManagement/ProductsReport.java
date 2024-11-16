package model.ProductManagement;

import java.util.ArrayList;

/**
 * Represents a report summarizing product performance.
 */
public class ProductsReport {

    ArrayList<ProductSummary> productsummarylist;

    public ProductsReport() {
        productsummarylist = new ArrayList<>();
    }

    public void addProductSummary(ProductSummary ps) {
        productsummarylist.add(ps);
    }

    public ProductSummary getTopProductAboveTarget() {
        ProductSummary currenttopproduct = null;

        for (ProductSummary ps : productsummarylist) {
            if (currenttopproduct == null) {
                currenttopproduct = ps; // initial step
            } else if (ps.getNumberAboveTarget() > currenttopproduct.getNumberAboveTarget()) {
                currenttopproduct = ps; // we have a new higher total
            }
        }
        return currenttopproduct;
    }

    public ArrayList<ProductSummary> getProductsAlwaysAboveTarget() {
        ArrayList<ProductSummary> productsalwaysabovetarget = new ArrayList<>();

        for (ProductSummary ps : productsummarylist) {
            if (ps.isProductAlwaysAboveTarget()) {
                productsalwaysabovetarget.add(ps);
            }
        }
        return productsalwaysabovetarget;
    }

    public void generateDetailedReport(ArrayList<Product> products) {
        System.out.println("Detailed Product Performance Report:");
        System.out.printf("%-20s %-15s %-15s %-15s %-20s %-20s %-15s%n", 
            "Product Name", "Target Price", "Sales Volume", "Above Target", "Below Target", "Price Performance", "Revenue");

        for (ProductSummary ps : productsummarylist) {
            Product product = ps.getSubjectProduct(); // Assuming a getter for the product
            System.out.printf("%-20s %-15d %-15d %-15d %-20d %-20d %-15d%n", 
                product.toString(), 
                product.getTargetPrice(), 
                ps.getSalesRevenues(), 
                ps.getNumberAboveTarget(), 
                ps.getNumberBelowTarget(), 
                 ps.getProductPricePerformance(), 
                ps.getSalesRevenues());
        }
    }
}