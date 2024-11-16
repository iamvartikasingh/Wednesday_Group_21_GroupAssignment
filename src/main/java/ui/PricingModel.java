/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import ui.MainJFrame;
import model.Business.Business;
import model.Business.ConfigureABusiness;
import model.ProductManagement.ProductsReport;
import model.Supplier.Supplier;

/**
 *
 * @author kal bugrara
 */
public class PricingModel {

  /**
   * @param args the command line arguments
   */

    Business business = ConfigureABusiness.initialize();
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new MainJFrame().setVisible(true);
        });
    Business business = ConfigureABusiness.initialize();

    Supplier supplier = new Supplier("Example Supplier");

    supplier.getProductCatalog().newProduct("Product A", 100, 200, 150);
    supplier.getProductCatalog().newProduct("Product B", 50, 150, 100);
    supplier.getProductCatalog().newProduct("Product C", 30, 130, 80);

    System.out.println("Initial Product Performance Report:");
    supplier.prepareProductsReport();

    System.out.println("\nRunning Price Simulation...");
    supplier.runPriceSimulation();

    System.out.println("\nFinal Product Performance Report:");
    ProductsReport finalReport = supplier.prepareProductsReport();
    finalReport.generateDetailedReport(supplier.getProductCatalog().getProducts());
  }
  }



