package com.e.androidretailapp.model;

public class Product {

    private String ProductID;
    private String ProductName;
    private String ProductDescription;
    private String ProductUses;
    private String ProductManufacture;
    private String ProductPrices;
    private String ProductQuantity;


    public Product(String productName, String productDescription, String productUses, String productManufacture, String productPrices, String productQuantity) {
        ProductName = productName;
        ProductDescription = productDescription;
        ProductUses = productUses;
        ProductManufacture = productManufacture;
        ProductPrices = productPrices;
        ProductQuantity = productQuantity;
    }


    public String getProductQuantity() {
        return ProductQuantity;
    }

    public void setProductQuantity(String productQuantity) {
        ProductQuantity = productQuantity;
    }

    public String getProductPrices() {
        return ProductPrices;
    }

    public void setProductPrices(String productPrices) {
        ProductPrices = productPrices;
    }

    public String getProductManufacture() {
        return ProductManufacture;
    }

    public void setProductManufacture(String productManufacture) {
        ProductManufacture = productManufacture;
    }

    public String getProductUses() {
        return ProductUses;
    }

    public void setProductUses(String productUses) {
        ProductUses = productUses;
    }

    public String getProductDescription() {
        return ProductDescription;
    }

    public void setProductDescription(String productDescription) {
        ProductDescription = productDescription;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String productID) {
        ProductID = productID;
    }
}
