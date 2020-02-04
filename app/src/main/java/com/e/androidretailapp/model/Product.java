package com.e.androidretailapp.model;

public class Product {
    private String productName;
    private String productModel;
    private String productQuantity;
    private String productCategory;
    private String prdouctCode;

    public Product(String productName, String productModel, String productQuantity, String productCategory, String prdouctCode) {
        this.productName = productName;
        this.productModel = productModel;
        this.productQuantity = productQuantity;
        this.productCategory = productCategory;
        this.prdouctCode = prdouctCode;
    }

    public String getPrdouctCode() {
        return prdouctCode;
    }

    public void setPrdouctCode(String prdouctCode) {
        this.prdouctCode = prdouctCode;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(String productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getProductModel() {
        return productModel;
    }

    public void setProductModel(String productModel) {
        this.productModel = productModel;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
