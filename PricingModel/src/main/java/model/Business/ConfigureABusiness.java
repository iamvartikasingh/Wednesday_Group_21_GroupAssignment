/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Business;

import model.CustomerManagement.CustomerProfile;
import model.MarketingManagement.MarketingPersonProfile;
import model.OrderManagement.Order;
import model.OrderManagement.OrderItem;
import model.Personnel.*;
import model.ProductManagement.Product;
import model.ProductManagement.ProductCatalog;
import model.SalesManagement.SalesPersonProfile;
import model.Supplier.Supplier;
import model.UserAccountManagement.UserAccount;

/**
 * @author kal bugrara
 */
public class ConfigureABusiness {

    public static Business initialize() {
        Business business = new Business("Xerox");

        //Supplier 1 - Samsung
        Supplier supplier1 = business.getSupplierDirectory().newSupplier("PrintMasters Inc.");
        ProductCatalog productCatalog1 = supplier1.getProductCatalog();
        // newProduct(String n, int fp, int cp, int tp)
        Product product1 = productCatalog1.newProduct("LaserJet Pro 500 Cartridges", 900, 2000, 1450);
        Product product2 = productCatalog1.newProduct("ColorSync Toner Pack", 1000, 2100, 1550);
        Product product3 = productCatalog1.newProduct("PhotoGloss Paper 8.5x11", 800, 1800, 1300);
        Product product4 = productCatalog1.newProduct("Office Essentials Copy Paper", 850, 1900, 1375);
        Product product5 = productCatalog1.newProduct("High-Yield Black Ink", 750, 1700, 1225);
        Product product6 = productCatalog1.newProduct("Premium Business Cards Stock", 770, 1750, 1260);
        Product product7 = productCatalog1.newProduct("Advanced Print Head Cleaner", 700, 1600, 1150);
        Product product8 = productCatalog1.newProduct("Wide-Format Plotter Paper", 720, 1650, 1185);
        Product product9 = productCatalog1.newProduct("Document Lamination Sheets", 600, 1400, 1000);
        Product product10 = productCatalog1.newProduct("QuickBind Plastic Comb Binders", 610, 1450, 1030);
        business.getSupplierPerformanceReport(String.valueOf(supplier1));

        // Supplier 2 - Apple
        Supplier supplier2 = business.getSupplierDirectory().newSupplier("OfficeSupplies Hub");
        ProductCatalog productCatalog2 = supplier2.getProductCatalog();
        Product product11 = productCatalog2.newProduct("Standard Copy Paper Ream", 1100, 2400, 1750);
        Product product12 = productCatalog2.newProduct("Glossy Presentation Paper", 950, 2300, 1625);
        Product product13 = productCatalog2.newProduct("Eco-Friendly Toner Cartridges", 850, 2200, 1525);
        Product product14 = productCatalog2.newProduct("Multi-Purpose Printer Ink", 800, 2100, 1450);
        Product product15 = productCatalog2.newProduct("Photo Matte Paper 5x7", 750, 2000, 1375);
        Product product16 = productCatalog2.newProduct("Large Capacity Ink Tanks", 700, 1900, 1300);
        Product product17 = productCatalog2.newProduct("Binding Machine Supplies", 600, 1800, 1200);
        Product product18 = productCatalog2.newProduct("Premium Envelopes 9x12", 550, 1700, 1125);
        Product product19 = productCatalog2.newProduct("Label Sheets (A4)", 500, 1600, 1050);
        Product product20 = productCatalog2.newProduct("Thermal Transfer Ribbon", 480, 1550, 1015);
        business.getSupplierPerformanceReport(String.valueOf(supplier2));

        // Supplier 3 - Google
        Supplier supplier3 = business.getSupplierDirectory().newSupplier("EcoPrint Solutions");
        ProductCatalog productCatalog3 = supplier3.getProductCatalog();
        Product product21 = productCatalog3.newProduct("Recycled Paper Packs", 1000, 2000, 1500);
        Product product22 = productCatalog3.newProduct("Eco-Safe Black Ink Cartridge", 950, 1950, 1450);
        Product product23 = productCatalog3.newProduct("Sustainable Toner Refills", 870, 1900, 1385);
        Product product24 = productCatalog3.newProduct("Plant-Based Printing Sheets", 830, 1850, 1340);
        Product product25 = productCatalog3.newProduct("Waterproof Labels", 790, 1800, 1295);
        Product product26 = productCatalog3.newProduct("Energy-Efficient Printer Kits", 740, 1750, 1245);
        Product product27 = productCatalog3.newProduct("Low-Waste Ribbon Cassettes", 690, 1700, 1195);
        Product product28 = productCatalog3.newProduct("Custom Stationery Stock", 650, 1650, 1150);
        Product product29 = productCatalog3.newProduct("Xerographic Developer Kits", 600, 1600, 1100);
        Product product30 = productCatalog3.newProduct("Eco-Friendly Highlighter Pens", 580, 1550, 1065);
        business.getSupplierPerformanceReport(String.valueOf(supplier3));

        // Supplier 4 - OnePlus
        Supplier supplier4 = business.getSupplierDirectory().newSupplier("ProPrint Supplies");
        ProductCatalog productCatalog4 = supplier4.getProductCatalog();
        Product product31 = productCatalog4.newProduct("Heavy-Duty Stapler Refill Kits", 1000, 2000, 1500);
        Product product32 = productCatalog4.newProduct("Photo Printing Sheets (A3)", 950, 1950, 1450);
        Product product33 = productCatalog4.newProduct("Color Laser Toner Set", 875, 1940, 1385);
        Product product34 = productCatalog4.newProduct("Premium Glossy Film Roll", 833, 1850, 1340);
        Product product35 = productCatalog4.newProduct("Document Folder Labels", 790, 1800, 1295);
        Product product36 = productCatalog4.newProduct("Compact Printer Lubricant", 740, 1750, 1245);
        Product product37 = productCatalog4.newProduct("Archival Quality Paper", 690, 1700, 1195);
        Product product38 = productCatalog4.newProduct("Wide-Format Canvas Roll", 650, 1650, 1150);
        Product product39 = productCatalog4.newProduct("Print Calibration Tools", 600, 1600, 1100);
        Product product40 = productCatalog4.newProduct("Secure Paper Shredder Bags", 580, 1550, 1065);
        business.getSupplierPerformanceReport(String.valueOf(supplier4));

        // Supplier 5 - Xiaomi
        Supplier supplier5 = business.getSupplierDirectory().newSupplier("All-In-One Printers Ltd");
        ProductCatalog productCatalog5 = supplier5.getProductCatalog();
        Product product41 = productCatalog5.newProduct("All-Purpose Copy Paper", 1000, 2000, 1500);
        Product product42 = productCatalog5.newProduct("Photo Paper Premium Pack", 950, 1950, 1450);
        Product product43 = productCatalog5.newProduct("Monochrome Toner Cartridge", 875, 1940, 1385);
        Product product44 = productCatalog5.newProduct("Refillable Ink Bottles", 833, 1850, 1340);
        Product product45 = productCatalog5.newProduct("High-Resolution Scan Films", 790, 1800, 1295);
        Product product46 = productCatalog5.newProduct("Presentation Binder Clips", 740, 1750, 1245);
        Product product47 = productCatalog5.newProduct("Advanced Cleaning Cartridge", 690, 1700, 1195);
        Product product48 = productCatalog5.newProduct("Print Alignment Sheets", 650, 1650, 1150);
        Product product49 = productCatalog5.newProduct("Borderless Printing Roll", 600, 1600, 1100);
        Product product50 = productCatalog5.newProduct("Custom Die-Cut Labels", 580, 1550, 1065);
        business.getSupplierPerformanceReport(String.valueOf(supplier5));

        //TOdo: Add more suppliers and products later
        //Customer 1 - John
        Person person1 = new Person("John");
        CustomerProfile customer1 = business.getCustomerDirectory().newCustomerProfile(person1);

        //Customer 2 - Jane
        Person person2 = new Person("Jane");
        CustomerProfile customer2 = business.getCustomerDirectory().newCustomerProfile(person2);

        //Customer 3 - Jack
        Person person3 = new Person("Jack");
        CustomerProfile customer3 = business.getCustomerDirectory().newCustomerProfile(person3);

        //Customer 4 - Jill
        Person person4 = new Person("Jill");
        CustomerProfile customer4 = business.getCustomerDirectory().newCustomerProfile(person4);

        //Customer 5 - Joe
        Person person5 = new Person("Joe");
        CustomerProfile customer5 = business.getCustomerDirectory().newCustomerProfile(person5);

        //Customer 6 - Jim
        Person person6 = new Person("Jim");
        CustomerProfile customer6 = business.getCustomerDirectory().newCustomerProfile(person6);

        //Customer 7 - peter
        Person person7 = new Person("Peter");
        CustomerProfile customer7 = business.getCustomerDirectory().newCustomerProfile(person7);

        //Customer 8 - Paul
        Person person8 = new Person("Paul");
        CustomerProfile customer8 = business.getCustomerDirectory().newCustomerProfile(person8);

        //Customer 9 - Mary
        Person person9 = new Person("Mary");
        CustomerProfile customer9 = business.getCustomerDirectory().newCustomerProfile(person9);

        //Customer 10 - Mark
        Person person10 = new Person("Mark");
        CustomerProfile customer10 = business.getCustomerDirectory().newCustomerProfile(person10);

        //SalesPerson 1 - Sam
        Person person11 = new Person("Sam");
        SalesPersonProfile salesPerson1 = business.getSalesPersonDirectory().newSalesPersonProfile(person11);
        UserAccount userAccount1 = business.getUserAccountDirectory().newUserAccount(salesPerson1, "sam", "sam123");

        //SalesPerson 2 - Sally
        Person person12 = new Person("Sally");
        SalesPersonProfile salesPerson2 = business.getSalesPersonDirectory().newSalesPersonProfile(person12);
        UserAccount userAccount2 = business.getUserAccountDirectory().newUserAccount(salesPerson2, "sally", "sally123");

        //SalesPerson 3 - Steve
        Person person13 = new Person("Steve");
        SalesPersonProfile salesPerson3 = business.getSalesPersonDirectory().newSalesPersonProfile(person13);
        UserAccount userAccount3 = business.getUserAccountDirectory().newUserAccount(salesPerson3, "steve", "steve123");

        //MarketingPerson 1 - Mike
        Person person14 = new Person("Mike");
        MarketingPersonProfile marketingPerson1 = business.getMarketingPersonDirectory().newMarketingPersonProfile(person14);
        UserAccount userAccount4 = business.getUserAccountDirectory().newUserAccount(marketingPerson1, "mike", "mike123");

        //MarketingPerson 2 - Mary
        Person person15 = new Person("Mary");
        MarketingPersonProfile marketingPerson2 = business.getMarketingPersonDirectory().newMarketingPersonProfile(person15);
        UserAccount userAccount5 = business.getUserAccountDirectory().newUserAccount(marketingPerson2, "mary", "mary123");

        //Order 1
        Order order1 = business.getMasterOrderList().newOrder(customer1, salesPerson1);
        OrderItem orderItem1 = order1.newOrderItem(product1, 1550, 1); // Above target
        OrderItem orderItem2 = order1.newOrderItem(product11, 1700, 1); // Above target
        OrderItem orderItem3 = order1.newOrderItem(product21, 2300, 1); // Below target

//Order 2
        Order order2 = business.getMasterOrderList().newOrder(customer2, salesPerson2);
        OrderItem orderItem4 = order2.newOrderItem(product2, 1900, 1); // Above target
        OrderItem orderItem5 = order2.newOrderItem(product12, 2175, 1); // Above target
        OrderItem orderItem6 = order2.newOrderItem(product22, 1450, 1); // Below target

//Order 3
        Order order3 = business.getMasterOrderList().newOrder(customer3, salesPerson3);
        OrderItem orderItem7 = order3.newOrderItem(product3, 1300, 1); // Above target
        OrderItem orderItem8 = order3.newOrderItem(product13, 2009, 1); // Above target
        OrderItem orderItem9 = order3.newOrderItem(product23, 1500, 1); // Below target

//Order 4
        Order order4 = business.getMasterOrderList().newOrder(customer4, salesPerson1);
        OrderItem orderItem10 = order4.newOrderItem(product4, 1000, 1); // Above target
        OrderItem orderItem11 = order4.newOrderItem(product14, 2060, 1); // Above target
        OrderItem orderItem12 = order4.newOrderItem(product24, 1375, 1); // Below target

//Order 5
        Order order5 = business.getMasterOrderList().newOrder(customer5, salesPerson2);
        OrderItem orderItem13 = order5.newOrderItem(product5, 1400, 1); // Above target
        OrderItem orderItem14 = order5.newOrderItem(product15, 1870, 1); // Above target
        OrderItem orderItem15 = order5.newOrderItem(product25, 1250, 1); // Below target

//Order 6
        Order order6 = business.getMasterOrderList().newOrder(customer6, salesPerson3);
        OrderItem orderItem16 = order6.newOrderItem(product6, 1375, 1); // Above target
        OrderItem orderItem17 = order6.newOrderItem(product16, 1100, 1); // Above target
        OrderItem orderItem18 = order6.newOrderItem(product26, 1150, 1); // Below target

//Order 7
        Order order7 = business.getMasterOrderList().newOrder(customer7, salesPerson1);
        OrderItem orderItem19 = order7.newOrderItem(product7, 1650, 1); // Above target
        OrderItem orderItem20 = order7.newOrderItem(product17, 1150, 1); // Above target
        OrderItem orderItem21 = order7.newOrderItem(product27, 1250, 1); // Below target

//Order 8
        Order order8 = business.getMasterOrderList().newOrder(customer8, salesPerson2);
        OrderItem orderItem22 = order8.newOrderItem(product8, 1250, 1); // Above target
        OrderItem orderItem23 = order8.newOrderItem(product18, 950, 1); // Above target
        OrderItem orderItem24 = order8.newOrderItem(product28, 1500, 1); // Below target

//Order 9
        Order order9 = business.getMasterOrderList().newOrder(customer9, salesPerson3);
        OrderItem orderItem25 = order9.newOrderItem(product9, 1000, 1); // Above target
        OrderItem orderItem26 = order9.newOrderItem(product19, 600, 1); // Above target
        OrderItem orderItem27 = order9.newOrderItem(product29, 1350, 1); // Below target

//Order 10
        Order order10 = business.getMasterOrderList().newOrder(customer10, salesPerson1);
        OrderItem orderItem28 = order10.newOrderItem(product10, 1010, 1); // Above target
        OrderItem orderItem29 = order10.newOrderItem(product20, 400, 1); // Above target
        OrderItem orderItem30 = order10.newOrderItem(product30, 1250, 1); // Below target

//        10 more orders
        Order order11 = business.getMasterOrderList().newOrder(customer1, salesPerson2);
        OrderItem orderItem31 = order11.newOrderItem(product31, 1550, 1); // Above target
        OrderItem orderItem32 = order11.newOrderItem(product41, 1700, 1); // Above target
        OrderItem orderItem33 = order11.newOrderItem(product1, 2300, 1); // Below target

        Order order12 = business.getMasterOrderList().newOrder(customer2, salesPerson3);
        OrderItem orderItem34 = order12.newOrderItem(product32, 1900, 1); // Above target
        OrderItem orderItem35 = order12.newOrderItem(product42, 2175, 1); // Above target
        OrderItem orderItem36 = order12.newOrderItem(product2, 1450, 1); // Below target

        Order order13 = business.getMasterOrderList().newOrder(customer3, salesPerson1);
        OrderItem orderItem37 = order13.newOrderItem(product33, 1300, 1); // Above target
        OrderItem orderItem38 = order13.newOrderItem(product43, 2009, 1); // Above target
        OrderItem orderItem39 = order13.newOrderItem(product3, 1500, 1); // Below target

        Order order14 = business.getMasterOrderList().newOrder(customer4, salesPerson2);
        OrderItem orderItem40 = order14.newOrderItem(product34, 1000, 1); // Above target
        OrderItem orderItem41 = order14.newOrderItem(product44, 2060, 1); // Above target
        OrderItem orderItem42 = order14.newOrderItem(product4, 1375, 1); // Below target

        Order order15 = business.getMasterOrderList().newOrder(customer5, salesPerson3);
        OrderItem orderItem43 = order15.newOrderItem(product35, 1400, 1); // Above target
        OrderItem orderItem44 = order15.newOrderItem(product45, 1870, 1); // Above target
        OrderItem orderItem45 = order15.newOrderItem(product5, 1250, 1); // Below target

        Order order16 = business.getMasterOrderList().newOrder(customer6, salesPerson1);
        OrderItem orderItem46 = order16.newOrderItem(product36, 1375, 1); // Above target
        OrderItem orderItem47 = order16.newOrderItem(product46, 1100, 1); // Above target
        OrderItem orderItem48 = order16.newOrderItem(product6, 1150, 1); // Below target

        Order order17 = business.getMasterOrderList().newOrder(customer7, salesPerson2);
        OrderItem orderItem49 = order17.newOrderItem(product37, 1650, 1); // Above target
        OrderItem orderItem50 = order17.newOrderItem(product47, 1150, 1); // Above target
        OrderItem orderItem51 = order17.newOrderItem(product7, 1250, 1); // Below target

        Order order18 = business.getMasterOrderList().newOrder(customer8, salesPerson3);
        OrderItem orderItem52 = order18.newOrderItem(product38, 1250, 1); // Above target
        OrderItem orderItem53 = order18.newOrderItem(product48, 950, 1); // Above target
        OrderItem orderItem54 = order18.newOrderItem(product8, 1500, 1); // Below target

        Order order19 = business.getMasterOrderList().newOrder(customer9, salesPerson1);
        OrderItem orderItem55 = order19.newOrderItem(product39, 1000, 1); // Above target
        OrderItem orderItem56 = order19.newOrderItem(product49, 600, 1); // Above target
        OrderItem orderItem57 = order19.newOrderItem(product9, 1350, 1); // Below target

        Order order20 = business.getMasterOrderList().newOrder(customer10, salesPerson2);
        OrderItem orderItem58 = order20.newOrderItem(product40, 1010, 1); // Above target
        OrderItem orderItem59 = order20.newOrderItem(product50, 400, 1); // Above target
        OrderItem orderItem60 = order20.newOrderItem(product10, 1250, 1); // Below target

        return business;
    }
}
